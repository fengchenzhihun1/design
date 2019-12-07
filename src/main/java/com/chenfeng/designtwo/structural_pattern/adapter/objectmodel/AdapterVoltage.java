package com.chenfeng.designtwo.structural_pattern.adapter.objectmodel;


/**
 * @Classname AdapterVoltage
 * @Description TODO
 * @Date 2019/12/3 20:04
 * @Created by  wrsChen
 */
public class AdapterVoltage implements VoltageV5 {
    private VoltageV200 voltagev200;
    public AdapterVoltage(VoltageV200 voltageV200){
        this.voltagev200 = voltageV200 ;
    }

    @Override
    public int outPut5() {
        return voltagev200.outPut200()/400;
    }
}
