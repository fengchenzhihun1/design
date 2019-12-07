package com.chenfeng.designtwo.structural_pattern.adapter.classmodel;



/**
 * @classname client
 * @description todo
 * @date 2019/12/3 20:06
 * @created by  wrschen
 */
public class Client {
    public static void main(String[] args) {
        VoltageV5 voltage5v = new AdapterVoltage();
        voltage5v.outPut5();
    }
}
