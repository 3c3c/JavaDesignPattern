package com.example.creatdesignmodel.abstractfactory;

public class ServerFactory extends AbstractFactory {
    private String cpu;
    private String ram;
    private String hdd;

    public ServerFactory(String cpu, String ram, String hdd) {
        this.cpu = cpu;
        this.ram = ram;
        this.hdd = hdd;
    }

    @Override
    public Computer getComputer() {
        return new Server(cpu,ram,hdd);
    }
}
