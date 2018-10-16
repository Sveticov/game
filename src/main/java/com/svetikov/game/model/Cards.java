package com.svetikov.game.model;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
public enum Cards {
    ROCK("rock_be"),
    SCISSORS("scissors_be"),
    PAPER("paper_be");
private String code;
    Cards(String code) {
        this.code=code;
    }
}
