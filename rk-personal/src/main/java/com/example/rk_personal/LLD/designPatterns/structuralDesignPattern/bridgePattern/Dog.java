package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class Dog extends LivingThings{
    public Dog(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

//    @Override
//    void breathProcess() {
//        breatheImplementor.breatheProcess();
//    }
}
