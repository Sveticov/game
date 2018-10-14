package com.svetikov.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class PageController {

    @GetMapping("/game")
    public String pageGame(Model model) {

        return "game";
    }

}
