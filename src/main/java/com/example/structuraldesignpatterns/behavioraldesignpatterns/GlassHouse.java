package com.example.structuraldesignpatterns.behavioraldesignpatterns;

public class GlassHouse extends HouseTemplate {
    @Override
    public void biuldWall() {
        System.out.println("使用玻璃创建墙");
    }

    @Override
    public void buildPillars() {
        System.out.println("使用玻璃装饰柱子");
    }
}
