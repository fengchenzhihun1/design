
# 創建型
## 克隆 
### 两种方式
1. 使用jdk自带的clone方法，并实现相关的接口
    注意点是当其中有引用类型的时候需要在clone中继续写重楼别而方法
    
2. 使用输入输出流，序列化对象；
   浅拷贝与深拷贝，基础数据类型会copy引用类型并不会
## 建造者（生成器）
/**将一个复杂对象  的构建与它的表示分离，使得同样的构建可以创建不同的表示**/
### 建造者模式的四个角色
1. product(产品角色) 一个具体的产品对象
2. Builder （抽象建造者） 创建一个product对象的个个不见指定的接口/抽象类
3. ConcreteBuilder（具体建造者）实现接口，构建和装配各个部件
4. Director （指挥者） 构建一个使用builder接口的对象，它主要是用于创建一个复杂对象、主要两个作用，
一：隔离了客户与对象的生产过程，二是：负责控制产品对象的生产过程；


## 适配器
（1） 适配器目的将某个类的接口转换成客户端期望的另一个接口主要目的是兼容性，让原本两个不匹配的能在一起工作
其别名为包装（Wrapper）
（2）适配器模式属于结构型模式
（3）类适配器模式、对象适配器模式、接口适配器模式   
   
## 桥接

1. 抽象类 抽象类的实现类（构造方法中传递解耦）
2. 接口 接口的实现类
3. 客户端
       
