package com.chenfeng.designtwo.creational_pattern.factory.simplefactory;

public class SteamedBread implements Flour{
    private String name;
    public SteamedBread(){}
    public SteamedBread(String name){
        this.name = name;
    }
    @Override
    public void productName() {
        System.out.println("name:" + name);
    }
}
