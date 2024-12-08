package com.xworkz.listmethod.runner;

import com.xworkz.listmethod.internal.Food;

import java.util.*;

public class FoodRunner {
    public static void main(String[] args) {
        List<Food> foods = new ArrayList<>();

        foods.add(0, new Food("Pizza", "Italian", 8.99));
        foods.add(1, new Food("Sushi", "Japanese", 12.99));
        foods.add(2, new Food("Burger", "American", 6.99));
        foods.add(3, new Food("Tacos", "Mexican", 5.99));
        System.out.println("Foods after adding elements: " + foods);


        List<Food> newFoods = Arrays.asList(new Food("Pasta", "Italian", 7.99),
                new Food("Ramen", "Japanese", 9.99));
        foods.addAll(2, newFoods);
        System.out.println("Foods after adding all new foods: " + foods);


        Food removedFood = foods.remove(3);
        System.out.println("Removed food: " + removedFood);
        System.out.println("Foods after removal: " + foods);


        Food replacedFood = foods.set(2, new Food("Salad", "Healthy", 5.49));
        System.out.println("Replaced food: " + replacedFood);
        System.out.println("Foods after setting a new food: " + foods);

        Food food = foods.get(1);
        System.out.println("Food at index 1: " + food);


        int index = foods.indexOf(new Food("Pizza", "Italian", 8.99));
        System.out.println("Index of 'Pizza': " + index);


        int lastIndex = foods.lastIndexOf(new Food("Pasta", "Italian", 7.99));
        System.out.println("Last index of 'Pasta': " + lastIndex);

        List<Food> subList = foods.subList(1, 3);
        System.out.println("Sublist of foods: " + subList);


        ListIterator<Food> listIterator = foods.listIterator();
        System.out.println("Iterating with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        System.out.println("Final food collection: " + foods);
    }
}


