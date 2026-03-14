package com.ps.designpattern.builder;

public class Computer {
    // Required parameters
    private final String CPU;
    private final String RAM;

    // Optional parameters
    private final boolean hasGraphicsCard;
    private final boolean hasBluetooth;
    private final String storage;

    // Private constructor that takes a Builder object
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
        this.hasGraphicsCard = builder.hasGraphicsCard;
        this.hasBluetooth = builder.hasBluetooth;
        this.storage = builder.storage;
    }

    // Getters for the fields (no public setters)
    public String getCPU() { return CPU; }
    public String getRAM() { return RAM; }
    public boolean hasGraphicsCard() { return hasGraphicsCard; }
    public boolean hasBluetooth() { return hasBluetooth; }
    public String getStorage() { return storage; }

    @Override
    public String toString() {
        return "Computer [CPU=" + CPU + ", RAM=" + RAM + ", Graphics Card=" + hasGraphicsCard + ", Bluetooth=" + hasBluetooth + ", Storage=" + storage + "]";
    }

    // Static nested Builder class
    public static class Builder {
        // Same fields as Computer
        private final String CPU; // Mandatory
        private final String RAM; // Mandatory
        private boolean hasGraphicsCard = false; // Optional, with default
        private boolean hasBluetooth = false; // Optional, with default
        private String storage = "500GB HDD"; // Optional, with default

        // Public constructor for mandatory parameters
        public Builder(String CPU, String RAM) {
            this.CPU = CPU;
            this.RAM = RAM;
        }

        // Setter-like methods for optional parameters, returning the Builder instance
        public Builder setGraphicsCard(boolean hasGraphicsCard) {
            this.hasGraphicsCard = hasGraphicsCard;
            return this; // Enables method chaining
        }

        public Builder setBluetooth(boolean hasBluetooth) {
            this.hasBluetooth = hasBluetooth;
            return this;
        }

        public Builder setStorage(String storage) {
            this.storage = storage;
            return this;
        }

        // The build method creates the final Computer object
        public Computer build() {
            return new Computer(this);
        }
    }
}

