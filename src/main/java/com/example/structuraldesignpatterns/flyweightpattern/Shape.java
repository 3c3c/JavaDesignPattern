package com.example.structuraldesignpatterns.flyweightpattern;

import java.awt.*;

public interface Shape {
    public void draw(Graphics g,int x,int y, int width,int height,Color c);
}
