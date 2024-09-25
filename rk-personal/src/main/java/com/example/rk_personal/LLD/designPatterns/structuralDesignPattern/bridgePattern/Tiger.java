package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.bridgePattern;

public class Tiger extends LivingThings{

    public Tiger(BreatheImplementor breatheImplementor) {
        super(breatheImplementor);
    }

//    @Override
//    void breathProcess() {
//        breatheImplementor.breatheProcess();
//    }
}
