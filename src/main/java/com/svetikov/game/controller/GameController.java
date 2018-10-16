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


//        if (name_card.equals(Cards.PAPER.getCode())) {
//            myCard = Cards.PAPER.getCode();
//        }
//        if (name_card.equals(Cards.SCISSORS.getCode())) {
//            myCard = Cards.SCISSORS.getCode();
//        }
//        if (name_card.equals(Cards.ROCK.getCode())) {
//            myCard = Cards.ROCK.getCode();
//        }



        //batel
//        if (myCard.equals(randomCard_look)) {
//            status = "draw";
//            status_vin = false;
//        }
//
//        if (!myCard.equals(randomCard_look)) {
//            if (myCard.equals(Cards.PAPER.getCode()) && randomCard.equals(Cards.ROCK.getCode())) {
//                status = "I'am vine";
//                status_vin = false;
//            }
//            if (myCard.equals(Cards.ROCK.getCode()) && randomCard_look.equals(Cards.SCISSORS.getCode())) {
//                status = "I'am vine";
//                status_vin = false;
//            }
//            if (myCard.equals(Cards.SCISSORS.getCode()) && randomCard_look.equals(Cards.PAPER.getCode())) {
//                status = "I'am vine";
//                status_vin = false;
//            }
//
//        }
//        if (status_vin) {
//            status = "FALL";
//        }


        return ResponseEntity.ok(new ResponseCard(myCard, randomCard + "_pc", status));
    }

}
