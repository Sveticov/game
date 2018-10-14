package com.svetikov.game.sevice;

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
}
