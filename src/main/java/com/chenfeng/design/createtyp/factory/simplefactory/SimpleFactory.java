package com.chenfeng.design.createtyp.factory.simplefactory;

public class SimpleFactory {
    public static Pizz createPizz(String type){
        Pizz pizz = null;
        if ("greeek".equals(type)) {
            GreekPize greekPize = new GreekPize();
        } else if("plk".equals(type)){
            PikPizz pikPizz = new PikPizz();
        }
        return pizz;
    }
}
