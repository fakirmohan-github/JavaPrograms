package com.ps.y_2026.march;

public class ComputerBuilderDemo {
    public static void main(String[] args) {
        Computer computer = new Computer.ComputerBuilder()
                .setBrand("LG")
                .setModel("S200")
                .setRam(16)
                .setPrice(70000.00)
                .build();
        System.out.println("Brand: " + computer.getBrand());
        System.out.println("Model: " + computer.getModel());
        System.out.println("RAM: " + computer.getRam() + " GB");
        System.out.println("Price: Rs. " + computer.getPrice());
    }
}
