package br.ufjf.dcc193.ongplus.Controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

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
    public RedirectView cadastrar_atividade(Atividade atividade) {
        atividades.save(atividade);
        addAtividadeSede(atividade);
        return new RedirectView("atividade.html");
    }

    @RequestMapping(value = { "/editar_atividade" }, method = RequestMethod.GET)
    public ModelAndView carrega_sede_editar(@RequestParam(value = "id", required = true) Long id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("atividade", atividades.getOne(id));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("atividade/atividade_editar");
        return mv;
    }

    @RequestMapping("atividade_alterar.html")
    public RedirectView alterar(Atividade atividade) {
        atividades.save(atividade);
        addAtividadeSede(atividade);
        return new RedirectView("atividade.html");
    }

    public void addAtividadeSede(Atividade atividade) {
        Sede sede = atividade.getSede();
        sede.getAtividades().add(atividade);
        sedes.save(sede);
    }
}