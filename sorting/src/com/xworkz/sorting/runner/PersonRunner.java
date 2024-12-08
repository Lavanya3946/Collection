package com.xworkz.sorting.runner;

import com.xworkz.sorting.things.Address;
import com.xworkz.sorting.things.Person;

import java.util.*;
import java.util.stream.Collectors;

public class PersonRunner {
    public static void main(String[] args) {
        Address address1 = new Address("Brigade road", 4, "Mg Road");
        Address address2 = new Address("chruch street", 9, "hebbal");
        Address address3 = new Address("Brigade road", 6, "Jaynagar");
        Address address4 = new Address("Commercial street", 7, "rajajinagar");
        Address address5 = new Address("Residency road", 8, "banashakari");
        Address address6 = new Address("Richmond road", 4, "malleshwaram");
        Address address7 = new Address("outer ring road", 22, "kormangala");
        Address address8 = new Address("Whitefield", 90, "vijaynagar");
        Address address9 = new Address("Electronic city", 7, "bannaergatta");
        Address address10 = new Address("HSR layout", 8, "BTM layout");

        
        Person person1 = new Person("lavanya", "lavamya@gmail.com", 7760213946L, address1);
        Person person2 = new Person("Sneha", "sneha@gmail.com", 7799665544L, address2);
        Person person3 = new Person("Monika", "monika@gmail.com", 7204315223L, address3);
        Person person4 = new Person("Meghana", "megha@gmail.com", 8877996645L, address4);
        Person person5 = new Person("kavana", "kavana@gmail.com", 7799006655L, address5);
        Person person6 = new Person("vidya", "vidya@gmail.com", 9901164763L, address6);
        Person person7 = new Person("Roopa", "roopa@gmail.com", 9902521442L, address7);
        Person person8 = new Person("yashu", "yashu@gmail.com", 7766055789L, address8);
        Person person9 = new Person("Nisarga", "nisarga@gmail.com", 9945762345L, address9);
        Person person10 = new Person("kavya", "kavya@gmail.com", 9934523167L, address10);

        Collection<Person> collection = new ArrayList<>();
        collection.add(person1);
        collection.add(person2);
        collection.add(person3);
        collection.add(person4);
        collection.add(person5);
        collection.add(person6);
        collection.add(person7);
        collection.add(person8);
        collection.add(person9);
        collection.add(person10);
        System.out.println("Name starts with S");
        collection.stream().filter(person -> person.getName().startsWith("S")).forEach(System.out::println);
        System.out.println("____________________________________");
        System.out.println("Finding by all by area..");
        Map<String, List<Person>> personsByArea = collection.stream()
                .collect(Collectors.groupingBy(person -> person.getAddress().getArea()));

        personsByArea.forEach((area, persons) -> {
            System.out.println("Area: " + area);
            persons.forEach(person -> System.out.println("\t" + person.getName() + " - " + person.getEmail()));
        });
        System.out.println("______________________________________");

        System.out.println("collect only address and sort by area in asc order..");
        collection.stream().map(Person::getAddress).sorted((a1, a2) -> a1.getArea().compareTo(a2.getArea())).forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("sorting by area..");
        collection.stream().sorted((p1, p2) -> p1.getAddress().getArea().compareTo(p2.getAddress().getArea())).forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("Filter by street..");
        String streetName = "Brigade road";
        collection.stream().filter(person -> person.getAddress().getStreet().equalsIgnoreCase(streetName)).forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("Filter by email and street and area..");
        String email = "sneha@gmail.com";
        String street = "chruch street";
        String area = "hebbal";
        collection.stream().filter(person -> person.getEmail().equalsIgnoreCase(email)).filter(person -> person.getAddress().getStreet().equalsIgnoreCase(street)).filter(person -> person.getAddress().getArea().equalsIgnoreCase(area)).forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("Sort by area..");
        collection.stream().sorted(Comparator.comparing(Person::getName).thenComparing(person -> person.getAddress().getArea())).forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("Collect only area..");
        collection.stream() .map(person -> person.getAddress().getArea()) .forEach(System.out::println);
        System.out.println("______________________________________");

        System.out.println("collect only street:");
        collection.stream() .map(person -> person.getAddress().getStreet()) .forEach(System.out::println);
    }
}
