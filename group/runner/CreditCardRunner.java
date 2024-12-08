package com.xworkz.group.runner;

import com.xworkz.group.dto.CreditCardDTO;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

public class CreditCardRunner {
    public static void main(String[] args) {

        CreditCardDTO creditCardDTO1=new CreditCardDTO("Visa",89456743568341239l, LocalDate.of(2026,5,31),123);
        CreditCardDTO creditCardDTO2=new CreditCardDTO("master",9090323456789765l, LocalDate.of(2025,4,11),223);
        CreditCardDTO creditCardDTO3=new CreditCardDTO("Visa",5643789023145678l, LocalDate.of(2026,9,13),237);
        CreditCardDTO creditCardDTO4=new CreditCardDTO("Rupay",7890034523146789l, LocalDate.of(2027,3,10),245);
        CreditCardDTO creditCardDTO5=new CreditCardDTO("Visa",7689456783214345l, LocalDate.of(2026,7,3),124);
        CreditCardDTO creditCardDTO6=new CreditCardDTO("Rupay",8932134567801234l, LocalDate.of(2027,4,18),223);
        CreditCardDTO creditCardDTO7=new CreditCardDTO("master",7890456723455678l, LocalDate.of(2025,2,15),899);
        CreditCardDTO creditCardDTO8=new CreditCardDTO("Rupay",6748345618793456l, LocalDate.of(2027,3,5),789);
        CreditCardDTO creditCardDTO9=new CreditCardDTO("Visa",4567234519082345l, LocalDate.of(2026,1,1),234);
        CreditCardDTO creditCardDTO10=new CreditCardDTO("master",8090454512123434l, LocalDate.of(2025,8,11),990);






        Collection<CreditCardDTO>collection=new ArrayList<>();
        collection.add(creditCardDTO1);
        collection.add(creditCardDTO2);
        collection.add(creditCardDTO3);
        collection.add(creditCardDTO4);
        collection.add(creditCardDTO5);
        collection.add(creditCardDTO6);
        collection.add(creditCardDTO7);
        collection.add(creditCardDTO8);
        collection.add(creditCardDTO9);
        collection.add(creditCardDTO10);

        System.out.println("Finding all CreditCardDTO where expiry Date is greater than 2026:");

        for (CreditCardDTO dto:collection){
            if(dto.getExpireDate().getYear()>2026){
                System.out.println(dto);
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("Finding CreditCardDTO  by Type(Visa):");

        for (CreditCardDTO dto:collection){
            if (dto.getType()=="Visa"){
                System.out.println(dto);
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("Finding CreditCardDTO  by Type(master):");

        for (CreditCardDTO dto:collection){
            if (dto.getType()=="master"){
                System.out.println(dto);
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("Finding CreditCardDTO  by Type(Rupay):");

        for (CreditCardDTO dto:collection){
            if (dto.getType()=="Rupay"){
                System.out.println(dto);
            }
        }
        System.out.println("_________________________________________________");
        System.out.println("Printing all CVV");
        for (CreditCardDTO dto:collection){
            System.out.println(dto.getCvv());
        }
        System.out.println("_________________________________________________");
        System.out.println("Printing all No");
        for (CreditCardDTO dto:collection){
            System.out.println(dto.getNo());
        }

    }

}



