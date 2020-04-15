package com.example.creatdesignmodel.abstractfactory;

public class TestAbstractFactory {

    public static void main(String[] args) {
        AbstractFactory factory = new ServerFactory("44","55","66");
        Computer computer = factory.getComputer();
        System.out.println(computer);
    }

}
