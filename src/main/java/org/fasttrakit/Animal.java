package org.fasttrakit;

public class Animal {

    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int happinessLevel;
    private String favouriteFood;
    private String favouriteActivity;

    public Animal(String name, int age, int healthLevel, int hungerLevel, int happinessLevel, String favouriteFood, String favouriteActivity) {
        this.name = name;
        this.age = age;
        this.healthLevel = healthLevel;
        this.hungerLevel = hungerLevel;
        this.happinessLevel = happinessLevel;
        this.favouriteFood = favouriteFood;
        this.favouriteActivity = favouriteActivity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;
    }

    public String getFavouriteFood() {
        return favouriteFood;
    }

    public void setFavouriteFood(String favouriteFood) {
        this.favouriteFood = favouriteFood;
    }

    public String getFavouriteActivity() {
        return favouriteActivity;
    }

    public void setFavouriteActivity(String favouriteActivity) {
        this.favouriteActivity = favouriteActivity;
    }
}
