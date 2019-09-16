package com.chenfeng.design.createtyp.single;

/**
 * 静态代码块
 */
public class SingleHungeryStatic {
    private static  SingleHungeryStatic singleHungeryStatic ;

    private SingleHungeryStatic() {
    }
    static {
        singleHungeryStatic = new SingleHungeryStatic();
    }
    public static SingleHungeryStatic getInstance() {
        return singleHungeryStatic;
    }
}