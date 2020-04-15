package com.example.structuraldesignpatterns.flyweightpattern;

import java.awt.*;

public class Oval implements Shape {
    //是否需要填充颜色
    private boolean fill;

    public Oval(boolean fill) {
        this.fill = fill;
        System.out.println("创建一个椭圆形并且颜色填充为"+fill);
    }

    @Override
    public void draw(Graphics oval, int x, int y, int width, int height, Color c) {
        oval.setColor(c);
        oval.drawOval(x,y,width,height);
        if(fill){
            oval.fillOval(x,y,width,height);
        }
    }
}
