package com.java.town.model;

import com.java.town.Story;

public class Sherif extends Cowboy {

    private int nbBrigandArrested;
    private String adjective;

    public Sherif(String name) {
        super(name);
        this.adjective = "honnête";
    }

    public void capture(Outlaw outlaw) {
        this.nbBrigandArrested++;
        this.speak("Au nom de la loi, je vous arrête !");
        outlaw.beArrested(this);
    }

    public void lookingFor(Brigand brigand) {
        brigand.beWanted();
        this.speak("OYEZ OYEZ BRAVE GENS !! " + brigand.getReward() + "$ a qui arrêtera Bob le brigand, mort ou vif !!");
        Story.naration(getName() + " placarde une des affiches dans toute la ville.");
    }

    @Override
    public void introduce() {
        this.speak("Je m'appelle " + getName() + ", ma boisson favorite est le " + getDrink());
        StringBuilder message = new StringBuilder();
        if (this.nbBrigandArrested > 0) {
            message.append("J'ai déjà coffré " + this.nbBrigandArrested + " brigands !");
        } else {
            message.append("Je n'ai pas encore coffré de brigand, mais je suis prêt !!");
        }
        this.speak(message.toString());
    }

    @Override
    public String getName() {
        return "Shérif " + super.getName();
    }
}
