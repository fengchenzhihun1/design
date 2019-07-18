package com.chenfeng.design.priciple.inversion;

public class DependecyInversion {
    public static void main(String[] args) {
        Email email = new Email();
        Personnel p = new Personnel();
        p.reciveInfo(email);
    }
}
//完成Person接收消息的功能
//方式1分析
//1. 简单，比较容易想到
//2. 如果我们获取的对象是 微信，短信等等，则新增类，同时Perons也要增加相应的接收方法
//3. 解决思路：引入一个抽象的接口IReceiver, 表示接收者, 这样Person类与接口IReceiver发生依赖
//   因为Email, WeiXin 等等属于接收的范围，他们各自实现IReceiver 接口就ok, 这样我们就符号依赖倒转原则
class Email{
    public String getInfo(){
        return "获取email信息";
    }
}

class Personnel {

    public String reciveInfo(Email email) {
        System.out.println(email.getInfo());
        return "";
    }
}