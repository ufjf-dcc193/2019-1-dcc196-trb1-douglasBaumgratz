package br.ufjf.dcc193.ongplus;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping("sede.html")
    public String sede(Model model) {
        Sede sede1 = new Sede("MVX", "MG", "Juiz de Fora", "Centro", 999454391, "Rua Assis Lima");
        model.addAttribute("sede1", sede1);        
        return "sede";
    }

    @RequestMapping("membro.html")
    public String membro(Model model) {
        return "membro";
    }

    @RequestMapping("atividade.html")
    public String atividade(Model model) {
        return "atividade";
    }

    @RequestMapping("relatorio.html")
    public String relatorio() {
        return "relatorio";
    }

    /*
     * Formulários
     */
    @RequestMapping("sede_form.html")
    public String sede_form() {
        // ConfigurableApplicationContext ctx =
        // SpringApplication.run(MainApplication.class, args);
        // SedeRepository rep = ctx.getBean(SedeRepository.class);
        // rep.save(new Sede("a","b","c","d",1,"3"));
        // rep.save(new Sede("a","b","c","d",1,"3"));
        // System.out.println("foi"+rep.findAll().toString());
        return "sede_form";
    }

    @RequestMapping("membro_form.html")
    public String membro_form() {
        return "membro_form";
    }

    @RequestMapping("atividade_form.html")
    public String atividade_form() {
        return "atividade_form";
    }

    @RequestMapping("cadastrar_sede.html")
    public String cadastrar_sede() {

        // ConfigurableApplicationContext ctx;
        // SedeRepository rep = ctx.getBean(SedeRepository.class);
        // rep.save(new Sede("a","b","c","d",1,"3"));
        // rep.save(new Sede("a","b","c","d",1,"3"));
        // System.out.println("TAMANHO é: "+rep.findAll().size());
        // System.out.println("cadastrar_site");
        return "sede_form";

    }

}