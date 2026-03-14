package com.ps.y_2026.march;

public class Computer {
    private String brand;
    private String model;
    private double price;
    private int ram;

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getPrice() {
        return price;
    }

    public int getRam() {
        return ram;
    }
public static class ComputerBuilder {
    private String brand;
    private String model;
    private double price;
    private int ram;

    public ComputerBuilder setBrand(String brand) {
        this.brand = brand;
        return this;
    }

    public ComputerBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public ComputerBuilder setPrice(double price) {
        this.price = price;
        return this;
    }

    public ComputerBuilder setRam(int ram) {
        this.ram = ram;
        return this;
    }

    public Computer build() {
        Computer computer = new Computer();
        computer.brand = this.brand;
        computer.model = this.model;
        computer.price = this.price;
        computer.ram = this.ram;
        return computer;
    }
}
}
