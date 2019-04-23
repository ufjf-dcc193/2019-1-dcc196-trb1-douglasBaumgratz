package br.ufjf.dcc193.ongplus.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.ongplus.Models.Atividade;
import br.ufjf.dcc193.ongplus.Models.Membro;
import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.AtividadeRepository;
import br.ufjf.dcc193.ongplus.Persistence.MembroRepository;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

/**
 * SedeController
 */
@Controller
public class SedeController {
    @Autowired
    SedeRepository sedes;
    @Autowired
    AtividadeRepository atividades;
    @Autowired
    MembroRepository membros;

    @RequestMapping("sede.html")
    public String sede(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "sede/sede";
    }

    @RequestMapping("sede_form.html")
    public String sede_form() {
        return "sede/sede_form";
    }

    @RequestMapping("cadastrar_sede.html")
    public RedirectView cadastrar_sede(Sede sede) {
        sedes.save(sede);
        return new RedirectView("sede.html");
    }

    @RequestMapping("sede_editar.html")
    public ModelAndView carrega_sede_editar(Sede sede) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sede", sedes.getOne(sede.getId()));
        mv.setViewName("sede/sede_editar");
        return mv;
    }

    @RequestMapping("sede_alterar.html")
    public RedirectView alterar(Sede s) {
        sedes.save(s);
        return new RedirectView("sede.html");
    }

    @RequestMapping("sede_excluir.html")
    public ModelAndView excluir_sede(Sede s) {
        Sede sede = sedes.getOne(s.getId());
        ModelAndView mv = new ModelAndView();
        sede.getAtividades().clear();
        List<Atividade> a = atividades.findAll();
        for (Atividade atividade : a) {
            if (atividade.getSede().getId() == sede.getId()) {
                atividades.deleteById(atividade.getId());
            }
        }
        List<Membro> m = membros.findAll();
        for (Membro membro : m) {
            if (membro.getSede().getId() == sede.getId()) {
                membros.deleteById(membro.getId());
            }
        }
        sedes.deleteById(s.getId());
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("sede/sede");
        return mv;
    }

    @RequestMapping("relatorio.html")
    public ModelAndView relatorio(Model model) {
        ModelAndView mv = new ModelAndView();
        mv.setViewName("relatorio/relatorio");
        model.addAttribute("relatorio", sedes.findAll());
        return mv;
    }
}