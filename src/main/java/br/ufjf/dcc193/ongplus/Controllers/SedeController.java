package br.ufjf.dcc193.ongplus.Controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import br.ufjf.dcc193.ongplus.Models.Sede;
import br.ufjf.dcc193.ongplus.Persistence.SedeRepository;

/**
 * SedeController
 */
@Controller
public class SedeController {

    @Autowired
    SedeRepository sedes;

    @RequestMapping("sede.html")
    public String sede(Model model) {
        model.addAttribute("sede", sedes.findAll());
        return "sede/sede";
    }
    // @RequestMapping("sede.html")
    // public ModelAndView sede(Model model) {
    //     ModelAndView mv = new ModelAndView();
    //     mv.setViewName("sede");
    //     List<Sede> sed = sedes.findAll();
    //     mv.addObject("sede", sed);
    //     return mv;
    // }

    @RequestMapping("sede_form.html")
    public String sede_form() {
        return "sede/sede_form";
    }

    @RequestMapping("cadastrar_sede.html")
    public String cadastrar_sede(Sede sede) {
        sedes.save(sede);
        return "sede/sede_form";
    }

    @RequestMapping("editar_sede.html")
    public String editar_sede(Long id) {
        return "sede/sede_form";
    }

    @RequestMapping(value = { "/excluir" }, method = RequestMethod.GET)
    public ModelAndView excluir_sede(@RequestParam(value = "id", required = true) Long id) {
        sedes.deleteById(id);
        ModelAndView mv = new ModelAndView();
        List<Sede> sed = sedes.findAll();
        mv.addObject("sede", sed);
        mv.setViewName("sede/sede");
        return mv;
    }
}