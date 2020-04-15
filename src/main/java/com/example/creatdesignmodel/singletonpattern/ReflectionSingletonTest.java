package com.example.creatdesignmodel.singletonpattern;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * 通过反射去销毁单例实例
 * 现象:两个实例的hashCode值不同
 */
public class ReflectionSingletonTest {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException {
        StaticBlockSingleton staticBlockSingleton1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton staticBlockSingleton2 = null;

        Constructor[] declaredConstructors = StaticBlockSingleton.class.getDeclaredConstructors();
        for( Constructor constructor : declaredConstructors ){
            constructor.setAccessible(true);
            staticBlockSingleton2 = (StaticBlockSingleton) constructor.newInstance(new Object[]{});
        }

        System.out.println(staticBlockSingleton1.hashCode());
        System.out.println(staticBlockSingleton2.hashCode());


    }

}
