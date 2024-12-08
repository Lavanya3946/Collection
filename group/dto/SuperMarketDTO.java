package com.xworkz.group.dto;

public class SuperMarketDTO {
    private  String  name;
    private  String  location;
    private  int totalStaff;
    private  int totalArea;
    private  String managerName;

    public  void SuperMarketDTO(){

    }

    public SuperMarketDTO(String name, String location, int totalStaff, int totalArea, String managerName) {
        this.name = name;
        this.location = location;
        this.totalStaff = totalStaff;
        this.totalArea = totalArea;
        this.managerName = managerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getTotalStaff() {
        return totalStaff;
    }

    public void setTotalStaff(int totalStaff) {
        this.totalStaff = totalStaff;
    }

    public int getTotalArea() {
        return totalArea;
    }

    public void setTotalArea(int totalArea) {
        this.totalArea = totalArea;
    }

    public String getManagerName() {
        return managerName;
    }

    public void setManagerName(String managerName) {
        this.managerName = managerName;
    }

    @Override
    public String toString() {
        return "SuperMarketDTO{" +
                "name='" + name + '\'' +
                ", location='" + location + '\'' +
                ", totalStaff=" + totalStaff +
                ", totalArea=" + totalArea +
                ", managerName='" + managerName + '\'' +
                '}';
    }
}
