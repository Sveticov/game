package com.svetikov.game.model;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class ResponseCard {
    private String nameCardMy;
    private String nameCardComp;
    private String status_game;
}
