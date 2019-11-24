package com.chenfeng.designtwo.creational_pattern.factory.factorymethod;

public class Client {
    public static void main(String[] args) {
        DrinkAbstractMethod drinkAbstractMethod = new BlackFactory();
        Drink blackDrink = drinkAbstractMethod.createDrink();

        DrinkAbstractMethod coceFactory = new CoceFactory();
        Drink drink = coceFactory.createDrink();
    }
}
