package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
public class User {

    @Id
    @Field("_id")
    private String mongoId;
    private String id;
    private String username;
    private String name;
    private String surname;
    private Address address;

    // Constructors
    public User() {
    }

    public User(String id, String username, String name, String surname, Address address) {
        this.id = id;
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.address = address;
    }

    public String getMongoId() {
        return id;
    }

    public void setMongoId(String id) {
        this.id = id;
    }

    // Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
