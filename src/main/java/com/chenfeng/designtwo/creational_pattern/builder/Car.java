package com.chenfeng.designtwo.creational_pattern.builder;

import lombok.Data;

/**
 * @Classname Car
 * @Description TODO
 * @Date 2019/11/25 20:08
 * @Created by  wrsChen
 */
@Data
public class Car {
    /**
     * 轮胎
     */
    private String  tyre;
    /**
     * 方向盘
     */
    private String  steeringWheel;
    /**
     * 发动机
     */
    private String  engine;
 }
