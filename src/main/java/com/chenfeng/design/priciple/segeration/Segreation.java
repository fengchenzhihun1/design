package com.chenfeng.design.priciple.segeration;

public class Segreation {public static void main(String[] args) {
    // TODO Auto-generated method stub

}

}

//???
interface Interface1 {
    void operation1();
    void operation2();
    void operation3();
    void operation4();
    void operation5();
}

class B implements Interface1 {
    public void operation1() {
        System.out.println("B ????? operation1");
    }

    public void operation2() {
        System.out.println("B ????? operation2");
    }
    public void operation3() {
        System.out.println("B ????? operation3");
    }
    public void operation4() {
        System.out.println("B ????? operation4");
    }
    public void operation5() {
        System.out.println("B ????? operation5");
    }
}

class D implements Interface1 {
    public void operation1() {
        System.out.println("D ????? operation1");
    }

    public void operation2() {
        System.out.println("D ????? operation2");
    }
    public void operation3() {
        System.out.println("D ????? operation3");
    }
    public void operation4() {
        System.out.println("D ????? operation4");
    }
    public void operation5() {
        System.out.println("D ????? operation5");
    }
}

class A { //A ????????Interface1 ????(???) B????????????1,2,3????
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend2(Interface1 i) {
        i.operation2();
    }
    public void depend3(Interface1 i) {
        i.operation3();
    }
}

class C { //C ????????Interface1 ????(???) D????????????1,4,5????
    public void depend1(Interface1 i) {
        i.operation1();
    }
    public void depend4(Interface1 i) {
        i.operation4();
    }
    public void depend5(Interface1 i) {
        i.operation5();
    }
}