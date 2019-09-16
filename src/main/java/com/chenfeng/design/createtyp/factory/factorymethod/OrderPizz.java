package com.chenfeng.design.createtyp.factory.factorymethod;

public abstract class OrderPizz {
public OrderPizz(){}
    abstract Pizz createOizza(String orderType);
    public OrderPizz(String type){

        Pizz pizz = null;
        pizz = createOizza(type);
        pizz.bake();
        pizz.cut();
    }
}
