package com.example.creatdesignmodel.singletonpattern.serialized;

import java.io.Serializable;

/**
 * 当单例实现序列化接口,会打破单例模式
 * 当我们序列化此对象的时候会产生一个新的实例
 * 解决:实现readResolve()方法
 */
public class SerializedSingleton implements Serializable {

    //私有化构造方法
    private SerializedSingleton() {
    }

    //静态内部类创建实例
    private static class SerializedSingletonHelper {
        private static SerializedSingleton serializedSingleton = new SerializedSingleton();
    }

    //提供全局访问方法
    public static SerializedSingleton getInstance() {
        return SerializedSingletonHelper.serializedSingleton;
    }

    //实现此方法 当反序列化的时候就不再创建一个新的对象,而是调用此方法返回当前单例对象
    private Object readResolve() {
        return getInstance();
    }
}