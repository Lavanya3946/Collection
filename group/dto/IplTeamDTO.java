package com.xworkz.group.dto;

public class IplTeamDTO {
     private String name;
     private int noOfPlayers;
     private String ownerName;
     private String sponsor;
     private double budget;

     public IplTeamDTO(){

     }

    public IplTeamDTO(String name, int noOfPlayers, String ownerName, String sponsor, double budget) {
        this.name = name;
        this.noOfPlayers = noOfPlayers;
        this.ownerName = ownerName;
        this.sponsor = sponsor;
        this.budget = budget;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPlayers() {
        return noOfPlayers;
    }

    public void setNoOfPlayers(int noOfPlayers) {
        this.noOfPlayers = noOfPlayers;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public String getSponsor() {
        return sponsor;
    }

    public void setSponsor(String sponsor) {
        this.sponsor = sponsor;
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    @Override
    public String toString() {
        return "IplTeamDTO{" +
                "name='" + name + '\'' +
                ", noOfPlayers=" + noOfPlayers +
                ", ownerName='" + ownerName + '\'' +
                ", sponsor='" + sponsor + '\'' +
                ", budget=" + budget +
                '}';
    }
}
