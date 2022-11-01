package game;

public class Card {
    private String nom; //attribut nom de la carte
    private String couleur; //attribut couleur de la carte
    
    protected Card(String name, String color){ //constructeur qui récupère les informations données par les paramètres
        this.nom = name; 
        this.couleur = color;
    }

    protected static String getNom(Card carte){
        return carte.nom;
    }

    protected static String getCouleur(Card carte){
        return carte.couleur;
    }

    @Override
    public boolean equals(Object card){
        if(getCouleur((Card)card).equals(this.getCouleur(this)) && getNom((Card)card).equals(this.getNom(this))){
            return true;
        }
        return false;
    }


}