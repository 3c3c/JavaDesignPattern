package com.example.structuraldesignpatterns.decoratorpattern;

public class BasicCar implements Car {
    @Override
    public void assemble() {
        System.out.println("基础车");
    }
}
