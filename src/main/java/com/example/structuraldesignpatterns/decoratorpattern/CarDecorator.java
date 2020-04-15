package com.example.structuraldesignpatterns.decoratorpattern;

public class CarDecorator implements Car {
    //定义车辆
    protected Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    @Override
    public void assemble() {
        this.car.assemble();
    }
}
