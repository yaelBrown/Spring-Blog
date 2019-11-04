package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MathController {

    @GetMapping("/add/{n1}/{n2}")
    @ResponseBody
    public String add(@PathVariable String n1, @PathVariable String n2) {
        return String.valueOf(Integer.parseInt(n1) + Integer.parseInt(n2));
    }

    @GetMapping("/subtract/{n1}/{n2}")
    @ResponseBody
    public String subtract(@PathVariable String n1, @PathVariable String n2) {
        return String.valueOf(Integer.parseInt(n1) - Integer.parseInt(n2));
    }

    @GetMapping("/multiply/{n1}/{n2}")
    @ResponseBody
    public String multiply(@PathVariable String n1, @PathVariable String n2) {
        return String.valueOf(Integer.parseInt(n1) * Integer.parseInt(n2));
    }

    @GetMapping("/divide/{n1}/{n2}")
    @ResponseBody
    public String divide(@PathVariable String n1, @PathVariable String n2) {
        return String.valueOf(Integer.parseInt(n1) / Integer.parseInt(n2));
    }








}
