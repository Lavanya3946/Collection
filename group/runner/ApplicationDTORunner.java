package com.xworkz.group.runner;

import com.xworkz.group.dto.ApplicationDTO;

import java.util.ArrayList;
import java.util.Collection;

public class ApplicationDTORunner {

    public static void main(String[] args) {
        ApplicationDTO applicationDTO1=new ApplicationDTO(1,"Whatsapp","messaging app",2.23,80,"meta");
        ApplicationDTO applicationDTO2=new ApplicationDTO(2,"Instagram","Social media",320,200,"meta");
        ApplicationDTO applicationDTO3=new ApplicationDTO(3,"FaceBook","social media",438,100,"meta");
        ApplicationDTO applicationDTO4=new ApplicationDTO(4,"TikTok","Video sharing app",31,250,"ByteDance");
        ApplicationDTO applicationDTO5=new ApplicationDTO(5,"Youtube","Video Streaming",19,140,"Google");
        ApplicationDTO applicationDTO6=new ApplicationDTO(6,"Snapchat","Social media app",12,80,"Snap Inc");
        ApplicationDTO applicationDTO7=new ApplicationDTO(7,"Google Chrome"," Web Browser",119,150,"Google");
        ApplicationDTO applicationDTO8=new ApplicationDTO(8,"Gmail","Email Client",2024,75,"Google");
        ApplicationDTO applicationDTO9=new ApplicationDTO(9,"Spotify","Music Streaming",8.8,100,"Spotify Technology");
        ApplicationDTO applicationDTO10=new ApplicationDTO(10,"NetFlix","Video Streaming",8.98,100,"Netflix Inc");
        ApplicationDTO applicationDTO11=new ApplicationDTO(11,"Microsoft Teams","Collaboration Tool",141,120,"Microsoft");
        ApplicationDTO applicationDTO12=new ApplicationDTO(12,"Zoom","Video Streaming",5.16,100,"Zoom Video Communications");
        ApplicationDTO applicationDTO13=new ApplicationDTO(13,"Amazon","E-commerce",26,80,"Amazon Inc");
        ApplicationDTO applicationDTO14=new ApplicationDTO(14," Google Maps","Navigation",11,75,"Google");
        ApplicationDTO applicationDTO15=new ApplicationDTO(15," Uber","Ride-hailing",4.530,100,"Uber Technologies");
        ApplicationDTO applicationDTO16=new ApplicationDTO(16," PayPal","Payment gateway",8.24,70,"paypal Inc");
        ApplicationDTO applicationDTO17=new ApplicationDTO(17," Twitter","Social media",10,90,"X Corp");
        ApplicationDTO applicationDTO18=new ApplicationDTO(18," Discord"," communication app",2024,150,"Discord Inc");
        ApplicationDTO applicationDTO19=new ApplicationDTO(19,"Telegram","Messaging app",10,70,"Telegram FZ-LLC");
        ApplicationDTO applicationDTO20=new ApplicationDTO(20,"Adobe Acrobat Reader","Pdf Reader",23,100,"Adobe Inc");

        Collection<ApplicationDTO> collection=new ArrayList<>();
        collection.add(applicationDTO1);
        collection.add(applicationDTO2);
        collection.add(applicationDTO3);
        collection.add(applicationDTO4);
        collection.add(applicationDTO5);
        collection.add(applicationDTO6);
        collection.add(applicationDTO7);
        collection.add(applicationDTO8);
        collection.add(applicationDTO9);
        collection.add(applicationDTO10);
        collection.add(applicationDTO11);
        collection.add(applicationDTO12);
        collection.add(applicationDTO13);
        collection.add(applicationDTO14);
        collection.add(applicationDTO15);
        collection.add(applicationDTO16);
        collection.add(applicationDTO17);
        collection.add(applicationDTO18);
        collection.add(applicationDTO19);
        collection.add(applicationDTO20);

        System.out.println("printing All Application Name and companyName:");
        for (ApplicationDTO dto:collection){
            System.out.println( "Application Name:"+dto.getName());
            System.out.println("Application Company Name:"+dto.getCompanyName());
            System.out.println("______________________");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("Printing All application Name ,company Name and size :");
        for (ApplicationDTO dto:collection){
            System.out.println("Application Name:"+dto.getName());
            System.out.println("Application Company Name:"+dto.getCompanyName());
            System.out.println("Application Size:"+dto.getSize());
            System.out.println("_____________");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++");
        for (ApplicationDTO dto:collection){
            if (dto.getType()=="Video Streaming"){
                System.out.println("The Application Type of Video Streaming:  "+dto);
            }
        }



    }
}
