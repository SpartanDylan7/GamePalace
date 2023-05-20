package com.spartan.gamepalace;

import java.util.Random;

public enum Cards {
    TWO,
    THREE,
    FOUR,
    FIVE,
    SIX,
    SEVEN,
    EIGHT,
    NINE,
    TEN,
    JACK,
    KING,
    QUEEN,
    ACE;
//picks a card out of the deck
    public static Cards getCard(){
        Random random = new Random();
        int i = random.nextInt(13);
        Cards[] values = Cards.values();
        return values[i];

    }
}
