package com.xworkz.listmethod.runner;


import com.xworkz.listmethod.internal.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class SchoolRunner {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();


        students.add(0, new Student("Alice", 9));
        students.add(1, new Student("Bob", 10));
        students.add(2, new Student("Charlie", 8));
        students.add(3, new Student("David", 11));
        System.out.println("Students after adding elements: " + students);


        List<Student> newStudents = Arrays.asList(new Student("Eve", 10),
                new Student("Frank", 12));
        students.addAll(2, newStudents);
        System.out.println("Students after adding all new students: " + students);


        Student removedStudent = students.remove(3);
        System.out.println("Removed student: " + removedStudent);
        System.out.println("Students after removal: " + students);


        Student replacedStudent = students.set(2, new Student("Grace", 12));
        System.out.println("Replaced student: " + replacedStudent);
        System.out.println("Students after setting a new student: " + students);


        Student student = students.get(1);
        System.out.println("Student at index 1: " + student);


        int index = students.indexOf(new Student("Alice", 9));
        System.out.println("Index of 'Alice': " + index);


        int lastIndex = students.lastIndexOf(new Student("Eve", 10));
        System.out.println("Last index of 'Eve': " + lastIndex);


        List<Student> subList = students.subList(1, 3);
        System.out.println("Sublist of students: " + subList);


        ListIterator<Student> listIterator = students.listIterator();
        System.out.println("Iterating with ListIterator:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }


        System.out.println("Final student collection: " + students);
    }
}


