package com.xworkz.group.runner;

import com.xworkz.group.dto.SuperMarketDTO;

import java.util.ArrayList;
import java.util.Collection;

public class SuperMarketRunner {
    public static void main(String[] args) {
        SuperMarketDTO superMarketDTO1=new SuperMarketDTO("SuperMart Express","whitefield",50,8000,"John Doe");
        SuperMarketDTO superMarketDTO2=new SuperMarketDTO("Fresh Grocers","RiverTown",35,6500,"Jane Smith");
        SuperMarketDTO superMarketDTO3=new SuperMarketDTO("GreenMart Superstore"," Hill valley",75,12000,"Michael Lee");
        SuperMarketDTO superMarketDTO4=new SuperMarketDTO("City market"," DownTownCity",60,9500,"Sarah Parker");
        SuperMarketDTO superMarketDTO5=new SuperMarketDTO("QuickMart Superstore","GreenField",40,7000,"Robert Brown");
        SuperMarketDTO superMarketDTO6=new SuperMarketDTO("SuperFresh Market","rajajinagar",46,8500,"Emily clark");
        SuperMarketDTO superMarketDTO7=new SuperMarketDTO("Grocery Haven","Newtown",55,9000,"Daniel Adams");
        SuperMarketDTO superMarketDTO8=new SuperMarketDTO("Family mart"," vijaynagar",40,7800,"Alice johnson");
        SuperMarketDTO superMarketDTO9=new SuperMarketDTO("MegaShop supermarket","oldtown",90,3000,"Mark Thompson");
        SuperMarketDTO superMarketDTO10=new SuperMarketDTO("ValueMart","mahalakshi layout",80,7800,"omkar");

        SuperMarketDTO superMarketDTO11=new SuperMarketDTO("Big Deal Market","basavanagudi",34,5000,"Anand");
        SuperMarketDTO superMarketDTO12=new SuperMarketDTO("Harvest Grocery","parkTown",60,9500,"Jennifer Taylor");
        SuperMarketDTO superMarketDTO13=new SuperMarketDTO("QuickStop ","WestField",70,4000,"Leela");
        SuperMarketDTO superMarketDTO14=new SuperMarketDTO("Neighborhood market","RR nagar",50,8000,"soma");
        SuperMarketDTO superMarketDTO15=new SuperMarketDTO("Choice market","Yelahanka",50,8000,"kishore");
        SuperMarketDTO superMarketDTO16=new SuperMarketDTO("Greenfield Supermarket","doddaballpura",90,4000,"soma");
        SuperMarketDTO superMarketDTO17=new SuperMarketDTO("Smart choice supermarket","chickaballapura",30,3000,"manjunath");
        SuperMarketDTO superMarketDTO18=new SuperMarketDTO("MarketPlace","devanahalli",50,8000,"asha");
        SuperMarketDTO superMarketDTO19=new SuperMarketDTO("SuperSaver","baglur",70,5600,"kirana");
        SuperMarketDTO superMarketDTO20=new SuperMarketDTO("FoodCity superstore","shivanahali",67,5600,"Naveen");

        SuperMarketDTO superMarketDTO21=new SuperMarketDTO("Super mart plus","arsikere",50,8000,"lavanya");
        SuperMarketDTO superMarketDTO22=new SuperMarketDTO("Big basket Grocery","bellur",80,5000,"mallikarjuna");
        SuperMarketDTO superMarketDTO23=new SuperMarketDTO("AllGoods Market","peenya",50,8000,"sachin");
        SuperMarketDTO superMarketDTO24=new SuperMarketDTO("Harvest market","jalahalli cross",10,1000,"vishwanth");
        SuperMarketDTO superMarketDTO25=new SuperMarketDTO("HappilyHome supermarket","goraguteplaya",20,2000,"rudresh");
        SuperMarketDTO superMarketDTO26=new SuperMarketDTO("value Fresh market","nelamangala",40,1300,"kantha");
        SuperMarketDTO superMarketDTO27=new SuperMarketDTO("Neighborhood Grocer","madanayakanahalli",50,8000,"monika");
        SuperMarketDTO superMarketDTO28=new SuperMarketDTO("CityView market","gubbi",20,9000,"kavitha");
        SuperMarketDTO superMarketDTO29=new SuperMarketDTO("Market Tower","nittur",60,1300,"kavya");
        SuperMarketDTO superMarketDTO30=new SuperMarketDTO("Megamart ","tiptur",50,8000,"yashu");


        SuperMarketDTO superMarketDTO31=new SuperMarketDTO("The Fresh stop","kadur",89,8900,"priyanka");
        SuperMarketDTO superMarketDTO32=new SuperMarketDTO("GreenGrocer mart","shivmogga",850,90000,"ananya");
        SuperMarketDTO superMarketDTO33=new SuperMarketDTO("Sunnny mart","kanakapura",350,44000,"Harshan");
        SuperMarketDTO superMarketDTO34=new SuperMarketDTO("Urban market","arohalli",50,8000,"darshan");
        SuperMarketDTO superMarketDTO35=new SuperMarketDTO("DailyMarket","bidadi",350,8000,"sanju");
        SuperMarketDTO superMarketDTO36=new SuperMarketDTO("SuperSelect mart","jpnagar",90,23000,"usha");
        SuperMarketDTO superMarketDTO37=new SuperMarketDTO("Superselect ","malleshwaram",590,34000,"anantha");
        SuperMarketDTO superMarketDTO38=new SuperMarketDTO("the Fresh market","gandhinagar",80,8000,"pragna");
        SuperMarketDTO superMarketDTO39=new SuperMarketDTO("BestBuy Grocery","dhobi ghat",350,5000,"sneha");
        SuperMarketDTO superMarketDTO40=new SuperMarketDTO("City SuperMart","KRpete",90,2000,"adyaa");

        SuperMarketDTO superMarketDTO41=new SuperMarketDTO("TownMart","crestfield",60,33000,"alexdar");
        SuperMarketDTO superMarketDTO42=new SuperMarketDTO("TopFresh","navrang",30,89000,"nandini");
        SuperMarketDTO superMarketDTO43=new SuperMarketDTO("PrimeFresh","basavehswar nagar",20,4000,"ayyappa");
        SuperMarketDTO superMarketDTO44=new SuperMarketDTO("City groceries","vidyanagar",70,7000,"vidya");
        SuperMarketDTO superMarketDTO45=new SuperMarketDTO("Superbast","chruch shreet",50,8000,"deekshitha");
        SuperMarketDTO superMarketDTO46=new SuperMarketDTO("Total mart","RR nagar",30,3000,"saravana");
        SuperMarketDTO superMarketDTO47=new SuperMarketDTO("Value Grove","suabhi layout",40,67000,"bhagya");
        SuperMarketDTO superMarketDTO48=new SuperMarketDTO("Global Grocer","hassan",750,34000,"manasa");
        SuperMarketDTO superMarketDTO49=new SuperMarketDTO("FreshFinds market","tumkur",50,8000,"abinava");
        SuperMarketDTO superMarketDTO50=new SuperMarketDTO("Gigamart","bhroad",780,78000,"kousalya");

        SuperMarketDTO superMarketDTO51=new SuperMarketDTO("Mega Grocer","Bridge road",550,78000,"karan");
        SuperMarketDTO superMarketDTO52=new SuperMarketDTO("Best Deals","mgroad",60,45000,"gangadhar");
        SuperMarketDTO superMarketDTO53=new SuperMarketDTO("Grocers Choice","vidyaranya pura",540,4560,"vidyaa");
        SuperMarketDTO superMarketDTO54=new SuperMarketDTO("QuickFresh market","srirampura",70,78000,"nisarga");
        SuperMarketDTO superMarketDTO55=new SuperMarketDTO("MetroMart","huliyar",50,8000,"inidra");
        SuperMarketDTO superMarketDTO56=new SuperMarketDTO("TopChoice mart","indira nagar",450,4000,"renu");
        SuperMarketDTO superMarketDTO57=new SuperMarketDTO("CityGrocery","jaynagar",80,3000,"jaya");
        SuperMarketDTO superMarketDTO58=new SuperMarketDTO("MarketStreet","rajajinagar",50,8000,"Raja");
        SuperMarketDTO superMarketDTO59=new SuperMarketDTO("FreshGoods","mejestic",450,456000,"vikram");
        SuperMarketDTO superMarketDTO60=new SuperMarketDTO("PrimeValue","yeswanthpur",560,8000,"yeswanth");


        SuperMarketDTO superMarketDTO61=new SuperMarketDTO("PrimeValue","silkboard",60,56000,"bharath");
        SuperMarketDTO superMarketDTO62=new SuperMarketDTO("TotalFresh","basavangudi",890,87000,"basava");
        SuperMarketDTO superMarketDTO63=new SuperMarketDTO("BestBuy","vijaynagar",60,34000,"vijay");
        SuperMarketDTO superMarketDTO64=new SuperMarketDTO("more","msplaya",50,8000,"shalini");
        SuperMarketDTO superMarketDTO65=new SuperMarketDTO("dmart","newtown",350,9000,"tarun");
        SuperMarketDTO superMarketDTO66=new SuperMarketDTO("Sunset supermart","oldtown",80,67000,"sanjay");
        SuperMarketDTO superMarketDTO67=new SuperMarketDTO("Elite","whitefield",90,5000,"bhimma");
        SuperMarketDTO superMarketDTO68=new SuperMarketDTO("SuperFresh","ramnagar",40,2000,"maruthi");
        SuperMarketDTO superMarketDTO69=new SuperMarketDTO("One stop shop","hebbal",70,3000,"divya");
        SuperMarketDTO superMarketDTO70=new SuperMarketDTO("Greenmart","Westwood Height",30,38000,"Micheal");

        SuperMarketDTO superMarketDTO71=new SuperMarketDTO("UrbanFresh superstore","Harborview",79,3400,"kavana");
        SuperMarketDTO superMarketDTO72=new SuperMarketDTO("Farmers market","inalli",50,8000,"shiva");
        SuperMarketDTO superMarketDTO73=new SuperMarketDTO("CityFresh superstore","okalipuram",78,3000,"pavitra");
        SuperMarketDTO superMarketDTO74=new SuperMarketDTO("smartmart","anandrao circle",30,8900,"anand");
        SuperMarketDTO superMarketDTO75=new SuperMarketDTO("SuperZone market","vv puram",450,8000,"sharada");
        SuperMarketDTO superMarketDTO76=new SuperMarketDTO("The Green market","esi",50,8000,"alina");
        SuperMarketDTO superMarketDTO77=new SuperMarketDTO("QuickFresh","rajajinagar 5th block",350,8000,"rajesh");
        SuperMarketDTO superMarketDTO78=new SuperMarketDTO("SuperFresh","chickepete",500,78000,"jeeva");
        SuperMarketDTO superMarketDTO79=new SuperMarketDTO("PrimeGrocer","west valley",40,48000,"David");
        SuperMarketDTO superMarketDTO80=new SuperMarketDTO("Freshmart","Green valley",500,8000,"Elizabeth");

        SuperMarketDTO superMarketDTO81=new SuperMarketDTO("ValueFresh","kengere",60,88000,"govida");
        SuperMarketDTO superMarketDTO82=new SuperMarketDTO("Top Fresh","sukatkatte",34,4000,"suraj");
        SuperMarketDTO superMarketDTO83=new SuperMarketDTO("EliteSuper mart","kalsipalya",70,2000,"kalpana");

        Collection<SuperMarketDTO> collection=new ArrayList<>();
        collection.add(superMarketDTO1);
        collection.add(superMarketDTO2);
        collection.add(superMarketDTO3);
        collection.add(superMarketDTO4);
        collection.add(superMarketDTO5);
        collection.add(superMarketDTO6);
        collection.add(superMarketDTO7);
        collection.add(superMarketDTO8);
        collection.add(superMarketDTO9);
        collection.add(superMarketDTO10);

        collection.add(superMarketDTO11);
        collection.add(superMarketDTO12);
        collection.add(superMarketDTO13);
        collection.add(superMarketDTO14);
        collection.add(superMarketDTO15);
        collection.add(superMarketDTO16);
        collection.add(superMarketDTO17);
        collection.add(superMarketDTO18);
        collection.add(superMarketDTO19);
        collection.add(superMarketDTO20);

        collection.add(superMarketDTO21);
        collection.add(superMarketDTO22);
        collection.add(superMarketDTO23);
        collection.add(superMarketDTO24);
        collection.add(superMarketDTO25);
        collection.add(superMarketDTO26);
        collection.add(superMarketDTO27);
        collection.add(superMarketDTO28);
        collection.add(superMarketDTO29);
        collection.add(superMarketDTO30);

        collection.add(superMarketDTO31);
        collection.add(superMarketDTO32);
        collection.add(superMarketDTO33);
        collection.add(superMarketDTO34);
        collection.add(superMarketDTO35);
        collection.add(superMarketDTO36);
        collection.add(superMarketDTO37);
        collection.add(superMarketDTO38);
        collection.add(superMarketDTO39);
        collection.add(superMarketDTO40);

        collection.add(superMarketDTO41);
        collection.add(superMarketDTO42);
        collection.add(superMarketDTO43);
        collection.add(superMarketDTO44);
        collection.add(superMarketDTO45);
        collection.add(superMarketDTO46);
        collection.add(superMarketDTO47);
        collection.add(superMarketDTO48);
        collection.add(superMarketDTO49);
        collection.add(superMarketDTO50);

        collection.add(superMarketDTO51);
        collection.add(superMarketDTO52);
        collection.add(superMarketDTO53);
        collection.add(superMarketDTO54);
        collection.add(superMarketDTO55);
        collection.add(superMarketDTO56);
        collection.add(superMarketDTO57);
        collection.add(superMarketDTO58);
        collection.add(superMarketDTO59);
        collection.add(superMarketDTO60);

        collection.add(superMarketDTO61);
        collection.add(superMarketDTO62);
        collection.add(superMarketDTO63);
        collection.add(superMarketDTO64);
        collection.add(superMarketDTO65);
        collection.add(superMarketDTO66);
        collection.add(superMarketDTO67);
        collection.add(superMarketDTO68);
        collection.add(superMarketDTO69);
        collection.add(superMarketDTO70);

        collection.add(superMarketDTO71);
        collection.add(superMarketDTO72);
        collection.add(superMarketDTO73);
        collection.add(superMarketDTO74);
        collection.add(superMarketDTO75);
        collection.add(superMarketDTO76);
        collection.add(superMarketDTO77);
        collection.add(superMarketDTO78);
        collection.add(superMarketDTO79);
        collection.add(superMarketDTO80);

        collection.add(superMarketDTO81);
        collection.add(superMarketDTO82);
        collection.add(superMarketDTO83);

        System.out.println("Finding by location:");
        for (SuperMarketDTO dto:collection){
            if (dto.getLocation()=="rajajinagar"){
                System.out.println(dto);
            }
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Finding supermarket  total staff is greater than 300:");
        for (SuperMarketDTO dto:collection){
            if (dto.getTotalStaff()>300){
                System.out.println(dto);
            }
        }

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Finding by totalArea and totalStaff:");
        for (SuperMarketDTO dto:collection){
            if (dto.getTotalArea()==78000&&dto.getTotalStaff()==500){
                System.out.println(dto);
            }
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Printing all manager names:");
        for (SuperMarketDTO dto:collection){
            System.out.println(dto.getManagerName());
        }
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Printing all names:");
        for (SuperMarketDTO dto:collection){
            System.out.println(dto.getName());
        }




    }
}
