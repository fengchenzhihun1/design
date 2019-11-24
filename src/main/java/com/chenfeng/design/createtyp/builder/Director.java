package com.chenfeng.design.createtyp.builder;

public class Director {
    public void Construct(Builder builder){
        builder.addproduct();
        builder.builderProduct();
        builder.successProduct();
    }
}
