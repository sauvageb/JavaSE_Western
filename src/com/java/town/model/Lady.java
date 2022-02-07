package com.java.town.model;

public class Lady extends Human implements PaleFace {

    private String dressColor;
    private boolean isCaptive;


    public Lady(String name, String dressColor) {
        super(name, "lait");
        this.dressColor = dressColor;
    }

    public Lady(String name) {
        this(name, "rose");
    }

    @Override
    public String getName() {
        return "Miss " + super.getName();
    }

    public void changeDress(String color) {
        this.dressColor = color;
        this.speak("Regardez ma nouvelle robe " + this.dressColor + " !");
    }

    public void beReleased(Cowboy cowboy) {
        this.speak("Merci Cowboy !" + cowboy.getName() + ", tu es mon héro !");
        this.isCaptive = false;
    }

    public void beKidnapped(Outlaw outlaw) {
        this.isCaptive = true;
        this.speak("AHHHHH ! Au secours !! " + outlaw.getName() + " me veut du mal ! Lâchez-moi !!");
    }

    @Override
    public void beScalped() {
        this.speak("Aïe, ma tête !");
    }
}
