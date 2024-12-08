package com.xworkz.group.dto;

public class ApplicationDTO {
    private  int id;
    private  String  name;
    private String type;
    private double version;
    private double size;
    private  String  companyName;

    public  void ApplicationDTO(){

    }

    public ApplicationDTO(int id, String name, String type, double version, double size, String companyName) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.version = version;
        this.size = size;
        this.companyName = companyName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getVersion() {
        return version;
    }

    public void setVersion(double version) {
        this.version = version;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    @Override
    public String toString() {
        return "ApplicationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type='" + type + '\'' +
                ", version=" + version +
                ", size=" + size +
                ", companyName='" + companyName + '\'' +
                '}';
    }
}
