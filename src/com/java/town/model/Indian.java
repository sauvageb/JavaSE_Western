package com.java.town.model;

public class Indian extends Human {

    private String totem;
    private int nbFeather;

    public Indian(String name) {
        this(name, 0);
    }

    public Indian(String name, int nbFeather) {
        super(name);
        this.nbFeather = nbFeather;
        this.totem = "Coyote";
    }

    public void scalp(PaleFace paleFace) {
        this.nbFeather++;
        paleFace.beScalped();
    }

    @Override
    public void speak(String text) {
        super.speak(text + " Ugh !");
    }

    public String getTotem() {
        return totem;
    }
}
