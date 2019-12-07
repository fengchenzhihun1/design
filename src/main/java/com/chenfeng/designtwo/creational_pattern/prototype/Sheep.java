package com.chenfeng.designtwo.creational_pattern.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Classname Sheep
 * @Description TODO
 * @Date 2019/12/2 20:16
 * @Created by  wrsChen
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Sheep implements Cloneable{
    private String name;
    private String color;
    private String address;
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return sheep;
    }
}
