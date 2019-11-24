package com.chenfeng.design.createtyp.builder;

public class ConcreteBuilder extends  Builder {
    Product product = new Product();
    @Override
    public void addproduct() {
        product.setAge("aa");
        System.out.println();
    }

    @Override
    public void builderProduct() {
        System.out.println();
    }

    @Override
    public void successProduct() {

    }
}
