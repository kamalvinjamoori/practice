package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class Tree extends LivingThings{
    public Tree(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

//    @Override
//    void breathProcess() {
//        breatheImplementor.breatheProcess();
//    }
}
