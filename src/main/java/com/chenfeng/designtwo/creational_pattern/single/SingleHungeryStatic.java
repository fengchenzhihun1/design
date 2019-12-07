package com.chenfeng.designtwo.creational_pattern.single;

/**
 * 静态代码块
 */
public class SingleHungeryStatic {
    private static SingleHungeryStatic singleHungeryStatic ;

    private SingleHungeryStatic() {
    }
    static {
        singleHungeryStatic = new SingleHungeryStatic();
    }
    public static SingleHungeryStatic getInstance() {
        return singleHungeryStatic;
    }
}