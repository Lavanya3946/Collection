package com.xworkz.sreamingg.Dto;

public class DetergentDto {
    private   int pricePerKg;
    private  String brand;
    private  int quantity;
    private  double discount;
    private  String soldBy;


    public void DetergentDto(){

    }

    public DetergentDto(int pricePerKg, String brand, int quantity, double discount, String soldBy) {
        this.pricePerKg = pricePerKg;
        this.brand = brand;
        this.quantity = quantity;
        this.discount = discount;
        this.soldBy = soldBy;
    }

    public int getPricePerKg() {
        return pricePerKg;
    }

    public void setPricePerKg(int pricePerKg) {
        this.pricePerKg = pricePerKg;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public String getSoldBy() {
        return soldBy;
    }

    public void setSoldBy(String soldBy) {
        this.soldBy = soldBy;
    }

    @Override
    public String toString() {
        return "DetergentDto{" +
                "pricePerKg=" + pricePerKg +
                ", brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", discount=" + discount +
                ", soldBy='" + soldBy + '\'' +
                '}';
    }
}
