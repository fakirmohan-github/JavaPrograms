package com.ps.designpattern.factory;

import java.awt.*;

// Client Code to test the Factory Pattern
public class FactoryPatternDemo {
    public static void main(String[] args) {

        ShapeFactory shapeFactory = new ShapeFactory();

        // Get Circle object and call its draw method
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Get Rectangle object and call its draw method
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();
    }
}
