package com.chenfeng.design.createtyp.builder;

public class Client {


    public static void main(String[] args) {
        Director director = new Director();

        Builder builder = new ConcreteBuilder();

        director.Construct(builder);
    }
}
