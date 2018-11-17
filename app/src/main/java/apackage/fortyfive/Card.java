package apackage.fortyfive;

import static java.lang.Math.floorDiv;

class Card {

    private static Integer number;
    private static Suit suit;

    Card(Integer cardNo){
        number = cardNo%13;
        Double suitNo = Math.floor(cardNo/13);
        suit = Suit.parse(suitNo.intValue());
    }

    Integer getNumber(){
        return number;
    }

    Suit getSuit(){
        return suit;
    }
}