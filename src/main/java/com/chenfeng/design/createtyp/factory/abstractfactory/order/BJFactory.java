package com.chenfeng.design.createtyp.factory.abstractfactory.order;


import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.BJCheesePizza;
import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.BJPepperPizza;
import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.Pizza;

//���ǹ�������
public class BJFactory implements AbsFactory {

	@Override
	public Pizza createPizza(String orderType) {
		System.out.println("~ʹ�õ��ǳ��󹤳�ģʽ~");
		// TODO Auto-generated method stub
		Pizza pizza = null;
		if(orderType.equals("cheese")) {
			pizza = new BJCheesePizza();
		} else if (orderType.equals("pepper")){
			pizza = new BJPepperPizza();
		}
		return pizza;
	}

}
