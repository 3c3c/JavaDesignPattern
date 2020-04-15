package com.example.creatdesignmodel.singletonpattern;

/**
 *懒汉式
 * 弊端 synchronized字段 代码执行性能差
 */
public class ThreadSafeSingleton {

    //私有静态成员变量  静态:使变量称为类的变量  私有:防止外部直接使用类名.变量名的方式来调用
    private static ThreadSafeSingleton threadSafeSingleton = null;

    //私有化构造方法  防止外部直接创建实例
    private ThreadSafeSingleton() {
    }
    //提供全局访问方法
    public static synchronized ThreadSafeSingleton getInstance(){
        if(threadSafeSingleton == null){
            threadSafeSingleton = new ThreadSafeSingleton();
        }
        return threadSafeSingleton;
    }

}
