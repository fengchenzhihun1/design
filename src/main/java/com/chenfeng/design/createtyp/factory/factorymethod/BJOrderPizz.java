package com.chenfeng.design.createtyp.factory.factorymethod;

public class BJOrderPizz extends OrderPizz{

    @Override
    Pizz createOizza(String orderType) {
        Pizz pizz = null;
        if ("".equals(orderType)){
            pizz = new LDPize();
        }
        return pizz;
    }
}
