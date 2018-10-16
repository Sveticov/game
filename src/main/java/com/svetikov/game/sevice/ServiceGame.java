package com.svetikov.game.sevice;

import com.svetikov.game.model.Cards;
import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ServiceGame {

    List<String> cards = Arrays.asList("rock", "paper", "scissors", "scissors","rock", "paper", "scissors", "paper","rock");
    Random rnd = new Random();
    public String card() {

        int card1=rnd.nextInt(9);
        int card2=rnd.nextInt(9);
        int card3=rnd.nextInt(9);
        int commonCard=Math.round((card1+card2+card3)/3);
        return cards.get(commonCard);
    }

    public String initializerCard(String name_card){
        String myCard="";

        if (name_card.equals(Cards.PAPER.getCode())) {
            myCard = Cards.PAPER.getCode();
        }
        if (name_card.equals(Cards.SCISSORS.getCode())) {
            myCard = Cards.SCISSORS.getCode();
        }
        if (name_card.equals(Cards.ROCK.getCode())) {
            myCard = Cards.ROCK.getCode();
        }

        return myCard;
    }

    public String battle(String myCard,String randomCard_look){

        String status="empty";
        boolean status_vin=true;

        if (myCard.equals(randomCard_look)) {
            status = "draw";
            status_vin = false;
        }

        if (!myCard.equals(randomCard_look)) {
            if (myCard.equals(Cards.PAPER.getCode()) && randomCard_look.equals(Cards.ROCK.getCode())) {
                status = "I'am vine";
                status_vin = false;
            }
            if (myCard.equals(Cards.ROCK.getCode()) && randomCard_look.equals(Cards.SCISSORS.getCode())) {
                status = "I'am vine";
                status_vin = false;
            }
            if (myCard.equals(Cards.SCISSORS.getCode()) && randomCard_look.equals(Cards.PAPER.getCode())) {
                status = "I'am vine";
                status_vin = false;
            }

        }
        if (status_vin) {
            status = "FALL";
        }

        return status;
    }
}
