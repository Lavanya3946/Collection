package com.xworkz.listmethod.runner;

import com.xworkz.listmethod.internal.Sport;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SportRunner {
    public static void main(String[] args) {
        List<Sport> sports = new ArrayList<>();


        sports.add(0, new Sport("Soccer", "Team", 11));
        sports.add(1, new Sport("Basketball", "Team", 5));
        sports.add(2, new Sport("Tennis", "Individual", 1));
        sports.add(3, new Sport("Cricket", "Team", 11));
        System.out.println("Sports after adding elements: " + sports);


        List<Sport> newSports = Arrays.asList(new Sport("Swimming", "Individual", 1),
                new Sport("Volleyball", "Team", 6));
        sports.addAll(2, newSports);
        System.out.println("Sports after adding all new sports: " + sports);


        Sport removedSport = sports.remove(3);
        System.out.println("Removed sport: " + removedSport);
        System.out.println("Sports after removal: " + sports);


        Sport replacedSport = sports.set(2, new Sport("Baseball", "Team", 9));
        System.out.println("Replaced sport: " + replacedSport);
        System.out.println("Sports after setting a new sport: " + sports);


        Sport sport = sports.get(1);
        System.out.println("Sport at index 1: " + sport);


        int index = sports.indexOf(new Sport("Soccer", "Team", 11));
        System.out.println("Index of 'Soccer': " + index);

        int lastIndex = sports.lastIndexOf(new Sport("Swimming", "Individual", 1));
        System.out.println("Last index of 'Swimming': " + lastIndex);


        List<Sport> subList = sports.subList(1, 3);
        System.out.println("Sublist of sports: " + subList);


        ListIterator<Sport> listIterator = sports.listIterator();
        System.out.println("Iterating with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        System.out.println("Final sport collection: " + sports);
    }
}


