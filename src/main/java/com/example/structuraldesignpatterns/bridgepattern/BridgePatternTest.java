package com.example.structuraldesignpatterns.bridgepattern;

/**
 * 桥接模式
 * 举例:
 *  形状: 圆形,方形...
 *  颜色: 红色,黑色...
 * 桥接模式是使用拼接的方式将形状与颜色两个维度拼接到一块
 * 优点,类少,更易于扩展
 */
public class BridgePatternTest {
    public static void main(String[] args) {
        Shape tri = new Triangle(new RedColor());
        tri.applyColor();
        Shape pent = new Pentagon(new GreenColor());
        pent.applyColor();
    }
}
