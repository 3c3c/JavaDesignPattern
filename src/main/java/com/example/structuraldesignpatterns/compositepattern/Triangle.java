package com.example.structuraldesignpatterns.compositepattern;

public class Triangle implements Shape {
    @Override
    public void draw(String fillColor) {
        System.out.println("用"+ fillColor +"颜色画一个方形");
    }
}
