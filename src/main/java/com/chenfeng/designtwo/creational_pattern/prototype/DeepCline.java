package com.chenfeng.designtwo.creational_pattern.prototype;

/**
 * @Classname DeepCline
 * @Description TODO
 * @Date 2019/12/2 21:53
 * @Created by  wrsChen
 */
public class DeepCline  {
    public static void main(String[] args) {
        DeepClone deepClone =  new DeepClone();
        DeepClone deepClone1 = (DeepClone) deepClone.deepClone();
    }
}
