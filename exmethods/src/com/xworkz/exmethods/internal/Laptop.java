package com.xworkz.exmethods.internal;

public class Laptop {
    private String name;
    private String brand;
    private double price;


    public Laptop(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    @Override
    public String toString() {
        return "Laptop{" +
                "name='" + name + '\'' +
                ", brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }
}


