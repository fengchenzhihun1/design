package com.chenfeng.design.createtyp.adapter;

public class VoltageAdapter extends Voltage220V implements  Voltage5V{
    @Override
    public int change5V() {
        int src = output220V();
        int destV= src / 44;
        return destV;
    }
}
