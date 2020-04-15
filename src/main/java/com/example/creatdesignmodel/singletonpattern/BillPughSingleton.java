package com.example.creatdesignmodel.singletonpattern;

/**
 * 懒汉式
 * jdk1.5之后出现的创建单例的方式
 *优点线程安全 懒汉式
 */
public class BillPughSingleton {

    //私有化构造方法
    private BillPughSingleton() {
    }

    //内部类构造实例
    private static class BillPughSingletonHelper{
        public static BillPughSingleton billPughSingleton = new BillPughSingleton();
    }

    //生成全局访问方法
    public static BillPughSingleton getInstance(){
        return BillPughSingletonHelper.billPughSingleton;
    }


}
