package com.xworkz.listmethod.runner;

import com.xworkz.listmethod.internal.Festival;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class FestivalRunner {


    public static void main(String[] args) {
        List<Festival> festivals = new ArrayList<>();


        festivals.add(0, new Festival("Diwali", "November", "India"));
        festivals.add(1, new Festival("Christmas", "December", "USA"));
        festivals.add(2, new Festival("Oktoberfest", "October", "Germany"));
        festivals.add(3, new Festival("Carnival", "February", "Brazil"));
        System.out.println("Festivals after adding elements: " + festivals);


        List<Festival> newFestivals = Arrays.asList(new Festival("Holi", "March", "India"),
                new Festival("Thanksgiving", "November", "USA"));
        festivals.addAll(2, newFestivals);
        System.out.println("Festivals after adding all new festivals: " + festivals);


        Festival removedFestival = festivals.remove(3);
        System.out.println("Removed festival: " + removedFestival);
        System.out.println("Festivals after removal: " + festivals);


        Festival replacedFestival = festivals.set(2, new Festival("New Year", "January", "Worldwide"));
        System.out.println("Replaced festival: " + replacedFestival);
        System.out.println("Festivals after setting a new festival: " + festivals);


        Festival festival = festivals.get(1);
        System.out.println("Festival at index 1: " + festival);


        int index = festivals.indexOf(new Festival("Diwali", "November", "India"));
        System.out.println("Index of 'Diwali': " + index);


        int lastIndex = festivals.lastIndexOf(new Festival("Holi", "March", "India"));
        System.out.println("Last index of 'Holi': " + lastIndex);


        List<Festival> subList = festivals.subList(1, 3);
        System.out.println("Sublist of festivals: " + subList);


        ListIterator<Festival> listIterator = festivals.listIterator();
        System.out.println("Iterating with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        System.out.println("Final festival collection: " + festivals);
    }
}


