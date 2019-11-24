package com.chenfeng.design.createtyp.prototype;

public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("1","qqq",1);
        Sheep sheep1 = (Sheep)sheep.clone();
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        System.out.println(sheep.getClass() + sheep.toString());
        System.out.println(sheep1 + sheep1.toString());
        System.out.println(sheep2 + sheep2.toString());
        System.out.println(sheep3 + sheep3.toString());
    }
}
