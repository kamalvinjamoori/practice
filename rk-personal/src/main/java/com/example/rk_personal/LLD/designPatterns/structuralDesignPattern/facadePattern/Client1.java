package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.facadePattern;

public class Client1 {

    FacadeACOperation facadeACOperation = new FacadeACOperation();
    public void startAC(){
        facadeACOperation.startAC();
    }

}
