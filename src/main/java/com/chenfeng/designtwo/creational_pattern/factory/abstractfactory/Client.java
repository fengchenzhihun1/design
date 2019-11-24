package com.chenfeng.designtwo.creational_pattern.factory.abstractfactory;

public class Client {


    public static void main(String[] args) {
        Factory factory;
        Gun gun;
        Bullet bullet;
        factory = new Class_AK_Factory();
        bullet = factory.productBullet();
        bullet.load();
        gun = factory.productGun();
        gun.shooting();
    }
}
