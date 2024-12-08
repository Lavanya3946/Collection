package com.xworkz.sorting.things;

public class Person {
    private String name;
    private String email;
    private long phoneNum;
    private Address address;


    public Person(String name, String email, long phoneNum, Address address) {
        this.name = name;
        this.email = email;
        this.phoneNum = phoneNum;
        this.address = address;
    }


    public Person(String name, String email, long phoneNum) {
        this(name, email, phoneNum, null); // Call the new constructor
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(long phoneNum) {
        this.phoneNum = phoneNum;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", phoneNum=" + phoneNum +
                ", address=" + address +
                '}';
    }
}
