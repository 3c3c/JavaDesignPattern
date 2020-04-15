package com.example.structuraldesignpatterns.behavioraldesignpatterns;

public class WoodenHouse extends HouseTemplate {
    @Override
    public void biuldWall() {
        System.out.println("使用木头创建墙");
    }

    @Override
    public void buildPillars() {
        System.out.println("使用草装饰柱子");
    }
}
