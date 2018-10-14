package com.svetikov.game.sevice;

import org.springframework.stereotype.Service;


import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Service
public class ServiceGame {

    List<String> cards = Arrays.asList("rock", "paper", "scissors", "scissors","rock", "paper","rock", "paper", "scissors");
    Random rnd = new Random();
    public String card() {

        int h1=rnd.nextInt(9);
        int h2=rnd.nextInt(9);
        int h3=Math.round((h1+h2)/2);
        return cards.get(h3);
    }
}
