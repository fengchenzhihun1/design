package com.chenfeng.designtwo.structural_pattern.adapter.objectmodel;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/12/3 20:30
 * @Created by  wrsChen
 */
public class Client {
    public static void main(String[] args) {
        AdapterVoltage adapterVoltage = new AdapterVoltage(new VoltageV200());
        adapterVoltage.outPut5();
    }
}
