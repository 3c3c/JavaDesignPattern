package com.example.structuraldesignpatterns.compositepattern;

import java.util.ArrayList;
import java.util.List;

public class Drawing implements Shape {
    //形状的集合
    private List<Shape> shapeList = new ArrayList<>();




    @Override
    public void draw(String fillColor) {
        for(Shape shape : shapeList){
            shape.draw(fillColor);
        }
    }


    //添加一个添加形状的方法
    public boolean addShape( Shape shape ){
        shapeList.add(shape);
        return true;
    }
    //添加一个移除形状的方法
    public boolean removeShape(Shape shape){
        shapeList.remove(shape);
        return true;
    }

    //清空所有形状的方法
    public Boolean clearAll(){
        shapeList.clear();
        return true;
    }

}
