package com.chenfeng.designtwo.creational_pattern.factory.simplefactory;

public class Dumplings implements Flour {
    private String name;

    public Dumplings(){

    }

    public  Dumplings(String name){
        this.name = name;
    }
    @Override
    public void productName() {
        System.out.println("name" + name);
    }
}
