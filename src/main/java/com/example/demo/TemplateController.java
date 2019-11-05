package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Controller
public class TemplateController {

    @GetMapping("/template")
    // src/main/resources/templates/home.html
    public String welcome() {
        return "home";
    }

    @GetMapping("/template/{name}")
    public String hello(@PathVariable String name, Model model) {
        model.addAttribute("name", name);
        return "home";
    }
}