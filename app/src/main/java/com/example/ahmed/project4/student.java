package com.example.ahmed.project4;

/**
 * Created by ahmed on 4/25/2017.
 */

public class student {

    private int id;
    private String name;
    private String degree;
    private String address;

    public student() {
    }

    public student(int id, String name, String degree, String address) {
        this.id = id;
        this.name = name;
        this.degree = degree;
        this.address = address;
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

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
