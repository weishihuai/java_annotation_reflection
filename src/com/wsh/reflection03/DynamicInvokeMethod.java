package com.wsh.reflection03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description: 动态调用普通方法/静态方法
 * @author: weishihuai
 * @Date: 2018/12/19 16:00
 */
public class DynamicInvokeMethod {
    public static void main(String[] args) {
        Class<?> clazz;
        try {
            //通过反射获取User类Class对象
            clazz = Class.forName("com.wsh.reflection03.User");

            /**
             * 通过反射操作普通方法:
             * method.invoke(Object obj, Object... args) : obj-调用的实体对象  args:参数值
             */
            User user2 = (User) clazz.newInstance();
            Method method = clazz.getDeclaredMethod("setName", String.class);
            Method method1 = clazz.getDeclaredMethod("setAge", int.class);
            method.invoke(user2, "lisi");
            method1.invoke(user2, 18);
            System.out.println(user2);

            Method method2 = clazz.getDeclaredMethod("getName");
            method2.invoke(user2);
            System.out.println(user2.getName());

            /**
             * 获取静态方法
             */
            Method staticMethod = clazz.getDeclaredMethod("sayHello", String.class);
            Object o = staticMethod.invoke(null, "zhangsan");
            System.out.println("动态调用静态方法,返回值-->" + o);

        } catch (ClassNotFoundException | IllegalAccessException | InstantiationException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
