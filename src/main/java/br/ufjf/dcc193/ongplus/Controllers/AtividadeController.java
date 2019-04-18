package br.ufjf.dcc193.ongplus.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
        // atividade.getSede().getAtividade().add(atividade);
        return "atividade/atividade_form";
    }

    @RequestMapping(value = { "/editar_atividade" }, method = RequestMethod.GET)
    public ModelAndView carrega_sede_editar(@RequestParam(value = "id", required = true) Long id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("atividade", atividades.getOne(id));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("atividade/atividade_editar");
        return mv;
    }

    @RequestMapping("relatorio.html")
    public String relatorio(Model model) {
        model.addAttribute("relatorio", atividades.findAll());
        // List<Sede> sede = sedes.findAll();
        // List<Atividade> atividade = atividades.findAll();
        
        // System.out.println("numero de atividades"+ sede.get(0).getAtividade().size());
        return "relatorio/relatorio";
    }
}