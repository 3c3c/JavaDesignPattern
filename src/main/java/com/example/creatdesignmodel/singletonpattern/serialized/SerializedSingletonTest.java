package com.example.creatdesignmodel.singletonpattern.serialized;

import java.io.*;


/**
 *测试序列化之前的对象与 (经历序列化再反序列化回来的对象是否是同一个对象)
 */
public class SerializedSingletonTest {

    public static void main(String[] args) throws Exception {
        //创建实例
        SerializedSingleton serializedSingleton1 = SerializedSingleton.getInstance();


        //将此序列化再反序列化回来
        ObjectOutput out = new ObjectOutputStream(new FileOutputStream("filename.ser"));
        out.writeObject(serializedSingleton1);
        out.close();

        ObjectInput oi = new ObjectInputStream(new FileInputStream("filename.ser"));
        SerializedSingleton serializedSingleton2 =  (SerializedSingleton)oi.readObject();
        oi.close();

        //我们比较序列化之前的hashCode与反序列回来的hashCode是否一致
        System.out.println(serializedSingleton1.hashCode());
        System.out.println(serializedSingleton2.hashCode());
    }

}
