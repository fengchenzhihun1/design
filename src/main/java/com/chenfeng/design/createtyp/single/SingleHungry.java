package com.chenfeng.design.createtyp.single;

/**
 * 饿汉（静态常量）
 * 优点：类加载的时候就完成实例化，避免了线程同步问题
 * 缺点：如果类从始至终没有使用过可能会造成内存浪费、
 */
public class SingleHungry {
    private static final SingleHungry singleHungry = new SingleHungry();
    private SingleHungry(){}
    public static SingleHungry getInstance(){
        return singleHungry;
    }
}
