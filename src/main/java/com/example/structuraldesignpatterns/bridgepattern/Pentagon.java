package com.example.structuraldesignpatterns.bridgepattern;

public class Pentagon extends Shape {
    public Pentagon(Color color) {
        super(color);
    }
    @Override
    public void applyColor() {
        System.out.print("五角星用颜色填充");
        color.applyColor();
    }
}
