package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class Fish extends LivingThings{

    public Fish(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

//    @Override
//    void breathProcess() {
//        breatheImplementor.breatheProcess();
//    }
}
