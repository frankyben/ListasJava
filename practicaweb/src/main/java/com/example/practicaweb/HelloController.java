package com.example.practicaweb;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {

    @GetMapping("/")
    public String index(){
        //Spring buscará automáticamente un archivo llamado "index.html"
        // en la carpeta de recursos estáticos
        return "index.html";
    }
    
    
}
