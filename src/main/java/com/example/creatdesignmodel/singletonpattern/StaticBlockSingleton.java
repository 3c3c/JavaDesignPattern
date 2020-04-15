package com.example.creatdesignmodel.singletonpattern;

/**
 * 饿汉式
 * 采用静态代码块的方式来创建实例,添加异常处理机制
 * 弊端:提前创建占用资源
 */
public class StaticBlockSingleton {
    //私有成员变量
    private static StaticBlockSingleton staticBlockSingleton;

    //提供私有构造
    private StaticBlockSingleton() {
    }

    //静态代码块创建实例
    static {
        try {
            staticBlockSingleton = new StaticBlockSingleton();
        }catch (Exception e){
            throw new RuntimeException("初始化实例失败");
        }
    }

    //提供全局访问方法
    public static StaticBlockSingleton getInstance(){
        return staticBlockSingleton;
    }



}
