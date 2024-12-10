package com.xworkz.exampleset.runner;

import com.xworkz.exampleset.dto.GiftDto;


import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;


public class GiftRunner {
    public static void main(String[] args) {

        GiftDto giftDto1 = new GiftDto(45, "bag", 30, "amazon", "sneha");
        GiftDto giftDto2 = new GiftDto(2, "Dress", 600, "Flipcart", "Monika");
        GiftDto giftDto3 = new GiftDto(3, "Gold", 50000, "Kalyan", "Pushpa");
        GiftDto giftDto4 = new GiftDto(4, "Silver", 3000, "Tanishq", "Meghana");
        GiftDto giftDto5 = new GiftDto(6, "Book", 640, "Swapna book house", "Yashu");
        GiftDto giftDto6 = new GiftDto(7, "Mobile", 6000, "Sangeeta mobiles", "Harshan");
        GiftDto giftDto7 = new GiftDto(8, "smartwatch", 1500, "Meesho", "Sanju");
        GiftDto giftDto8 = new GiftDto(8, "smartwatch", 1500, "Meesho", "Sanju");
        GiftDto giftDto9 = new GiftDto(10, "saree", 500, "myntra", "Veena");
        GiftDto giftDto10 = new GiftDto(10, "saree", 500, "myntra", "Veena");





        Set<GiftDto> set = new HashSet<>();
        set.add(giftDto1);
        set.add(giftDto2);
        set.add(giftDto3);
        set.add(giftDto4);
        set.add(giftDto5);
        set.add(giftDto6);
        set.add(giftDto7);
        set.add(giftDto8);
        set.add(giftDto9);
        set.add(giftDto10);


        System.out.println("Number of unique gifts in set: " + set.size());
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("cost in descending order:...");
        set.stream().sorted(Comparator.comparingDouble(GiftDto::getCost)).forEach(System.out::println);
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Getting the names and from  in Ascending order....");
        set.stream()
                .sorted(Comparator.comparing(GiftDto::getName)
                        .thenComparing(GiftDto::getFrom))
                .forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Getting only the Id's:");
        set.stream().map(GiftDto::getId).forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("Get only From and sort on desc order..");
        set.stream().map(GiftDto::getFrom).sorted(Comparator.reverseOrder()).forEach(System.out::println);

    }

}
