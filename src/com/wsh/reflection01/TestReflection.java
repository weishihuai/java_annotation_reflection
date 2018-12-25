package com.wsh.reflection01;

/**
 * @Description: Class对象的获取方式
 * @Author: weishihuai
 * @Date: 2018/12/12 20:23
 */
public class TestReflection {
    public static void main(String[] args) {

        try {
            /**
             * 说明:
             * 类被加载后,java虚拟机会创建一个对应这个类的Class对象,整个类的结构信息都会存放在clazz类对象中
             * 通过Class对象,可以获取到类的全部信息.(反射)
             * 一个类只有一个Class对象
             */
            Class<?> clazz = Class.forName("com.wsh.reflection01.User");
            Class<?> clazz2 = Class.forName("com.wsh.reflection01.User");

            //clazz = class com.wsh.reflection01.User
            System.out.println("clazz = " + clazz);

            //true
            System.out.println(clazz == clazz2);

            /**
             * 获取Class类对象的其他方式
             */
            Class<?> cls = User.class;
            Class<?> cls2 = new User().getClass();
            //true
            System.out.println(cls.hashCode() == cls2.hashCode());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
