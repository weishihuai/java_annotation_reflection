package com.wsh.reflection03;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * @Description: 动态调用构造方法
 * @author: weishihuai
 * @Date: 2018/12/19 16:00
 */
public class DynamicInvokeConstructor {
    public static void main(String[] args) {
        Class<?> clazz;
        try {
            //通过反射获取User类对应的Class对象
            clazz = Class.forName("com.wsh.reflection03.User");

            /**
             * 动态调用构造方法创建对象:
             * 1. 底层调用的是无参构造方法，所以无参构造方法必须显式声明
             * 2. clazz.newInstance() : 通过调用Class对象的newInstance()方法创建对象
             * 3. constructor.newInstance(Object ... initargs) : 通过调用constructor的newInstance()方法创建对象
             */

            User user = (User) clazz.newInstance();
            System.out.println("clazz.newInstance()-->" + user);

            //通过反射获取User类的构造方法
            Constructor constructor = clazz.getDeclaredConstructor(int.class, String.class, int.class);
            User user1 = (User) constructor.newInstance(1, "zhangsan", 20);
            System.out.println("constructor.newInstance(Object ... initargs)-->" + user1);

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
