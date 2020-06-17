package org.fasttrakit;

import java.time.LocalDate;

public class Food {

    private String name;
    private int price;
    private boolean availability;
    public LocalDate expirationDate;
    private double quantity;

    public Food(String name, int price, boolean availability, double quantity) {
        this.name = name;
        this.price = price;
        this.availability = availability;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public LocalDate getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(LocalDate expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getQuantity() {
        return quantity;
    }

    public void setQuantity(double quantity) {
        this.quantity = quantity;
    }
}
