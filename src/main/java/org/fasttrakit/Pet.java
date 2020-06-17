package org.fasttrakit;

public class Pet extends Animal{

    private boolean noisy;

    public Pet(String name, int age, int healthLevel, int hungerLevel, int happinessLevel, String favouriteFood, String favouriteActivity, boolean noisy) {
        super(name, age, healthLevel, hungerLevel, happinessLevel, favouriteFood, favouriteActivity);
        this.noisy = noisy;
    }

    public boolean isNoisy() {
        return noisy;
    }

    public void setNoisy(boolean noisy) {
        this.noisy = noisy;
    }
}

