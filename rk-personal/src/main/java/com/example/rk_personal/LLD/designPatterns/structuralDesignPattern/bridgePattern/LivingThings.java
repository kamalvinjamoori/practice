package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public abstract class LivingThings {
    BreatheImplementor breatheImplementor;
    public LivingThings(BreatheImplementor breatheImplementor){
        this.breatheImplementor = breatheImplementor;
    }
    public void breathProcess(){
        breatheImplementor.breatheProcess();
     };
}
