package com.chenfeng.design.createtyp.factory.abstractfactory.order;


import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.Pizza;

//一个抽象工厂模式的抽象层(接口)
public interface AbsFactory {
	//让下面的工厂子类来 具体实现
	public Pizza createPizza(String orderType);
}
