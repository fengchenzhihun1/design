package com.chenfeng.designtwo.creational_pattern.factory.abstractfactory;

public class AKBullet implements Bullet {
    @Override
    public void load() {
        System.out.println("我是Ak子弹");
    }
}
