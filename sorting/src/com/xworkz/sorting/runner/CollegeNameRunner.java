package com.xworkz.sorting.runner;

import com.xworkz.sorting.things.CollegeName;

import java.util.ArrayList;
import java.util.Collection;

public class CollegeNameRunner {
    public static void main(String[] args) {
        CollegeName collegeName1 = new CollegeName("Kalpataru");
        CollegeName collegeName2 = new CollegeName("Presidency");
        CollegeName collegeName3 = new CollegeName("Adichunchanagiri");
        CollegeName collegeName4 = new CollegeName("Hoysalshwara");
        CollegeName collegeName5 = new CollegeName("Reva");
        CollegeName collegeName6 = new CollegeName("Sheshadripuram");
        CollegeName collegeName7 = new CollegeName("SSIT");
        CollegeName collegeName8 = new CollegeName("SIT");
        CollegeName collegeName9 = new CollegeName("Sri Devi");
        CollegeName collegeName10 = new CollegeName("Sindhi");
        CollegeName collegeName11 = new CollegeName("Mahesh pu college");
        CollegeName collegeName12 = new CollegeName("Vidhya Vahini");
        CollegeName collegeName13 = new CollegeName("JSS PU College");
        CollegeName collegeName14 = new CollegeName("Siddaganga");
        CollegeName collegeName15 = new CollegeName("Malnand");
        CollegeName collegeName16 = new CollegeName("Jain");
        CollegeName collegeName17 = new CollegeName("Mount Carmel");
        CollegeName collegeName18 = new CollegeName("Dayanand Sagar");
        CollegeName collegeName19 = new CollegeName("RT Nagar ");
        CollegeName collegeName20 = new CollegeName("KPS pu college");

        Collection<CollegeName> collection = new ArrayList<>();
        collection.add(collegeName1);
        collection.add(collegeName2);
        collection.add(collegeName3);
        collection.add(collegeName4);
        collection.add(collegeName5);
        collection.add(collegeName6);
        collection.add(collegeName7);
        collection.add(collegeName8);
        collection.add(collegeName9);
        collection.add(collegeName10);
        collection.add(collegeName11);
        collection.add(collegeName12);
        collection.add(collegeName13);
        collection.add(collegeName14);
        collection.add(collegeName15);
        collection.add(collegeName16);
        collection.add(collegeName17);
        collection.add(collegeName18);
        collection.add(collegeName19);
        collection.add(collegeName20);

        System.out.println("College Name starting with A ");
        collection.stream().filter(c -> c.collegeName.startsWith("A")).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++");
        System.out.println("College Name in Upper Case...");
        collection.stream().map(c -> c.collegeName.toUpperCase()).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("College Name in Lower Case...");
        collection.stream().map(c -> c.collegeName.toLowerCase()).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("sorting college names in desc order..");
        collection.stream().sorted((c1, c2) -> c2.collegeName.compareTo(c1.collegeName)).forEach(System.out::println);


    }
}
