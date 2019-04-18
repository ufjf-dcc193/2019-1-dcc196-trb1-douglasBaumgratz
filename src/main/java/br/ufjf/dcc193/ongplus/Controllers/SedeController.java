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
 * SedeController
 */
@Controller
public class SedeController {
    @Autowired
    SedeRepository sedes;
    @Autowired
    AtividadeRepository atividades;

    @RequestMapping("sede.html")
    public String sede(Model model) {
        model.addAttribute("sede", sedes.findAll());

        //TODO: relatório
        List<Sede> sede = sedes.findAll();
        List<Atividade> atividade = atividades.findAll();
        int total=0;
        for (int i = 0; i < sede.size(); i++) {
            for (int j = 0; j < atividade.size(); j++) {
                if (sede.get(i).getNome_fantasia().equals(atividade.get(j).getSede().getNome_fantasia())) {
                    total = atividade.get(j).getTotal_horas();
                    System.out.println(
                        "Sede: "+ sede.get(i).getNome_fantasia() 
                        + " \nAtividade: "+atividade.get(j).getTitulo()
                        + " \nTOTAL: "+total);
                }
            }            
        }

        return "sede/sede";
    }

    @RequestMapping("sede_form.html")
    public String sede_form() {
        return "sede/sede_form";
    }

    @RequestMapping("cadastrar_sede.html")
    public String cadastrar_sede(Sede sede) {
        sedes.save(sede);
        return "sede/sede_form";
    }

    @RequestMapping(value = { "/editar_sede" }, method = RequestMethod.GET)
    public ModelAndView carrega_sede_editar(@RequestParam(value = "id", required = true) Long id) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("sede", sedes.getOne(id));
        mv.setViewName("sede/sede_editar");
        return mv;
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