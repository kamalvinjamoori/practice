package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class LandBreathe implements BreatheImplementor{
    @Override
    public void breatheProcess() {
        System.out.println("breathes through its mouth.");
        System.out.println("takes oxygen.");
        System.out.println("leaves CO2.");
    }
}
