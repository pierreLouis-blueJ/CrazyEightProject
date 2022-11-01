package game;
import java.util.LinkedList;
import java.util.Random;
import java.util.Queue;
import java.util.PriorityQueue;



public class Deck {

    //protected static LinkedList<Card> pioche = new LinkedList<Card>();
    private final String [] names = {"ACE", "KING", "QUEEN", "JACK", "TEN", "NINE", "EIGHT", "SEVEN","SIX", "FIVE", "FOUR", "THREE", "TWO"}; // les 8 valeurs constantes
    private final String [] colors = {"HEARTS", "DIAMONDS", "CLUBS", "SPADES"}; // les 4 couleurs constantes
    private static Random random = new Random();
    
    protected LinkedList<Card> deckCreation(){ // création des 32 cartes et ne retourne rien
        LinkedList<Card> pioche = new LinkedList<Card>();
        for(String nom : names){ // parcours des valeurs constantes
            for(String couleur : colors){ 
                Card carte = new Card(nom, couleur); // appel à la classe Card pour créer un objet Carte
                pioche.add(carte); // et l'ajouter au deck
            }
        }
        return pioche;
    }

    
    protected Queue<Card> ArrayToQueue(LinkedList<Card> deck){
        Queue<Card> finalDeck = new PriorityQueue<Card>(); //empty
        while(!deck.isEmpty()){
            int x = random.nextInt(deck.size()-1);
            finalDeck.add(deck.get(x));
            deck.remove(x);
        } 
        return finalDeck;
    }

   



}
