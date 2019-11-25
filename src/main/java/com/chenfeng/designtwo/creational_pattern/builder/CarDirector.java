package com.chenfeng.designtwo.creational_pattern.builder;



/**
 * @Classname CarDirector
 * @Description TODO
 * @Date 2019/11/25 20:41
 * @Created by  wrsChen
 */
public class CarDirector {
    private CarBuilder builder;
    public  CarDirector(CarBuilder builder){
        this.builder = builder;
    }
    public Car productCar(){
        builder.assembledEngine();
        builder.assembledSteeringWheel();
        builder.assembledTyre();
        return builder.getCar();
    }
}
