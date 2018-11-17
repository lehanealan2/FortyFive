package apackage.fortyfive;

import static java.lang.Math.floorDiv;

public class Card {

    private static Integer number;
    private static Suit suit;

    public Card(Integer cardNo){
        Integer number = cardNo%13;
    }
}