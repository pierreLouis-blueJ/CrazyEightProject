package game;

import java.util.LinkedList;

public class Player {  
    private String name;
    private LinkedList<Card> handPlayer;

    protected Player(String name){
        this.name = name;
    }

    protected void play(){

    }

    public void getCard(int NB_CARD_DISTRIBUED){
        //for(int i = )
        this.handPlayer.add(Deck.getTopCard());
    } 
}
