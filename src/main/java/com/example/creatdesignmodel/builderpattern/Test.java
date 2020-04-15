package com.example.creatdesignmodel.builderpattern;

public class Test {
    public static void main(String[] args) {
       Computer computer = new Computer.ComputerBuilder("11","22").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
        System.out.println(computer);


    }
}
