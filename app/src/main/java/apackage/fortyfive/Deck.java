package apackage.fortyfive;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Deck {

    private List<Integer> deck;

    Deck(){
        deck = new ArrayList<>();

        for(int i=0;i<52;i++){
            deck.add(i);
        }

        Collections.shuffle(deck);
    }

    Card draw(){
        Integer cardNo = deck.get(0);

        deck.remove(0);

        return new Card(cardNo);
    }
}
