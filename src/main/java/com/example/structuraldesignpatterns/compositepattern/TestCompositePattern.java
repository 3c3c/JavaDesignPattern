package com.example.structuraldesignpatterns.compositepattern;

/**
 * 当我们需要批量修改行为的的时候
 * 我们可以写一个子类继承行为接口,在子类中创建一个行为的成员变量数组,并提供数组的增加删元素的方法
 * 在我们写的子类中,我们可以重写行为 为 批量重写行为
 * 这样我们就可以批量修改一批对象的行为
 */
public class TestCompositePattern {
    public static void main(String[] args) {
        Shape tri = new Triangle();
        Shape tri1 = new Triangle();
        Shape cir = new Circle();

        Drawing drawing = new Drawing();
        drawing.addShape(tri);
        drawing.addShape(tri1);
        drawing.addShape(cir);


        drawing.draw("(红色)");
        drawing.clearAll();
        drawing.addShape(tri);
        drawing.addShape(cir);
        drawing.draw("(绿色)");

    }

}
