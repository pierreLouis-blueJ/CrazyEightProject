package game;
import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.stream.*;
import java.util.Arrays;



public class Deck {

    private static LinkedList<Card> deck;
    private static final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN","SIX", "FIVE", "FOUR", "THREE", "TWO"}; // les 8 valeurs constantes
    private static final String [] colors = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"}; // les 4 couleurs constantes
    private static Random random = new Random();

    
    public static LinkedList<Card> deckCreation(){
        LinkedList<Card> deck = new LinkedList<Card>();
        for(String nom : names){ // parcours des valeurs constantes
            for(String couleur : colors){ 
                Card carte = new Card(nom, couleur); // appel à la classe Card pour créer un objet Carte
                deck.add(carte); // et l'ajouter au deck
            }
        }
        LinkedList<Card> finalDeck = new LinkedList<Card>(); //empty
        while(!deck.isEmpty()){
            int index = random.nextInt(deck.size());
            finalDeck.add(deck.get(index));
            deck.remove(index);
        } 
        deck = finalDeck;
        return finalDeck;
    }

    protected static Card getTopCard(){
        Card topCard = deck.get(deck.size()-1);
        deck.remove(deck.size()-1);

        return topCard;
    }
   



}
