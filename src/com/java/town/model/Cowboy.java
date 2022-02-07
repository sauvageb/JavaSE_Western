package com.java.town.model;

import com.java.town.Story;

public class Cowboy extends Human implements PaleFace {

    private int popularity;
    private String adjective = "vaillant";

    public Cowboy(String name) {
        super(name, "whisky");
    }

    public void release(Lady lady) {
        this.popularity++;
        this.speak("Voilà " + lady.getName() + " ! Votre robe est si belle, je n'aurais pas pu le laisser vous salir !");
    }

    public void shoot(Brigand brigand) {
        Story.naration("le " + this.adjective + " " + this.getName() + " tire sur " + brigand.getName()
                + ". PAN !");
        this.speak("Prend ça, rascal !");
    }

    @Override
    public void introduce() {
        super.introduce();
        StringBuilder message = new StringBuilder("Les gens disent que je suis " + this.adjective);
        if (this.popularity > 0) {
            message.append("...en y réflechissant, j'ai déjà aidé " + this.popularity + " dames !");
        } else {
            message.append("...pourtant, je n'ai sauvé personne !");
        }
        this.speak(message.toString());

    }

    @Override
    public void beScalped() {
        this.speak("Aïe, ma tête !");
    }

    public String getAdjective() {
        return adjective;
    }
}
