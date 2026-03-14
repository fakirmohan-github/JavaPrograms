package com.ps.y_2026.march;

public class ShapeClient {
    public static void main(String[] args) {
        Shape shape= ShapeFactoryClass.getShape("Circle");
        shape.draw();
        Shape shape1 = ShapeFactoryClass.getShape("Rectangle");
        shape1.draw();
    }
}
