package game;

public class Card {
    private String name; //name of the card
    private String color; //color of the card
    
    protected Card(String name, String color){ //constructeur qui récupère les informations données par les paramètres
        this.name = name; 
        this.color = color;
    }

    protected static String getName(Card card){
        return card.name;
    }

    protected static String getColor(Card card){
        return card.color;
    }

    @Override
    public boolean equals(Object card){
        if(getColor((Card)card).equals(this.getColor(this)) && getName((Card)card).equals(this.getName(this))){
            return true;
        }
        return false;
    }


}