package com.example.creatdesignmodel.factorypattern;

public class TestFactory {
    public static void main(String[] args) {
        Computer a = ComputerFactory.getComputer("pc","11","22","33");
        System.out.println(a);


    }
}
