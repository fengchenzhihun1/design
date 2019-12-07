package com.chenfeng.designtwo.creational_pattern.single;

/**
 * 双重检查，在开始时需要加入voliter ，指令重排序问题
 */
public class SingleDoubleCheck {
    private static volatile SingleDoubleCheck singleDoubleCheck;
    private SingleDoubleCheck(){}
    public SingleDoubleCheck getInstance(){
        if (singleDoubleCheck == null) {
            synchronized (SingleDoubleCheck.class){
                if (singleDoubleCheck == null) {
                    singleDoubleCheck = new SingleDoubleCheck();
                }
            }
        }
        return  singleDoubleCheck;
    }

}
