package com.ps.designpattern.factory;


import java.awt.*;

// Factory Class
public class ShapeFactory {

    // Factory method to get the Shape object based on the input
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }

        return null;
    }
}
