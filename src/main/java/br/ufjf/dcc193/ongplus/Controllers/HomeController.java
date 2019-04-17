package br.ufjf.dcc193.ongplus.Controllers;

// import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
// import org.springframework.web.bind.annotation.RequestMethod;
// import org.springframework.web.bind.annotation.RequestParam;
// import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;
import br.ufjf.dcc193.ongplus.Persistence.MembroRepository;
import br.ufjf.dcc193.ongplus.Persistence.AtividadeRepository;
import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Models.Membro;
import br.ufjf.dcc193.ongplus.Models.Atividade;

@Controller
public class HomeController {
    @Autowired
    SedeRepository sede;
    @Autowired
    MembroRepository membro;
    @Autowired
    AtividadeRepository atividade;

    /*
     * Páginas principais
     */
    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }
    
    @RequestMapping("sobre.html")
    public String sobre() {
        return "sobre";
    }


    @RequestMapping("membro.html")
    public String membro(Model model) {
        model.addAttribute("membro", membro.findAll());
        return "membro/membro";
    }

    @RequestMapping("atividade.html")
    public String atividade(Model model) {
        model.addAttribute("atividade", atividade.findAll());
        return "atividade/atividade";
    }

    @RequestMapping("relatorio.html")
    public String relatorio() {
        return "relatorio/relatorio";
    }
    /*
     * Formulários
     */

    @RequestMapping("membro_form.html")
    public String membro_form(Model model) {
        model.addAttribute("membro", membro.findAll());
        return "membro/membro_form";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form(Model model) {
        model.addAttribute("sede", sede.findAll());
        return "atividade/atividade_form";
    }

    /*
     * CREATE
     */

    @RequestMapping("cadastrar_membro.html")
    public String cadastrar_membro(Sede sede, String nome, String funcao, String email, String data_entrada,
            String data_saida) {
        membro.save(new Membro(sede, nome, funcao, email, data_entrada, data_saida));
        return "membro/membro_form";
    }

    @RequestMapping("cadastrar_atividade.html")
    public String cadastrar_atividade(Sede sede, String titulo, String descricao, String data_inicio, String data_fim,
            Float total_horas) {
        atividade.save(new Atividade(sede, titulo, descricao, data_inicio, data_fim, total_horas));
        return "atividade/atividade_form";
    }

    /*
     * UPDATE
     */

    @RequestMapping("editar_membro.html")
    public String editar_membro(Long id) {
        return "membro/membro_form";
    }

    @RequestMapping("editar_atividade.html")
    public String editar_atividade(Long id) {
        return "atividade/atividade_form";
    }

    /*
     * DELETE
     */

}