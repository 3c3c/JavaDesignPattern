package com.example.structuraldesignpatterns.compositepattern;

public class Circle implements  Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("用"+fillColor+"颜色画一个圆形");
    }
}
