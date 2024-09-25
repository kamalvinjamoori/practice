package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern;

public class ExtraMushrooms extends AbstractToppingsDecorator{

    BasePizza basePizza;

    public ExtraMushrooms(BasePizza basePizza){
        this.basePizza = basePizza;
    }

    @Override
    public int getCost(){
        return basePizza.getCost() + 30;
    }
}
