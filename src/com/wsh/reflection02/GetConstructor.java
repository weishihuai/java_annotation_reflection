package com.wsh.reflection02;

import java.lang.reflect.Constructor;

/**
 * @Description: 获取类的构造方法信息
 * @author: weishihuai
 * @Date: 2018/12/19 15:20
 */
public class GetConstructor {
    public static void main(String[] args) {

        /**
         * 获取User.Class对象
         */
        Class<?> clazz;
        try {
            clazz = Class.forName("com.wsh.reflection02.User");


            /**
             * getDeclaredConstructors() : 获取类声明的全部构造方法
             * getDeclaredConstructor(Class<?>... parameterTypes) : 根据构造方法类型获取对应的构造方法(必须指定构造方法的参数.Class类型对象)
             *
             * getConstructors() : 获取public修饰的公开构造方法
             * getConstructor(Class<?>... parameterTypes) : 根据构造方法类型获取public修饰的公开构造方法(必须指定构造方法的参数.Class类型对象)
             */

            Constructor[] constructors = clazz.getDeclaredConstructors();
            for (Constructor constructor : constructors) {
                System.out.println(constructor);
            }

            /**
             * 获取无参构造方法
             */
            Constructor constructor1 = clazz.getDeclaredConstructor(null);
            System.out.println(constructor1);

            /**
             * 获取有参构造方法
             */
            Constructor constructor2 = clazz.getDeclaredConstructor(int.class, String.class, int.class);
            System.out.println(constructor2);

        } catch (ClassNotFoundException | NoSuchMethodException e) {
            e.printStackTrace();
        }


    }
}
