package game;
import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;
import java.util.PriorityQueue;
import java.util.stream.*;
import java.util.Arrays;



public class Deck {

    //protected Queue<Card> deck = deckShuffledAsQueue(deckGenerator());
    private static final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN","SIindex", "FIVE", "FOUR", "THREE", "TWO"}; // les 8 valeurs constantes
    private static final String [] colors = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"}; // les 4 couleurs constantes
    private static Random random = new Random();

    
    
    
    protected static LinkedList<Card> deckGenerator(){ // création des 32 cartes et ne retourne rien
        LinkedList<Card> deck = new LinkedList<Card>();
        for(String nom : names){ // parcours des valeurs constantes
            for(String couleur : colors){ 
                Card carte = new Card(nom, couleur); // appel à la classe Card pour créer un objet Carte
                deck.add(carte); // et l'ajouter au deck
            }
        }
        return deck;
    }

    
    protected static PriorityQueue<Card> deckShuffledAsQueue(LinkedList<Card> deck){
        PriorityQueue<Card> finalDeck = new PriorityQueue<Card>(); //empty
        while(!deck.isEmpty()){
            int index = random.nextInt(deck.size()-1);
            finalDeck.add(deck.get(index));
            deck.remove(index);
        } 
        return finalDeck;
    }


   



}
