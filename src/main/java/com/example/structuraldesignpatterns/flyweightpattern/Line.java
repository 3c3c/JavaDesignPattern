package com.example.structuraldesignpatterns.flyweightpattern;

import java.awt.*;

public class Line implements Shape {

    public Line() {
        System.out.println("创建一条线");
        try {
            Thread.sleep(2000);
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void draw(Graphics line, int x, int y, int width, int height, Color c) {
        line.setColor(c);
        line.drawLine(x,y,width,height);
    }
}
