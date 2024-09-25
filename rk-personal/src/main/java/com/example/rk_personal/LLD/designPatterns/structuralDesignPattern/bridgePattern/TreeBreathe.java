package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class TreeBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("breathes through its leaves.");
        System.out.println("takes CO2.");
        System.out.println("releases oxygen.");
    }
}
