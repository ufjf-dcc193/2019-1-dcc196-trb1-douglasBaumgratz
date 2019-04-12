package br.ufjf.dcc193.ongplus;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController{
    @RequestMapping({"", "index.html"})
    public String home(){
        return "home";
    }

    @RequestMapping("sede.html")
    public String sede(){
        return "sede";
    }

    @RequestMapping("membro.html")
    public String membro(){
        return "membro";
    }

    @RequestMapping("atividade.html")
    public String atividade(){
        return "atividade";
    }

    @RequestMapping("relatorio.html")
    public String relatorio(){
        return "relatorio";
    }

    @RequestMapping("sede_form.html")
    public String sede_form(){
        return "sede_form";
    }

    @RequestMapping("membro_form.html")
    public String membro_form(){
        return "membro_form";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form(){
        return "atividade_form";
    }
}