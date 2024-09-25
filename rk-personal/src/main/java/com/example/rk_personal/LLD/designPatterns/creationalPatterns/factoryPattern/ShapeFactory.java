package com.example.rk_personal.LLD.designPatterns.creationalPatterns.factoryPattern;

public class ShapeFactory {

    public Shape getShapeInstance(String shape){
        if ("Circle".equals(shape)){
            return new Circle(5);
        }else if ("Rectangle".equals(shape)){
            return new Rectangle(5, 5);
        }else if ("Square".equals(shape)){
            return new Square(5, 5);
        }
        return null;
    }

}
