package com.chenfeng.designtwo.creational_pattern.factory.simplefactory;

public class SimpleFactory {
    public static Flour  createFlour(String productName) {
        Flour flour = null;
        if ("dum".equals(productName)) {
            flour = new Dumplings("好吃的饺子");
        } else {
            flour = new SteamedBread("好吃的包子");
        }
        return flour;
    }
}
