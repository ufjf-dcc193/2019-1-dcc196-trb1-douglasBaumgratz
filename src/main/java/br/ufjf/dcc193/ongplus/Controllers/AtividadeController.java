package br.ufjf.dcc193.ongplus.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufjf.dcc193.ongplus.Models.Atividade;
import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.AtividadeRepository;

/**
 * AtividadeController
 */
@Controller
public class AtividadeController {

    @Autowired
    AtividadeRepository atividade;

    @RequestMapping("atividade.html")
    public String atividade(Model model) {
        model.addAttribute("atividade", atividade.findAll());
        return "atividade/atividade";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form(Model model) {
        return "atividade/atividade_form";
    }
    
    @RequestMapping("cadastrar_atividade.html")
    public String cadastrar_atividade(Sede sede, String titulo, String descricao, String data_inicio, String data_fim,
            Float total_horas) {
        atividade.save(new Atividade(sede, titulo, descricao, data_inicio, data_fim, total_horas));
        return "atividade/atividade_form";
    }

    @RequestMapping("editar_atividade.html")
    public String editar_atividade(Long id) {
        return "atividade/atividade_form";
    }

}