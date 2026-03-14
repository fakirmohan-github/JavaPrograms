package com.ps.y_2026.march;

public class ShapeFactoryClass {
    public static Shape getShape(String type){
        if(type.equalsIgnoreCase("Circle")){
            return new Circle();
        }else if(type.equalsIgnoreCase("Rectangle")){
            return new Rectangle();
        }
        return null;
    }
}
