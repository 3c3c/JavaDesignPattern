package com.example.structuraldesignpatterns.behavioraldesignpatterns;

/**
 * 行为模式
 * 使用抽象类定义一组行为,行为顺序不可逆,方法必须为final的,方式子类重写 修改行为
 * 如果子类存在不同的行为,把方法定义为抽象方法就好,由具体的子类进行实现
 */
public abstract class HouseTemplate {

    //此方法必须定义为final的,防止子类重写
    public final void buildHouse(){
        buildFoundation();
        buildPillars();
        biuldWall();
        buildWindow();
    }


    //提供穿件地基的方法
    private void buildFoundation(){
        System.out.println("使用水泥,石子,沙子创建地基");
    }

    //提供创建窗户的方法
    private void buildWindow(){
        System.out.println("使用玻璃创建窗户");
    }

    //提供创建墙的方法
    public abstract void biuldWall();

    //提供创建柱子的方法
    public abstract void buildPillars();

}
