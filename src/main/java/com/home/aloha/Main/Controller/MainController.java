package com.home.aloha.Main.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {
    
    @GetMapping(value="/")
    public String getMethodName(Model mv) {
        
        mv.addAttribute("test","안녕하세요");

        return "Main/main";
    }
    
}
