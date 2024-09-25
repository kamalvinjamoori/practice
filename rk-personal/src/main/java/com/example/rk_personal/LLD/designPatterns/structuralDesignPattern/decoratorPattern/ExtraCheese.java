package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.decoratorPattern;

public class ExtraCheese extends AbstractToppingsDecorator{

    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza){
        this.basePizza = basePizza;
    }
    @Override
    public int getCost(){
       return basePizza.getCost() + 20;
    }
}
