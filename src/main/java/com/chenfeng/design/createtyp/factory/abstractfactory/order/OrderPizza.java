package com.chenfeng.design.createtyp.factory.abstractfactory.order;

import com.chenfeng.design.createtyp.factory.abstractfactory.pizza.Pizza;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class OrderPizza {

	AbsFactory factory;

	// ������
	public OrderPizza(AbsFactory factory) {
		setFactory(factory);
	}

	private void setFactory(AbsFactory factory) {
		Pizza pizza = null;
		String orderType = ""; // �û�����
		this.factory = factory;
		do {
			orderType = getType();
			// factory �����Ǳ����Ĺ������࣬Ҳ�������׶صĹ�������
			pizza = factory.createPizza(orderType);
			if (pizza != null) { // ����ok
				pizza.prepare();
				pizza.bake();
				pizza.cut();
				pizza.box();
			} else {
				System.out.println("����ʧ��");
				break;
			}
		} while (true);
	}

	// дһ�����������Ի�ȡ�ͻ�ϣ����������������
	private String getType() {
		try {
			BufferedReader strin = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("input pizza ����:");
			String str = strin.readLine();
			return str;
		} catch (IOException e) {
			e.printStackTrace();
			return "";
		}
	}
}
