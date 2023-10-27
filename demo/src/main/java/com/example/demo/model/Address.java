package com.example.demo.model;

public class Address {
    private String country;
    private String street;
    private String city;

    // Constructors
    public Address() {
    }

    public Address(String country, String street, String city) {
        this.country = country;
        this.street = street;
        this.city = city;
    }

    // Getters and setters
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}