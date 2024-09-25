package com.example.rk_personal.LLD.designPatterns.creationalPatterns.factoryPattern;

public class Circle implements Shape{
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return 0;
    }
}
