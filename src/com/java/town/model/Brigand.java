package com.java.town.model;

public class Brigand extends Human implements Outlaw, PaleFace {

    private String look;
    private double rewards;
    private int nbKidnappedLadies;
    private boolean isInJail;

    public Brigand(String name) {
        this(name, "méchant");
    }

    public Brigand(String name, String look) {
        super(name, "tord-boyaux");
        this.look = look;
        this.rewards = 100;
    }

    @Override
    public void introduce() {
        super.introduce();
        StringBuilder message = new StringBuilder("J'ai l'air " + this.look);
        message.append(" ");
        if (this.nbKidnappedLadies > 0) {
            message.append("et j'ai déjà kidnappé " + this.nbKidnappedLadies + " dames !");
            this.speak("Ma tête est mise à prix à " + this.rewards + "$ !");
        } else {
            message.append("et j'attends qu'une chose, kidnapper la première venue ! Ah AH !");
        }
        if (this.isInJail) {
            message.append(" Bon, par contre...que le temps est long en prison ..");
        }
        this.speak(message.toString());
    }

    @Override
    public void beArrested(Cowboy cowboy) {
        this.isInJail = true;
        this.speak("Damned, je suis fait ! " + cowboy.getName() + ", tu m'as eu !");
    }

    @Override
    public void kidnap(Lady lady) {
        lady.beKidnapped(this);
        this.nbKidnappedLadies++;
        this.speak("AH ah ! " + lady.getName() + ", tu es mienne désormais !");
    }

    @Override
    public double getReward() {
        return this.rewards;
    }

    @Override
    public String getName() {
        return super.getName() + " le " + this.look;
    }

    @Override
    public void beReleased(Outlaw outlaw) {
        this.isInJail = false;
        this.rewards += 100;
       this.speak("Merci mon cher " + outlaw.getName());
    }

    @Override
    public void beScalped() {
        speak("Aïe ma tête !..");
    }

    public String getLook() {
        return look;
    }

    public void beWanted() {
        this.rewards += 100;
    }
}
