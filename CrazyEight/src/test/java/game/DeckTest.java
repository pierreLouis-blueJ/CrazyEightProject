package game;

import java.util.Set;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ArrayList;
import java.util.Queue;
import java.util.PriorityQueue;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

public class DeckTest {

    
    /** deckGenerator Tests */
    @Test
    void deckGeneratorHas52Cards() {
        Deck newDeck = new Deck();
        
        assertEquals(52, newDeck.deckGenerator().size());

    }

    @Test
    void isHeartSevenExist(){
        Deck newDeck = new Deck();
        
        Card HeartSeven = new Card("SEVEN", "HEARTS");

        assertTrue(newDeck.deckGenerator().contains(HeartSeven));
    }

    @Test
    void cardsAreUnique(){
        Deck newDeck = new Deck();
        Set<Card> s =new HashSet<Card>((newDeck.deckGenerator()));

        assertTrue(s.size()== newDeck.deckGenerator().size());
    }

    @Test
    void sameSizeBetweenListAndQueue() {
        Deck newDeck = new Deck();
        
        assertEquals(52, deck.size());

    } 
}
