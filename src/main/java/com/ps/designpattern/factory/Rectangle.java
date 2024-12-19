package com.ps.designpattern.factory;

import java.awt.*;

// Concrete Product 2: Rectangle
public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}