package com.chenfeng.designtwo.structural_pattern.adapter.interfacemodel;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/12/3 20:52
 * @Created by  wrsChen
 */
public class Client {
    public static void main(String[] args) {
        AbstractAdapter abstractAdapter = new AbstractAdapter(){
            @Override
            public void m1() {
                super.m1();
            }
        };
        abstractAdapter.m1();
    }
}
