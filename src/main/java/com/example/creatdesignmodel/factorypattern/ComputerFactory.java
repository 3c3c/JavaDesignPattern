package com.example.creatdesignmodel.factorypattern;

import java.util.Objects;

public class ComputerFactory {


    public static Computer getComputer( String type, String cpu, String ram, String hdd){
        if(Objects.equals(type,"pc")){
            return new Pc(cpu,ram,hdd);
        }else if(Objects.equals(type,"server")){
            return new Server(cpu,ram,hdd);
        }
        return null;
    }

}
