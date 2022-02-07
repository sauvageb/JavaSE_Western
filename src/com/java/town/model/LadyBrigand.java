package com.java.town.model;

public class LadyBrigand extends Lady implements Outlaw {

    private String look;
    private double rewards;
    private int nbKidnappedLadies;
    private boolean isInJail;

    public LadyBrigand(String name, String dressColor) {
        super(name, dressColor);
        this.look = "cachotière";
    }

    public LadyBrigand(String name) {
        super(name);
    }

    @Override
    public void beArrested(Cowboy cowboy) {
        this.isInJail = true;
        this.speak("Damned, je suis faite Ahah ! " + cowboy.getName() + ", tu m'as eu !");
        this.speak("Ou...on est a eu ?? Bref..je ne sais plus :D ");
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
        return super.getName() + " la " + this.look;
    }

    @Override
    public void beReleased(Outlaw outlaw) {
        this.isInJail = false;
        this.rewards += 100;
        this.speak("Ouf ! Attention à ma robe..." + outlaw.getName());
    }

    @Override
    public void beScalped() {
        speak("Aïe ma tête !..");
    }
}
