package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.facadePattern;

public class FacadeACOperation {
    ACOperations acOperations;

    public FacadeACOperation() {
        acOperations = new ACOperations();
    }

    public void startAC(){
        acOperations.clean();
        acOperations.checkVoltage();
        acOperations.checkGasLevel();
        acOperations.checkOutsideTemp();
        acOperations.start();
    }
}
