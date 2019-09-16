package com.chenfeng.design.createtyp.single;

/**
 * 加方法锁，造成效率低
 */
public class SingleLazy {
    private static  SingleLazyThreadNosafe singleLazyThreadNosafe = null;
    private SingleLazy(){}
    public static synchronized SingleLazyThreadNosafe getInstance(){
        if (singleLazyThreadNosafe == null) {
            singleLazyThreadNosafe = new SingleLazyThreadNosafe();
        }
        return singleLazyThreadNosafe;
    }

}
