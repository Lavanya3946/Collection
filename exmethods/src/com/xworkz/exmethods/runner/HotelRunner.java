package com.xworkz.exmethods.runner;


import com.xworkz.exmethods.internal.Hotel;

import java.util.*;

public class HotelRunner {
    public static void main(String[] args) {

        Collection<Hotel> hotels = new ArrayList<>();
        hotels.add(new Hotel("The Oberoi", "Mumbai", 4.9));
        hotels.add(new Hotel("Taj Mahal Palace", "Mumbai", 4.8));
        hotels.add(new Hotel("The Leela Palace", "Bengaluru", 4.7));
        hotels.add(new Hotel("ITC Grand Chola", "Chennai", 4.6));
        hotels.add(new Hotel("Hyatt Regency", "Delhi", 4.5));


        hotels.add(new Hotel("JW Marriott", "Kolkata", 4.7));


        hotels.remove(new Hotel("Hyatt Regency", "Delhi", 4.5));


        System.out.println("Size: " + hotels.size());


        System.out.println("Is empty: " + hotels.isEmpty());


        System.out.println("Contains 'The Oberoi': " + hotels.contains(new Hotel("The Oberoi", "Mumbai", 4.9)));


        Iterator<Hotel> iterator = hotels.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }


        Object[] hotelArray = hotels.toArray();
        System.out.println("Array: " + Arrays.toString(hotelArray));


        Collection<Hotel> otherHotels = Arrays.asList(new Hotel("The Oberoi", "Mumbai", 4.9), new Hotel("The Leela Palace", "Bengaluru", 4.7));
        System.out.println("Contains all: " + hotels.containsAll(otherHotels));


        Collection<Hotel> newHotels = Arrays.asList(new Hotel("The Ritz-Carlton", "Bangalore", 4.8), new Hotel("Four Seasons", "Mumbai", 4.6));
        hotels.addAll(newHotels);


        hotels.removeAll(newHotels);


        hotels.retainAll(otherHotels);


        hotels.clear();


        hotels = new ArrayList<>(Arrays.asList(new Hotel("The Oberoi", "Mumbai", 4.9), new Hotel("Taj Mahal Palace", "Mumbai", 4.8), new Hotel("The Leela Palace", "Bengaluru", 4.7), new Hotel("ITC Grand Chola", "Chennai", 4.6), new Hotel("Hyatt Regency", "Delhi", 4.5)));


        hotels.removeIf(hotel -> hotel.getRating() < 4.7);
        System.out.println("Hotels after removeIf: " + hotels);


        hotels.forEach(System.out::println);


        hotels.stream().forEach(System.out::println);


        hotels.parallelStream().forEach(System.out::println);


        Spliterator<Hotel> spliterator = hotels.spliterator();
        spliterator.forEachRemaining(System.out::println);


        Collection<Hotel> hotelCopy = new ArrayList<>(hotels);
        System.out.println("Equals: " + hotels.equals(hotelCopy));


        System.out.println("Hash code: " + hotels.hashCode());
    }
}


