package com.example.structuraldesignpatterns.decoratorpattern;

public class SportsCar extends CarDecorator {

    public SportsCar(Car car) {
        super(car);
    }

    @Override
    public void assemble() {
        car.assemble();
        System.out.println("添加跑车的特征");
    }
}
