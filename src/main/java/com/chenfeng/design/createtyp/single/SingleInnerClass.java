package com.chenfeng.design.createtyp.single;


public class SingleInnerClass {
 private static SingleInnerClass singleInnerClass;
 private SingleInnerClass(){}
 private static class SingletonmInstance{
     private static final SingleInnerClass INSTANCE = new SingleInnerClass();
 }
 public static SingleInnerClass getInstance(){
     return SingletonmInstance.INSTANCE;
 }
}

