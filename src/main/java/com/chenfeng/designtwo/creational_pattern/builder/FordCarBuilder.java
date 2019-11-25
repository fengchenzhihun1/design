package com.chenfeng.designtwo.creational_pattern.builder;

/**
 * @Classname FordCarBuilder
 * @Description TODO
 * @Date 2019/11/25 20:32
 * @Created by  wrsChen
 */
public class FordCarBuilder extends CarBuilder  {
    @Override
    public void assembledEngine() {
       car.setEngine("开始构建发动机引擎");
    }

    @Override
    public void assembledTyre() {
        car.setTyre("开始构建轮胎");
    }

    @Override
    public void assembledSteeringWheel() {
        car.setSteeringWheel("开始装配轮子");
    }
}
