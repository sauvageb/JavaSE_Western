package com.java.town.model;

public class CrookedCop extends Sherif implements Outlaw {

    private String look;
    private double rewards;
    private int nbKidnappedLadies;
    private boolean isInJail;

    public CrookedCop(String name) {
        super(name);
        this.look = "malicieux";
    }

    @Override
    public void introduce() {
        super.introduce();
        this.speak("Coffré ou aidé ? ahah...je ne sais plus ! Bref !");
    }

    public void release(Outlaw... outlaws) {
        this.speak("Sortez mes braves !! C'est votre jour de chance AhAhAh...");
        for (Outlaw outlaw : outlaws) {
            outlaw.beReleased(this);
        }
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
       this.speak("Merci " + outlaw.getName() + ", c'etait pas trop tôt ! Bon, File moi la TNT ...");
    }

    @Override
    public void beScalped() {
        speak("Aïe ma tête !..");
    }
}
