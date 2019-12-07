package com.chenfeng.designtwo.creational_pattern.prototype;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/12/2 20:48
 * @Created by  wrsChen
 */
public class Client {
    public static void main(String[] args) {
        Sheep sheep = new Sheep("多利","白色","蒙古");
        Sheep sheep1 = (Sheep) sheep.clone();
        System.out.println("sheep" + sheep);
        System.out.println("克隆" + sheep1);
    }
}
