package org.fasttrakit;

public class Pet extends Animal{

    boolean noisy;

    public Pet(String name, int age, int healthLevel, int hungerLevel, int happinessLevel, String favouriteFood, String favouriteActivity, boolean noisy) {
        super(name, age, healthLevel, hungerLevel, happinessLevel, favouriteFood, favouriteActivity);
        this.noisy = noisy;
    }
}

