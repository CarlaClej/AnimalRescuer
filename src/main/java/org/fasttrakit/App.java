package org.fasttrakit;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {

        Pet petReference = new Pet("Asura",6,10,7,10,
                "Whiskas","playing with toys",true);

//        petReference.name = " Asura ";
//        petReference.age = 6;
//        petReference.favouriteActivity = " playing with toys ";
//        petReference.happinessLevel = 10;
//        petReference.favouriteFood = " Whiskas ";
//        petReference.healthLevel = 10;
//        petReference.hungerLevel = 7;

        System.out.println("Properties of:" + petReference.getName());
        System.out.println("Age:" + petReference.getAge());
        System.out.println("Favourite activity:" + petReference.getFavouriteActivity());
        System.out.println("Happiness:" + petReference.getHappinessLevel());
        System.out.println("Favourite food:" + petReference.getFavouriteFood());
        System.out.println("Health status:" + petReference.getHealthLevel());
        System.out.println("Hunger:" + petReference.getHungerLevel());

        Owner ownerReference = new Owner("Cristian",200);

//        ownerReference.setName("Cristian");
//        ownerReference.setMoney(200);

        System.out.println("Owner name:" + ownerReference.getName());
        System.out.println("Owner funds:" + ownerReference.getMoney());

        Food foodReference = new Food("Whiskas",5,true,50);

//        foodReference.availability = true;
//        foodReference.name = " Whiskas ";
//        foodReference.price = 5;
//        foodReference.quantity = 50;
        foodReference.expirationDate = LocalDate.of(2022,8,27);

        System.out.println("Food availability:" + foodReference.isAvailability());
        System.out.println("Food name:" + foodReference.getName());
        System.out.println("Food price:" + foodReference.getPrice());
        System.out.println("Food stock:" + foodReference.getQuantity());
        System.out.println("Food expiration date:" + foodReference.expirationDate);

        Activity activityReference = new Activity("playing with toys ");

//        activityReference.name = " playing with toys ";

        System.out.println("Activity name:" + activityReference.getName());

        Vet vetReference = new Vet("Laura","cats");

//        vetReference.name = " Laco Laura ";
//        vetReference.specialization = "cat";

        System.out.println("Vet name:" + vetReference.getName());
        System.out.println("Vet specialization:" + vetReference.getSpecialization());

        ownerReference.feeding(petReference, foodReference);
        ownerReference.playing(petReference, activityReference);
    }
}
