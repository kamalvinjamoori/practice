package com.example.rk_personal.LLD.designPatterns.structuralDesignPattern.adapterPattern;

public class WeightMachineAdapterImpl implements WeightMachineAdapter{

    private WeightMachine weightMachine;

    public WeightMachineAdapterImpl(WeightMachine weightMachine){
        this.weightMachine = weightMachine;
    }

    @Override
    public int getWeightInKgs() {
        int weightInPounds = weightMachine.getWeightInPounds();
        return (int) (weightInPounds * 0.45);

    }
}
