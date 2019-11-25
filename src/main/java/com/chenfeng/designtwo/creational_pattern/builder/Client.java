package com.chenfeng.designtwo.creational_pattern.builder;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

/**
 * @Classname Client
 * @Description TODO
 * @Date 2019/11/25 20:46
 * @Created by  wrsChen
 */
public class Client {
    public static void main(String[] args) {
        CarBuilder carBuilder = new FordCarBuilder();
        CarDirector carDirector = new CarDirector(carBuilder);
        Car car = carDirector.productCar();
        System.out.println(car.toString()     );
    }


}
