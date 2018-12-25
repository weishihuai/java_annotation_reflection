package com.wsh.reflection02;

import java.lang.reflect.Field;

/**
 * @Description: 获取类的字段信息
 * @Auther: weishihuai
 * @Date: 2018/12/19 15:03
 */
public class GetFieldInfo {
    public static void main(String[] args) {
        /**
         * 获取User.Class对象
         */
        Class<?> clazz;
        try {
            clazz = Class.forName("com.wsh.reflection02.User");

            /**
             * 获取类的字段属性
             * getFields() : 只能获取全部public修饰的公开属性
             * getDeclaredFields() : 获取类声明的全部属性
             *
             * getField() : 只能获取public修饰的属性
             * getDeclaredField(String name) : 根据字段名称获取声明的属性
             */
            Field[] fields = clazz.getFields();
            //0
            System.out.println("类中public修饰的公开属性的字段数量为-->" + fields.length);


            Field[] fields1 = clazz.getDeclaredFields();
            //3
            System.out.println("类声明的字段数量为-->" + fields1.length);


            /**
             * 根据字段名称获取字段信息
             * private java.lang.String com.wsh.reflection02.User.name
             */
            System.out.println(clazz.getDeclaredField("name"));

//            java.lang.NoSuchFieldException: name
//            System.out.println(clazz.getField("name"));

        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
