package com.MyShop.ECommerceAPI.entity;

public class User {
    private long Id;
    private String Name;
    private int Role;
    private String Address;

    public User(long id, int role, String name, String address) {
        Id = id;
        Role = role;
        Name = name;
        Address = address;
    }

    public long getId() {
        return Id;
    }

    public void setId(long id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getRole() {
        return Role;
    }

    public void setRole(int role) {
        Role = role;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String address) {
        Address = address;
    }
}
