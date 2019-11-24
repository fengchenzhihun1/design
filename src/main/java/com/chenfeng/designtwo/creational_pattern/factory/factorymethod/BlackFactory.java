package com.chenfeng.designtwo.creational_pattern.factory.factorymethod;

public class BlackFactory implements DrinkAbstractMethod{
    @Override
    public Drink createDrink() {
        return new BlackDrink();
    }
}
