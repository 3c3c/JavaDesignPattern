package com.example.structuraldesignpatterns.adapterdesignpattern;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class Volt {
    //电压
    private int volts;
    public Volt(int v){
        this.volts=v;
    }
    public int getVolts() {
        return volts;
    }
    public void setVolts(int volts) throws Exception {
        this.volts = volts;
    }
}
