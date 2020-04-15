package com.example.creatdesignmodel.singletonpattern;

/**
 * 饿汉式
 * 在变量初始的时候就创建
 * 弊端:提前创建占用资源
 */
public class EagerInitializedSingleton {

    //创建实例
    private static EagerInitializedSingleton eagerInitializedSingleton = new EagerInitializedSingleton();

    //私有构造方法
    private EagerInitializedSingleton() {
    }

    //提供全局访问方法
    public static EagerInitializedSingleton getInstance(){
        return eagerInitializedSingleton;
    }
}
