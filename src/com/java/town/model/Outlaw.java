package com.java.town.model;

public interface Outlaw {

    void beArrested(Cowboy cowboy);

    void kidnap(Lady lady);

    double getReward();

    String getName();

    void beReleased(Outlaw outlaw);
}
