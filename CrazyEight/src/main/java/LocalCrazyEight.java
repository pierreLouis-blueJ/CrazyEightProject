import game.*;
import java.util.Set;
import java.util.LinkedList;

public class LocalCrazyEight {

    private Set<Player> initialPlayers;
    protected LinkedList<Card> cardPlayed;

    public static void main(String[] args){
        Deck newDeck = new Deck();
        for(Card card : newDeck.deckCreation()){
            System.out.println("" + Card.getName(card) + " " + Card.getColor(card));            
        }
        System.out.println(newDeck.deckCreation().size());
    }

    protected void cardsDistribution(){
        for(Player p : initialPlayers){
            p.getCard(7);
        }
    }

    
    protected void getCardPower(){

    }

    protected void initialisationPlayers(){

    }
}
