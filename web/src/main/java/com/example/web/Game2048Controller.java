package com.example.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Game2048Controller {

    @GetMapping("/")
    public String index() {
        return "redirect:/2048.html";
    }

    @GetMapping("/2048")
    public String game2048() {
        return "redirect:/2048.html";
    }
}
