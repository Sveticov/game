package com.svetikov.game.controller;

import com.svetikov.game.sevice.ServiceGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GameController {
    @Autowired
    private ServiceGame serviceGame;


    @GetMapping("/rec")
    public ResponseEntity<?> res() {
        String txt = "test rec";
        return ResponseEntity.ok(txt);
    }

    @GetMapping("/card")
    public ResponseEntity<String> card() {

        return ResponseEntity.ok(serviceGame.card());
    }
}
