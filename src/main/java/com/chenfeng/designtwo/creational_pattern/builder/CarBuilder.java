package com.chenfeng.designtwo.creational_pattern.builder;

/**
 * @Classname CarBuilder
 * @Description TODO
 * @Date 2019/11/25 20:26
 * @Created by  wrsChen
 */
public abstract class CarBuilder {
    Car car = new Car();
    public abstract void assembledEngine();
    public abstract void assembledTyre();
    public abstract void assembledSteeringWheel();
    public Car getCar(){
        return car;
    }

}
