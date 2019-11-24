package com.chenfeng.designtwo.creational_pattern.factory.abstractfactory;

public class AKGun implements Gun {
    @Override
    public void shooting() {
        System.out.println("我是AK类");
    }
}
