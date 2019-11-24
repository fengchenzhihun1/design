package com.chenfeng.designtwo.creational_pattern.factory.abstractfactory;

public class Class_M4A1_Factory implements Factory {
    @Override
    public Gun productGun() {
        return new M4AGun();
    }

    @Override
    public Bullet productBullet() {
        return new M4A1Bullet();
    }
}
