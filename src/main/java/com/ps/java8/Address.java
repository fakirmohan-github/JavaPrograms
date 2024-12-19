package com.ps.java8;

public class Address {
    private Long pincode;
    private String city;

    public Long getPincode() {
        return pincode;
    }

    public void setPincode(Long pincode) {
        this.pincode = pincode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address(Long pincode, String city) {
        this.pincode = pincode;
        this.city = city;
    }

    public Address() {
    }

}
