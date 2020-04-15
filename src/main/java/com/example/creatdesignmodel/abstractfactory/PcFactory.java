package com.example.creatdesignmodel.abstractfactory;

public class PcFactory extends AbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public PcFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer getComputer() {
        return new Pc(cpu,ram,hdd);
    }
}
