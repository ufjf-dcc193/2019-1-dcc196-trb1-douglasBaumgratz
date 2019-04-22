package br.ufjf.dcc193.ongplus.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import br.ufjf.dcc193.ongplus.Models.Membro;
import br.ufjf.dcc193.ongplus.Persistence.MembroRepository;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

/**
 * MembroController
 */
@Controller
public class MembroController {
    @Autowired
    MembroRepository membros;
    @Autowired
    SedeRepository sedes;
    
    @RequestMapping("membro.html")
    public String membro(Model model) {
        model.addAttribute("membro", membros.findAll());
        return "membro/membro";
    }

    @RequestMapping("membro_form.html")
    public String membro_form(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "membro/membro_form";
    }

    @RequestMapping("cadastrar_membro.html")
    public RedirectView cadastrar_membro(Membro membro) {
        membros.save(membro);
        return new RedirectView("membro.html");
    }

    @RequestMapping("membro_editar.html")
    public ModelAndView carrega_membro_editar(Membro membro) {        
        ModelAndView mv = new ModelAndView();
        mv.addObject("membro", membros.getOne(membro.getId()));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("membro/membro_editar");
        return mv;
    }
    @RequestMapping("membro_alterar.html")
    public RedirectView alterar(Membro m) {
        membros.save(m);
        return new RedirectView("membro.html");
    }
}