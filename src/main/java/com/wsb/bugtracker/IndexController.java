package com.wsb.bugtracker;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class IndexController {

    @GetMapping("/")
    public String index(
            @RequestParam(name="id")
            String id,
            Model model){
        model.addAttribute("name","myszojleń");
        double number = 12+32+23.2;
        model.addAttribute("number", number);
        model.addAttribute("id",id);
        return "index";
    }
}
