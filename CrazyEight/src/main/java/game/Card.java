package game;

public class Card {
    private String name; //attribut name de la carte
    private String color; //attribut color de la carte
    
    protected Card(String name, String color){ //constructeur qui récupère les informations données par les paramètres
        this.name = name; 
        this.color = color;
    }

    protected static String getName(Card carte){
        return carte.name;
    }

    protected static String getColor(Card carte){
        return carte.color;
    }

    @Override
    public boolean equals(Object card){
        if(getColor((Card)card).equals(this.getColor(this)) && getName((Card)card).equals(this.getName(this))){
            return true;
        }
        return false;
    }


}