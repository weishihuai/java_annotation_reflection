package com.wsh.reflection02;

import java.lang.reflect.Method;

/**
 * @Description: 获取类的普通方法信息
 * @Auther: weishihuai
 * @Date: 2018/12/19 15:16
 */
public class GetMethodInfo {
    public static void main(String[] args) {
        /**
         * 获取User.Class对象
         */
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.wsh.reflection02.User");

            /**
             * getDeclaredMethods() : 获取类声明的全部方法
             * getDeclaredMethod(String name, Class<?>... parameterTypes) : 根据方法名称以及参数类型获取类声明的方法(第二个参数: 可变参数，指定参数类型，避免方法重载，获取不了相应的方法)
             *
             * getMethod(String name, Class<?>... parameterTypes) : 根据方法名称以及参数类型获取public公开属性的方法
             * getMethods() : 获取类声明的全部public修饰的方法
             */

            Method[] methods = clazz.getDeclaredMethods();
            for (Method method : methods) {
                System.out.println("方法名称-->:" + method);
            }

            Method method1 = clazz.getDeclaredMethod("getName");
            System.out.println(method1);

            Method method2 = clazz.getDeclaredMethod("setName", String.class);
            System.out.println(method2);

            Method method3 = clazz.getMethod("setName", String.class);
            System.out.println(method3);

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
