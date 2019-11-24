package com.chenfeng.designtwo.creational_pattern.factory.factorymethod;

public class CoceFactory implements DrinkAbstractMethod {
    @Override
    public Drink createDrink() {
        return new CoCoDrink();
    }
}
