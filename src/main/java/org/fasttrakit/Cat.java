package org.fasttrakit;

public class Cat extends Animal {

    private int meowsLevel;

    public Cat(String name, int age, int healthLevel, int hungerLevel, int happinessLevel, String favouriteFood,
               String favouriteActivity, int meowsLevel) {
        super(name, age, healthLevel, hungerLevel, happinessLevel, favouriteFood, favouriteActivity);
        this.meowsLevel = meowsLevel;
    }

    public int getMeowsLevel() {
        return meowsLevel;
    }

    public void setMeowsLevel(int meowsLevel) {
        this.meowsLevel = meowsLevel;
    }
}
