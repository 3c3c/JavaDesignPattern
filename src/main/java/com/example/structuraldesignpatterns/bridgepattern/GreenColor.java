package com.example.structuraldesignpatterns.bridgepattern;

public class GreenColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("绿色");
    }
}
