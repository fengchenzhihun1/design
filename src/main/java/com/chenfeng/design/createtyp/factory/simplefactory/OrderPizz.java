package com.chenfeng.design.createtyp.factory.simplefactory;

public class OrderPizz {
    public void getSimple(){
        Pizz pizz = SimpleFactory.createPizz("pizz");
        pizz.cut();
    }
}
