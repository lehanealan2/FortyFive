package apackage.fortyfive;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {

    @Test
    public void DeckAllDraw(){
        Deck deck = new Deck();
        for(int i=0;i<52;i++){
            Card card = deck.draw();
            System.out.println(card.getNumber()+" of "+card.getSuit());
        }
    }
}