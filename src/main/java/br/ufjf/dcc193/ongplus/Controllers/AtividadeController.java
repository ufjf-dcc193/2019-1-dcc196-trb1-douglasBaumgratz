package br.ufjf.dcc193.ongplus.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import br.ufjf.dcc193.ongplus.Models.Atividade;
import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.AtividadeRepository;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

/**
 * AtividadeController
 */
@Controller
public class AtividadeController {
    @Autowired
    AtividadeRepository atividades;
    @Autowired
    SedeRepository sedes;

    @RequestMapping("atividade.html")
    public String atividade(Model model) {
        model.addAttribute("atividade", atividades.findAll());
        return "atividade/atividade";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "atividade/atividade_form";
    }
    
    @RequestMapping("cadastrar_atividade.html")
    public String cadastrar_atividade(Atividade atividade) {
        atividades.save(atividade);
        return "atividade/atividade_form";
    }

    @RequestMapping("editar_atividade.html")
    public String editar_atividade(Long id) {
        return "atividade/atividade_form";
    }

}