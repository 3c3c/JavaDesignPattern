package com.example.structuraldesignpatterns.flyweightpattern;

import java.util.HashMap;
import java.util.Objects;

/**
 * 享元模式
 * 因为每次创建类消耗的资源大
 * 我们可以使用工厂类,创建出特定的类,如果需要取出特定的类,执行其方法
 * 减少了创建对象的时间,只需要指定对象所在的位置
 */
public class ShapeFactory {
    private static final HashMap<ShapeType,Shape> shapes = new HashMap<>();

    public static Shape getShape(ShapeType shapeType){
        Shape shapeImpl = shapes.get(shapeType);
        if(shapeImpl==null){
            if(Objects.equals(shapeType,ShapeType.OVAL_FILL)){
                shapeImpl = new Oval(true);
            }else if(Objects.equals(shapeType,ShapeType.OVAL_NOFILL)){
                shapeImpl = new Oval(false);
            }else if(Objects.equals(shapeType,ShapeType.LINE)){
                shapeImpl = new Line();
            }
            shapes.put(shapeType,shapeImpl);
        }
        return shapeImpl;
    }
    
    public static enum ShapeType{
        OVAL_FILL,OVAL_NOFILL,LINE;
    }

}
