package com.xworkz.exmethods.runner;

import com.xworkz.exmethods.internal.Laptop;

import java.util.*;

public class LaptopRunner {
    public static void main(String[] args) {

        Collection<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("MacBook Air", "Apple", 999.99));
        laptops.add(new Laptop("ThinkPad X1", "Lenovo", 1249.99));
        laptops.add(new Laptop("XPS 13", "Dell", 1099.99));
        laptops.add(new Laptop("Spectre x360", "HP", 1199.99));
        laptops.add(new Laptop("Swift 3", "Acer", 649.99));


        laptops.add(new Laptop("Surface Laptop 4", "Microsoft", 1299.99));


        laptops.remove(new Laptop("Swift 3", "Acer", 649.99));


        System.out.println("Size: " + laptops.size());


        System.out.println("Is empty: " + laptops.isEmpty());


        System.out.println("Contains 'MacBook Air': " + laptops.contains(new Laptop("MacBook Air", "Apple", 999.99)));


        Iterator<Laptop> iterator = laptops.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }


        Object[] laptopArray = laptops.toArray();
        System.out.println("Array: " + Arrays.toString(laptopArray));


        Collection<Laptop> otherLaptops = Arrays.asList(new Laptop("MacBook Air", "Apple", 999.99),
                new Laptop("XPS 13", "Dell", 1099.99));
        System.out.println("Contains all: " + laptops.containsAll(otherLaptops));


        Collection<Laptop> newLaptops = Arrays.asList(new Laptop("Pixelbook", "Google", 999.99),
                new Laptop("ROG Zephyrus", "Asus", 1499.99));
        laptops.addAll(newLaptops);


        laptops.removeAll(newLaptops);


        laptops.retainAll(otherLaptops);


        laptops.clear();


        laptops = new ArrayList<>(Arrays.asList(new Laptop("MacBook Air", "Apple", 999.99),
                new Laptop("ThinkPad X1", "Lenovo", 1249.99),
                new Laptop("XPS 13", "Dell", 1099.99),
                new Laptop("Spectre x360", "HP", 1199.99),
                new Laptop("Swift 3", "Acer", 649.99)));


        laptops.removeIf(laptop -> laptop.getPrice() > 1000);
        System.out.println("Laptops after removeIf: " + laptops);


        laptops.forEach(System.out::println);


        laptops.stream().forEach(System.out::println);


        laptops.parallelStream().forEach(System.out::println);


        Spliterator<Laptop> spliterator = laptops.spliterator();
        spliterator.forEachRemaining(System.out::println);


        Collection<Laptop> laptopCopy = new ArrayList<>(laptops);
        System.out.println("Equals: " + laptops.equals(laptopCopy));


        System.out.println("Hash code: " + laptops.hashCode());
    }
}
