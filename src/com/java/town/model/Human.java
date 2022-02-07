package com.java.town.model;

public class Human {

    private String name;
    private String drink;

    public Human(String name) {
        this.name = name;
        this.drink = "eau";
    }

    public Human(String name, String drink) {
        this.name = name;
        this.drink = drink;
    }

    public void speak(String text) {
        System.out.println("(" + this.name + ") " + text);
    }

    public void introduce() {
        this.speak("Je m'appelle " + getName() + ", ma boisson favorite est le " + this.drink);
    }

    public void drink() {
        this.speak("Ah ! un bon verre de " + this.drink + " ! GLOUPS !");
    }

    public String getName() {
        return name;
    }

    public String getDrink() {
        return drink;
    }
}
