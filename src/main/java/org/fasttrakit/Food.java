package org.fasttrakit;

import java.time.LocalDate;

public class Food {

    String name;
    int price;
    boolean availability;
    LocalDate expirationDate;
    double quantity;

    public Food(String name, int price, boolean availability, double quantity) {
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.quantity = quantity;
    }
}
