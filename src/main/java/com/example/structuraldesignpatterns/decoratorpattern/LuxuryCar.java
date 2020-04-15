package com.example.structuraldesignpatterns.decoratorpattern;

public class LuxuryCar extends CarDecorator {
    public LuxuryCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("添加奢华车的特征");
    }
}
