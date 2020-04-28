package com.FirstJavaProject.Objects;

public class Client {
    private String name;
    private String fName;
    private String address;
    private String city;

    public Client(String name, String fName, String address, String city) {
        this.name = name;
        this.fName = fName;
        this.address = address;
        this.city = city;
    }

    public Client(String name, String fName, String city) {
        this.name = name;
        this.fName = fName;
        this.city = city;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFName() {
        return fName;
    }

    public void setFName(String fName) {
        this.fName = fName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
