package com.example.structuraldesignpatterns.bridgepattern;

public class RedColor implements Color {
    @Override
    public void applyColor() {
        System.out.println("红色");
    }
}
