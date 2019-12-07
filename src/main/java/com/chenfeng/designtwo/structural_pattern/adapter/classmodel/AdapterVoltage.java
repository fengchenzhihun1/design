package com.chenfeng.designtwo.structural_pattern.adapter.classmodel;



/**
 * @Classname AdapterVoltage
 * @Description TODO
 * @Date 2019/12/3 20:04
 * @Created by  wrsChen
 */
public class AdapterVoltage extends VoltageV200 implements VoltageV5 {


    @Override
    public int outPut5() {
        return outPut200()/40;
    }
}
