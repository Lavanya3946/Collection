package com.xworkz.listmethod.internal;

public class Festival {

    private String name;
    private String month;
    private String country;


    public Festival(String name, String month, String country) {
        this.name = name;
        this.month = month;
        this.country = country;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }


    @Override
    public String toString() {
        return "Festival{" +
                "name='" + name + '\'' +
                ", month='" + month + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}


