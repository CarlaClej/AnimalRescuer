package org.fasttrakit;

public class Owner {

    String name;
    int money;

    public void feeding(Animal animal, Food food) {
        if (food.name.equals(animal.favouriteFood)){
            animal.happinessLevel +=2;
            animal.hungerLevel -=1;
        }
        else{ animal.happinessLevel -=2;
        }

        System.out.println("Hunger level before feeding: " + animal.hungerLevel);

        animal.hungerLevel -= 1;

        System.out.println(name + " just gave some " + food.name + " food to " + animal.name );

        System.out.println("Hunger level after feeding: " + animal.hungerLevel);

    }

    public void playing(Animal animal, Activity activity) {
        if (activity.name.equals(animal.favouriteActivity)){
            animal.happinessLevel += 2;
        }
        else { animal.happinessLevel -=2;
        }

        System.out.println("Happiness level before playing: " + animal.happinessLevel);

        animal.happinessLevel += 1;

        System.out.println(name + " is " + activity.name + " with " + animal.name);

        System.out.println("Happiness level after playing: " + animal.happinessLevel);

    }

    public Owner(String name, int money) {
        this.name = name;
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }
}
