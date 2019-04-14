package br.ufjf.dcc193.ongplus;

import br.ufjf.dcc193.ongplus.sede.Sede;
import br.ufjf.dcc193.ongplus.sede.SedeRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @Autowired
    SedeRepository sede;

    /*
     * Chamadas para páginas principais
     */
    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping("sede.html")
    public String sede(Model model) {
        model.addAttribute("sede", sede.findAll());
        return "sede/sede";
    }

    @RequestMapping("membro.html")
    public String membro(Model model) {
        return "membro/membro";
    }

    @RequestMapping("atividade.html")
    public String atividade(Model model) {
        return "atividade/atividade";
    }

    @RequestMapping("relatorio.html")
    public String relatorio() {
        return "relatorio/relatorio";
    }

    /*
     * Chamadas para formulários
     */
    @RequestMapping("sede_form.html")
    public String sede_form() {
        return "sede/sede_form";
    }

    @RequestMapping("membro_form.html")
    public String membro_form(Model model) {
        model.addAttribute("sede", sede.findAll());
        return "membro/membro_form";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form(Model model) {
        model.addAttribute("sede", sede.findAll());
        return "atividade/atividade_form";
    }

    /*
     * Chamadas para cadastros
     */
    @RequestMapping("cadastrar_sede.html")
    public String cadastrar_sede(String nome_fantasia, String estado, String cidade, String bairro, int telefone,
            String endereco) {
        sede.save(new Sede(nome_fantasia, estado, cidade, bairro, telefone, endereco));
        return "sede/sede_form";
    }

    /*
     * Chamadas para excluir
     */
    @RequestMapping("excluir_sede.html")
    public String excluir_sede(Long id) {
        sede.deleteById(id);
        return "sede/sede_form";
    }

}