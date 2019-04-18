package br.ufjf.dcc193.ongplus.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

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
    public String cadastrar_membro(Membro membro) {
        membros.save(membro);
        return "membro/membro_form";
    }

    @RequestMapping(value = { "/editar_membro" }, method = RequestMethod.GET)
    public ModelAndView carrega_membro_editar(@RequestParam(value = "id", required = true) Long id) {        
        ModelAndView mv = new ModelAndView();
        mv.addObject("membro", membros.getOne(id));
        mv.addObject("sede", sedes.findAll());
        mv.setViewName("membro/membro_editar");
        return mv;
    }

}