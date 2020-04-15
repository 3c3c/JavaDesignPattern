package com.example.structuraldesignpatterns.bridgepattern;

public class Triangle extends Shape {
    public Triangle(Color color) {
        super(color);
    }

    @Override
    public void applyColor() {
        System.out.print("长方形用颜色填充");
        color.applyColor();
    }
}
