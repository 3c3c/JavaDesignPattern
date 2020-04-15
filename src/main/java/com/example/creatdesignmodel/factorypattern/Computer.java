package com.example.creatdesignmodel.factorypattern;

public abstract class Computer {
    public abstract String getCpu();
    public abstract String getRam();
    public abstract String getHdd();

    @Override
    public String toString() {
        return "Computer{cpu:"+getCpu()+", Ram:"+getRam()+", Hdd:"+getHdd()+"}";
    }
}
