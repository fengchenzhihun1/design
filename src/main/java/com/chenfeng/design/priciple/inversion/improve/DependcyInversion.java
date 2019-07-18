package com.chenfeng.design.priciple.inversion.improve;

import org.junit.Test;

public class DependcyInversion {
   /**
    * 接口方式进行依赖
    * @author： chenfeng
    * @date： 2019/7/17 21:31
    */
    @Test
    public void testInterface(){
        ITv iTv = new ChangHong();
        OpenTv openTv = new OpenTvImpl();
        openTv.playTv(iTv);
    }
    /**
     * 构造器方式进行依赖
     * @return： void
     * @exception：
     * @author： chenfeng
     * @date： 2019/7/17 21:43
     */
    @Test
    public  void Custor(){
        Custrose custrose = new CustroseImpl();
        CustroseM custroseM = new CustroseM(custrose);
        custroseM.getCustose();
    }
    /** 
     * set方式
     * @return： void
     * @exception： 
     * @author： chenfeng
     * @date： 2019/7/17 21:52
     */
    @Test
    public  void setMethod(){
        DependcyBySet dependcyBySet = new DepenceBySetImpl();
        DepencySet dependcyBySets = new DepencySet();
        dependcyBySets.setDependcyBySet(dependcyBySet);
        dependcyBySets.getDependcy();
    }
}

interface  ITv{
    void openTV();
}
/**************************接口方式依赖开始****************************************/
class ChangHong implements ITv{
    @Override
    public void openTV() {
        System.out.println("通过接口方式打开电视机");
    }
}
interface  OpenTv{
    void playTv(ITv iTv);
}

class OpenTvImpl implements  OpenTv{

    @Override
    public void playTv(ITv iTv) {
        iTv.openTV();
    }
}
/************************接口方式结束****************************************/

/**********************构造器方式开始****************************************/
interface  Custrose {
    void playGirle();
}

class CustroseImpl implements Custrose {

    @Override
    public void playGirle() {
        System.out.println("构造器方式创建女朋友");
    }
}

class  CustroseM{
    Custrose custrose;
    public  CustroseM(Custrose custrose){
        this.custrose = custrose;
    }
    public void getCustose(){
        custrose.playGirle();
    }
}
/**********************构造器方式结束****************************************/

/**********************set方式开始****************************************/
interface DependcyBySet{
    void dependcy();
}
class DepenceBySetImpl implements  DependcyBySet{

    @Override
    public void dependcy() {
        System.out.println("我是set方法的女朋友");
    }
}

class DepencySet{
 DependcyBySet dependcyBySet;
    public void getDependcy(){
        dependcyBySet.dependcy();
    }
    public DependcyBySet getDependcyBySet() {
        return dependcyBySet;
    }
    public void setDependcyBySet(DependcyBySet dependcyBySet) {
        this.dependcyBySet = dependcyBySet;
    }
}
/**********************set方式结束****************************************/