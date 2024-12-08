package com.xworkz.exmethods.runner;

import com.xworkz.exmethods.internal.PG;

import java.util.*;

public class PGRunner {


    public static void main(String[] args) {

        Collection<PG> pgs = new ArrayList<>();
        pgs.add(new PG("Green Stay", "Koramangala", 8000));
        pgs.add(new PG("Blue Nest", "Indiranagar", 7500));
        pgs.add(new PG("Sunshine PG", "Whitefield", 7000));
        pgs.add(new PG("Comfort Living", "Marathahalli", 9000));
        pgs.add(new PG("Happy Home", "HSR Layout", 8500));


        pgs.add(new PG("Urban Nest", "BTM Layout", 9500));


        pgs.remove(new PG("Sunshine PG", "Whitefield", 7000));


        System.out.println("Size: " + pgs.size());

        System.out.println("Is empty: " + pgs.isEmpty());


        System.out.println("Contains 'Green Stay': " + pgs.contains(new PG("Green Stay", "Koramangala", 8000)));


        Iterator<PG> iterator = pgs.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }


        Object[] pgArray = pgs.toArray();
        System.out.println("Array: " + Arrays.toString(pgArray));

        Collection<PG> otherPGs = Arrays.asList(new PG("Green Stay", "Koramangala", 8000),
                new PG("Comfort Living", "Marathahalli", 9000));
        System.out.println("Contains all: " + pgs.containsAll(otherPGs));


        Collection<PG> newPGs = Arrays.asList(new PG("Luxury Living", "Hebbal", 10000),
                new PG("Comfort Zone", "Bellandur", 8500));
        pgs.addAll(newPGs);


        pgs.removeAll(newPGs);

        pgs.retainAll(otherPGs);


        pgs.clear();


        pgs = new ArrayList<>(Arrays.asList(new PG("Green Stay", "Koramangala", 8000),
                new PG("Blue Nest", "Indiranagar", 7500),
                new PG("Sunshine PG", "Whitefield", 7000),
                new PG("Comfort Living", "Marathahalli", 9000),
                new PG("Happy Home", "HSR Layout", 8500)));


        pgs.removeIf(pg -> pg.getRent() > 8500);
        System.out.println("PGs after removeIf: " + pgs);


        pgs.forEach(System.out::println);


        pgs.stream().forEach(System.out::println);


        pgs.parallelStream().forEach(System.out::println);


        Spliterator<PG> spliterator = pgs.spliterator();
        spliterator.forEachRemaining(System.out::println);


        Collection<PG> pgCopy = new ArrayList<>(pgs);
        System.out.println("Equals: " + pgs.equals(pgCopy));


        System.out.println("Hash code: " + pgs.hashCode());
    }
}


