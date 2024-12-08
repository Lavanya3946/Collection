package com.xworkz.exmethods.internal;

public class PG {
    private String name;
    private String location;
    private double rent;


    public PG(String name, String location, double rent) {
        this.name = name;
        this.location = location;
        this.rent = rent;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public double getRent() {
        return rent;
    }

    public void setRent(double rent) {
        this.rent = rent;
    }


    @Override
    public String toString() {
        return "PG{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", rent=" + rent +
                '}';
    }
}


