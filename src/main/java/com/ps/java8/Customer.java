package com.ps.java8;

import java.util.List;

public class Customer {
    private String custId;
    private String name;
    private List<Address> listOfAddr;

    public String getCustId() {
        return custId;
    }

    public void setCustId(String custId) {
        this.custId = custId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Address> getListOfAddr() {
        return listOfAddr;
    }

    public void setListOfAddr(List<Address> listOfAddr) {
        this.listOfAddr = listOfAddr;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "custId='" + custId + '\'' +
                ", name='" + name + '\'' +
                ", listOfAddr=" + listOfAddr +
                '}';
    }

}
