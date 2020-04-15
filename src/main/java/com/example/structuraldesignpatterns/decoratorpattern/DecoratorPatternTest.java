package com.example.structuraldesignpatterns.decoratorpattern;

/**
 * 装饰模式
 * 动态的给对象添加一些额外的职责,就增加对象功能来说,装饰模式比生成子类更为灵活
 */
public class DecoratorPatternTest {
    public static void main(String[] args) {
        Car sportsCar = new SportsCar(new BasicCar());
        sportsCar.assemble();
        System.out.println("\n*****");
        //此方式使用既有了豪华车的特征又有了跑车的特征
        Car sportsLuxuryCar = new SportsCar(new LuxuryCar(new BasicCar()));
        sportsLuxuryCar.assemble();
    }
}
