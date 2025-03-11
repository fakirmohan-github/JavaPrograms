package com.ps.java8.stream;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    Long id;
    String name;
    String tier;

    public Customer(Long id, String name, String tier) {
        this.id = id;
        this.name = name;
        this.tier = tier;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTier() {
        return tier;
    }

    public void setTier(String tier) {
        this.tier = tier;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", tier=" + tier +
                '}';
    }
    public static List<Customer> getCustList(){
        List<Customer> custList = new ArrayList<>();
        custList.add(new Customer(101l,"Order1","A"));
        custList.add(new Customer(102l,"Order2","B"));
        custList.add(new Customer(103l,"Order3","C"));
        custList.add(new Customer(104l,"Order4","D"));
        return custList;

    }

}
