package com.xworkz.exmethods.runner;

import com.xworkz.exmethods.internal.Product;

import java.util.*;

public class productRunner {

    public static void main(String[] args) {

        Collection<Product> products = new ArrayList<>();
        products.add(new Product("iPhone 12", "Electronics", 799.99));
        products.add(new Product("Samsung Galaxy S21", "Electronics", 699.99));
        products.add(new Product("Sony Headphones", "Electronics", 149.99));
        products.add(new Product("Nike Sneakers", "Footwear", 120.00));
        products.add(new Product("Levi's Jeans", "Clothing", 60.00));


        products.add(new Product("MacBook Pro", "Electronics", 1299.99));


        products.remove(new Product("Sony Headphones", "Electronics", 149.99));


        System.out.println("Size: " + products.size());


        System.out.println("Is empty: " + products.isEmpty());


        System.out.println("Contains 'iPhone 12': " + products.contains(new Product("iPhone 12", "Electronics", 799.99)));


        Iterator<Product> iterator = products.iterator();
        while (iterator.hasNext()) {
            System.out.println("Iterating: " + iterator.next());
        }


        Object[] productArray = products.toArray();
        System.out.println("Array: " + Arrays.toString(productArray));


        Collection<Product> otherProducts = Arrays.asList(new Product("iPhone 12", "Electronics", 799.99),
                new Product("Nike Sneakers", "Footwear", 120.00));
        System.out.println("Contains all: " + products.containsAll(otherProducts));


        Collection<Product> newProducts = Arrays.asList(new Product("Adidas T-shirt", "Clothing", 35.00),
                new Product("Dell XPS 13", "Electronics", 999.99));
        products.addAll(newProducts);


        products.removeAll(newProducts);


        products.retainAll(otherProducts);


        products.clear();


        products = new ArrayList<>(Arrays.asList(new Product("iPhone 12", "Electronics", 799.99),
                new Product("Samsung Galaxy S21", "Electronics", 699.99),
                new Product("Sony Headphones", "Electronics", 149.99),
                new Product("Nike Sneakers", "Footwear", 120.00),
                new Product("Levi's Jeans", "Clothing", 60.00)));


        products.removeIf(product -> product.getPrice() > 700);
        System.out.println("Products after removeIf: " + products);


        products.forEach(System.out::println);


        products.stream().forEach(System.out::println);


        products.parallelStream().forEach(System.out::println);


        Spliterator<Product> spliterator = products.spliterator();
        spliterator.forEachRemaining(System.out::println);


        Collection<Product> productCopy = new ArrayList<>(products);
        System.out.println("Equals: " + products.equals(productCopy));

            
        System.out.println("Hash code: " + products.hashCode());
    }
}


