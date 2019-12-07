package com.chenfeng.designtwo.creational_pattern.prototype;

import java.io.*;

/**
 * @Classname DeepClone
 * @Description TODO
 * @Date 2019/12/2 21:20
 * @Created by  wrsChen
 */
public class DeepClone implements Serializable,  Cloneable{
    public String name;
    public DeepClone deepClone;
    public Sheep sheep;
    public DeepClone() {
       super();
    }

    // 深拷贝 方式一
    @Override
    protected  Object clone() throws CloneNotSupportedException {
     Object deep = null;

     deep = super.clone();

     // 对引用类型的属性
     DeepClone deepClone = (DeepClone)deep;
     deepClone.sheep = (Sheep)sheep.clone();
     return deepClone;
    }
    // 方式二 通过对象序列化实现
    public Object deepClone(){
        DeepClone de = null;
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;
        // 序列化
        try {
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);
            oos.writeObject(this);
            // 反序列化
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);
            de = (DeepClone) ois.readObject();
        }
        catch (Exception e){

        }
        return de;
    }
}
