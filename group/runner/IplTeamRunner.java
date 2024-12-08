package com.xworkz.group.runner;

import com.xworkz.group.dto.IplTeamDTO;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class IplTeamRunner {
    public static void main(String[] args) {
        IplTeamDTO iplTeamDTO1 = new IplTeamDTO("CSK", 22, "India cement", "India Cements", 80);
        IplTeamDTO iplTeamDTO2 = new IplTeamDTO("MI", 25, "Reliance industries", "Reliance", 90);
        IplTeamDTO iplTeamDTO3 = new IplTeamDTO("RCB", 24, "United Spirits", "Diageo", 85);
        IplTeamDTO iplTeamDTO4 = new IplTeamDTO("KKR", 24, "Red Chillies Entertainment", "BYJU's", 75);
        IplTeamDTO iplTeamDTO5 = new IplTeamDTO("DC", 25, "JSW group", "JSW", 80);
        IplTeamDTO iplTeamDTO6 = new IplTeamDTO("PBKS", 22, "Preity Zinta", "paytm", 70);
        IplTeamDTO iplTeamDTO7 = new IplTeamDTO("RR", 25, "Manoj Badale", "Vivo", 75);
        IplTeamDTO iplTeamDTO8 = new IplTeamDTO("SRH", 24, "Sun Tv Network", "Sun Tv", 80);
        IplTeamDTO iplTeamDTO9 = new IplTeamDTO("LSG", 24, "RPSG Group", "RPSG Group", 85);
        IplTeamDTO iplTeamDTO10 = new IplTeamDTO("GT", 25, "CVC Capital Partners", "CVC capital", 80);


        Collection<IplTeamDTO> collection = new ArrayList<>();
        collection.add(iplTeamDTO1);
        collection.add(iplTeamDTO2);
        collection.add(iplTeamDTO3);
        collection.add(iplTeamDTO4);
        collection.add(iplTeamDTO5);
        collection.add(iplTeamDTO6);
        collection.add(iplTeamDTO7);
        collection.add(iplTeamDTO8);
        collection.add(iplTeamDTO9);
        collection.add(iplTeamDTO10);

        System.out.println("Printing all TeamNames:");
        for (IplTeamDTO dto : collection) {
            System.out.println(dto.getName());
        }
        System.out.println("_____________________");

        System.out.println("Finding IplTeamDTO by Budget");
        for (IplTeamDTO dto:collection) {
            if (dto.getBudget() == 90) {
                System.out.println("The Budget which is  90cr:" + dto);

            }
        }
        System.out.println("_____________________");
        for (IplTeamDTO dto:collection){
            if (dto.getSponsor()=="Reliance"){
                System.out.println("Finding  Ipl Team which the Sponser Name is Reliance :"+dto);

            }
        }
        System.out.println("_____________________");
        System.out.println("Finding The IplTeamDto by ownerName and sponser name:");
        for (IplTeamDTO dto:collection){
            if (dto.getOwnerName()=="India cement"&&dto.getSponsor()=="India Cements"){
                System.out.println(" owername and sponser name:"+dto);

            }
        }
        System.out.println("_____________________");

        System.out.println("Finding IplTeamDTO  by noOfPlayers:");
        for (IplTeamDTO dto:collection){
            if (dto.getNoOfPlayers()<23){
                System.out.println("The Number of players less than 23:"+dto);

            }
        }
        System.out.println("_____________________");

        System.out.println("Printing all Team names and NoOfPlayers");
        for (IplTeamDTO dto : collection) {
            System.out.println("Team Names:" + dto.getName());
            System.out.println("NoOfPlayers:"+dto.getNoOfPlayers());
            System.out.println("--------------");
        }
        System.out.println("_____________________");
        
        System.out.println("printing All team names with their budget:");
        for (IplTeamDTO dto:collection){

            System.out.println("The Team name: "+dto.getName());
            System.out.println("Budget:"+dto.getBudget());
        }


        }
    }
    

