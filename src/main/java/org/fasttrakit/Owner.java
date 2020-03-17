package org.fasttrakit;

public class Owner {

    String name;
    int money;

    public void feeding(Animal animal, Food food) {

        System.out.println("Hunger level before feeding: " + animal.hungerLevel);

        animal.hungerLevel -= 1;

        System.out.println(name + " just gave some " + food.name + " food to " + animal.name );

        System.out.println("Hunger level after feeding: " + animal.hungerLevel);

    }

    public void playing(Animal animal, Activity activity) {

        System.out.println("Happiness level before playing: " + animal.happinessLevel);

        animal.happinessLevel += 1;

        System.out.println(name + " is" + activity.name + " with" + animal.name);

        System.out.println("Happiness level after playing: " + animal.happinessLevel);

    }

}
