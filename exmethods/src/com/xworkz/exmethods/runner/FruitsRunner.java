package com.xworkz.exmethods.runner;

import com.xworkz.exmethods.internal.Fruits;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Spliterator;

public class FruitsRunner {
    public static void main(String[] args) {

        Fruits fruits1 = new Fruits("apple");
        Fruits fruits2 = new Fruits("banana");
        Fruits fruits3 = new Fruits("mango");
        Fruits fruits4 = new Fruits("grapes");
        Fruits fruits5 = new Fruits("cherry");


        Collection<Fruits> collection = new ArrayList<>();
        collection.add(fruits1);
        collection.add(fruits2);
        collection.add(fruits3);
        collection.add(fruits4);
        collection.add(fruits5);
        System.out.println("After adding:" + collection);

        collection.addAll(collection);
        System.out.println("after adding all" + collection);

        collection.remove(fruits1);
        System.out.println("after remove:" + collection);

        collection.removeAll(collection);
        System.out.println("after removing all:" + collection);

        collection.clear();
        System.out.println("after clear:" + collection);

        collection.add(fruits1);
        System.out.println("after clearing adding again:" + collection);

        collection.retainAll(collection);
        System.out.println("after retaining all: " + collection);

        collection.add(fruits4);
        System.out.println("After 'Grapes':" + collection.contains(fruits4));


        collection.containsAll(collection);
        System.out.println("contains all:" + collection);

        System.out.println("is empty:" + collection.isEmpty());
        System.out.println("size:" + collection.size());

        collection.toArray();
        System.out.println("toArray():" + collection);

        collection.toArray(new Fruits[0]);
        System.out.println("toArray(T[] a):" + collection);

        collection.stream().map(f -> f.getFruitName().toUpperCase()).forEach(System.out::println);

        collection.parallelStream().map(f -> f.getFruitName().toLowerCase()).forEach(System.out::println);
        Spliterator<Fruits> spliterator = collection.spliterator();
        System.out.println("spliterator:" + spliterator.characteristics());
        spliterator.forEachRemaining(System.out::println);


    }
}
