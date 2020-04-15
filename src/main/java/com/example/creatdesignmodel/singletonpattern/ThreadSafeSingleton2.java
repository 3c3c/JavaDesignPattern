package com.example.creatdesignmodel.singletonpattern;

/**
 * 懒汉式
 * 相比于ThreadSafeSingleton类中使用synchronized关键字 此方式更节省性能
 * 优点:当threadSafeSingleton不为null时,不再进入同步代码块节省性能
 */
public class ThreadSafeSingleton2 {
    //私有静态成员变量  静态:使变量称为类的变量  私有:防止外部直接使用类名.变量名的方式来调用
    private static ThreadSafeSingleton2 threadSafeSingleton = null;

    //私有化构造方法  防止外部直接创建实例
    private ThreadSafeSingleton2() {
    }
    //提供全局访问方法
    public static ThreadSafeSingleton2 getInstance(){
        if(threadSafeSingleton == null){
            synchronized (ThreadSafeSingleton2.class){
                if( threadSafeSingleton == null ){
                    threadSafeSingleton = new ThreadSafeSingleton2();
                }
            }
        }
        return threadSafeSingleton;
    }
}
