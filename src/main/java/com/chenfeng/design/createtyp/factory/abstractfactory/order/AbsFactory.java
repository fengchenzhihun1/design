package com.chenfeng.design.createtyp.factory.abstractfactory.order;


import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.Pizza;

//һ�����󹤳�ģʽ�ĳ����(�ӿ�)
public interface AbsFactory {
	//������Ĺ��������� ����ʵ��
	public Pizza createPizza(String orderType);
}
