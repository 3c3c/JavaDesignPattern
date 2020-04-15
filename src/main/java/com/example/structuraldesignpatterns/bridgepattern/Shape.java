package com.example.structuraldesignpatterns.bridgepattern;


public abstract class Shape {
    //当前形状的填充颜色
    protected Color color;

    //使用颜色对象构造
    public Shape(Color color) {
        this.color = color;
    }
    //此方法的时间要调用Color.applyColor
    abstract public void applyColor();
}
