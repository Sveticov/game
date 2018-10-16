package com.svetikov.game.controller;


import com.svetikov.game.model.ResponseCard;
import com.svetikov.game.sevice.ServiceGame;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

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

    @GetMapping("/card/backend/{name_card}")
    public ResponseEntity<ResponseCard> cardBackEnd(@PathVariable("name_card") String name_card) {

        String myCard = serviceGame.initializerCard(name_card);
        String randomCard = serviceGame.card();
        String randomCard_look = randomCard + "_be";
        String status = serviceGame.battle(myCard,randomCard_look);

        return ResponseEntity.ok(new ResponseCard(myCard, randomCard + "_pc", status));
    }

}
