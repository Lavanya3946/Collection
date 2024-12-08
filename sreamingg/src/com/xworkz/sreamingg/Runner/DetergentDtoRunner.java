package com.xworkz.sreamingg.Runner;

import com.xworkz.sreamingg.Dto.DetergentDto;

import java.util.ArrayList;
import java.util.Collection;

public class DetergentDtoRunner {

    public static void main(String[] args) {
        DetergentDto detergentDto1=new DetergentDto(50,"Tide",5,1.0,"flipcart");
        DetergentDto detergentDto2=new DetergentDto(50,"SurfExcel",3,1.5,"amazon");
        DetergentDto detergentDto3=new DetergentDto(40,"Wheel",2, 1.0,"flipcart");
        DetergentDto detergentDto4=new DetergentDto(20,"Rin",1,0.0,"zepto");
        DetergentDto detergentDto5=new DetergentDto(600,"Arial",4,2.0,"amazon");
        DetergentDto detergentDto6=new DetergentDto(50,"More light",2,1.0,"zepto");
        DetergentDto detergentDto7=new DetergentDto(100,"Ujala",2,1.0,"flipcart");
        DetergentDto detergentDto8=new DetergentDto(230,"Safe wash",1,0.0,"amazon");
        DetergentDto detergentDto9=new DetergentDto(780,"Presto",1,2.0,"zepto");
        DetergentDto detergentDto10=new DetergentDto(300,"Advance",3,1.0,"zepto");

        Collection<DetergentDto> collection=new ArrayList<>();
        collection.add(detergentDto1);
        collection.add(detergentDto2);
        collection.add(detergentDto3);
        collection.add(detergentDto4);
        collection.add(detergentDto5);
        collection.add(detergentDto6);
        collection.add(detergentDto7);
        collection.add(detergentDto8);
        collection.add(detergentDto8);
        collection.add(detergentDto10);

        System.out.println("Filtering all by pricePerKg:");
        collection.stream().filter(d->d.getPricePerKg()<100).forEach(System.out::println);

        System.out.println("+++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Filtering all by quantity:");
        collection.stream().filter(d->d.getQuantity()<5).forEach(System.out::println);


        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Filtering all by discount and quantity:");
        collection.stream().filter(d->d.getDiscount()==1.0 || d.getBrand()=="tide").forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Filter all by soldBy and brand and quantity:");
        collection.stream().filter(d->d.getSoldBy()=="amazon"||d.getBrand()=="wheel"||d.getQuantity()>3).forEach(System.out::println);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++");

        System.out.println("Filtering by pricePerKg in descending  order:");
        collection.stream().sorted((d1,d2)->Double.compare(( d2.getPricePerKg()),d1.getPricePerKg())).forEach(System.out::println);


    }
}
