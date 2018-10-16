package com.svetikov.game.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/game")
public class PageController {

    @GetMapping("")
    public String start(){
        return "start";
    }

    @GetMapping("/frontend")
    public String pageGame(Model model) {

        return "game";
    }

    @GetMapping("/backend")
    public String pageGameBackend(){
        return "game_backend";
    }

}
