package com.chenfeng.design.createtyp.adapter;

public class Phone {
    public void charging(Voltage5V voltage5V){
        if (voltage5V.change5V() == 5) {
            System.out.printf("可以充点");
        } else {
            System.out.println("电压过高");
        }
    }
}
