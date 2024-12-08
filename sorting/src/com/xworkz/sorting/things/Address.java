package com.xworkz.sorting.things;

public class Address {
    private String street;
    private int number;
    private String area;

    public Address(String street, int number, String area) {
        this.street = street;
        this.number = number;
        this.area = area;
    }


    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "Address{" +
                "street='" + street + '\'' +
                ", number=" + number +
                ", area='" + area + '\'' +
                '}';
    }
}
