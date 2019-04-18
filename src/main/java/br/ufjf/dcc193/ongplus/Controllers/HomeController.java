package br.ufjf.dcc193.ongplus.Controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {

    @RequestMapping({ "", "index.html" })
    public String home() {
        return "home";
    }

    @RequestMapping("sobre.html")
    public String sobre() {
        return "sobre";
    }
    
}