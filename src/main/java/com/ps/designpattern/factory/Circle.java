package com.ps.designpattern.factory;

import java.awt.*;

// Concrete Product 1: Circle
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}