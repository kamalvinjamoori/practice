package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class WaterBreathe implements BreatheImplementor{

    @Override
    public void breatheProcess() {
        System.out.println("breathes through its gills.");
        System.out.println("takes oxygen.");
        System.out.println("leaves CO2.");
    }
}
