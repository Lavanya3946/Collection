package com.xworkz.listmethod.internal;

public class Food {
    private String name;
    private String type;
    private double price;


    public Food(String name, String type, double price) {
        this.name = name;
        this.type = type;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Food{" +
                "name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}



