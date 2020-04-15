package com.example.creatdesignmodel.singletonpattern;

/**
 *懒汉式
 *弊端:线程不安全
 */
public class LazyInitializedSingleton {
    //私有 静态成员变量 防止外部直接使用类名.方法名的方式直接调用
    private static LazyInitializedSingleton lazyInitializedSingleton = null;

    //私有化构造方法 防止外部直接new
    private LazyInitializedSingleton() {
    }

    //提供全局访问方法
    public static LazyInitializedSingleton getInstance(){
        if(lazyInitializedSingleton == null ){
            lazyInitializedSingleton = new LazyInitializedSingleton();
        }
        return lazyInitializedSingleton;
    }


}
