package com.ps.designpattern.builder;

public class Demo {
    public static void main(String[] args) {
        // Creating a standard gaming computer
        Computer gamingComputer = new Computer.Builder("Intel i9", "32GB DDR5")
            .setGraphicsCard(true)
            .setStorage("2TB NVMe SSD")
            .build(); //

        System.out.println(gamingComputer);

        // Creating a basic office computer with default options for optional fields
        Computer officeComputer = new Computer.Builder("Intel i5", "16GB DDR4")
            .setBluetooth(true)
            .build();

        System.out.println(officeComputer);
    }
}
