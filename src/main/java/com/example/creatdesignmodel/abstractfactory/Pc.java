package com.example.creatdesignmodel.abstractfactory;

public class Pc extends Computer {

    private String cpu;
    private String ram;
    private String hdd;

    public Pc(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public String getCpu() {
        return this.cpu;
    }

    @Override
    public String getRam() {
        return this.ram;
    }

    @Override
    public String getHdd() {
        return this.hdd;
    }
}
