package com.xworkz.exmethods.internal;

import java.io.Serializable;

public class Fruits implements Serializable {

    private String fruitName;

    public void fruitName() {

    }

    public Fruits(String fruitName) {
        this.fruitName = fruitName;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    @Override
    public String toString() {
        return "Fruits{" +
                "fruitName='" + fruitName + '\'' +
                '}';
    }
}
