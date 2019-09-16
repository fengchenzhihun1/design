package com.chenfeng.design.createtyp.single;

/**
 * 懒汉式，不存在创建对象，在多线程情况下，线程不安全的
 */


public class SingleLazyThreadNosafe {
    private static  SingleLazyThreadNosafe singleLazyThreadNosafe = null;
    SingleLazyThreadNosafe(){}
    public static SingleLazyThreadNosafe getInstance(){
        if (singleLazyThreadNosafe == null) {
            singleLazyThreadNosafe = new SingleLazyThreadNosafe();
        }
        return singleLazyThreadNosafe;
    }


}

