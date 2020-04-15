package com.example.structuraldesignpatterns.adapterdesignpattern;

public class Socket {
    //提供获取插座电压的方法
    public Volt getVolt() {
        return new Volt(120);
    }
}