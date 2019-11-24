package com.chenfeng.designtwo.creational_pattern.factory.abstractfactory;

public class Class_AK_Factory implements Factory{

    @Override
    public Gun productGun() {
        return new AKGun();
    }

    @Override
    public Bullet productBullet() {
        return new AKBullet();
    }
}
