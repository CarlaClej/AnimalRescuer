package org.fasttrakit;

public class Owner {

    private String name;
    private int money;

    public void feeding(Animal animal, Food food) {
        if (food.getName().equals(animal.getFavouriteFood())){
            animal.setHappinessLevel(animal.getHappinessLevel()+2);
            animal.setHungerLevel(animal.getHungerLevel()-1);
        }
        else{animal.setHappinessLevel(-2);
        }

        System.out.println("Hunger level before feeding: " + animal.getHungerLevel());

        animal.setHungerLevel(-1);

        System.out.println(name + " just gave some " + food.getName() + " food to " + animal.getName());

        System.out.println("Hunger level after feeding: " + animal.getHungerLevel());

    }

    public void playing(Animal animal, Activity activity) {
        if (activity.getName().equals(animal.getFavouriteActivity())){
            animal.setHappinessLevel(+2);
        }
        else { animal.setHappinessLevel(-2);
        }

        System.out.println("Happiness level before playing: " + animal.getHappinessLevel());

        animal.setHappinessLevel(+1);

        System.out.println(name + " is " + activity.getName() + " with " + animal.getName());

        System.out.println("Happiness level after playing: " + animal.getHappinessLevel());

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
