package com.wsh.reflection02;

/**
 * @Description: 获取类的相关信息
 * @author: weishihuai
 * @Date: 2018/12/19 14:53
 */
public class GetClassInfo {
    public static void main(String[] args) {

        try {
            /**
             * 获取User.Class对象
             */
            Class<?> clazz = Class.forName("com.wsh.reflection02.User");

            /**
             * 获取类的全路径名字
             * com.wsh.reflection02.User
             */
            System.out.println("类的全路径名字信息-->" + clazz.getName());

            /**
             * 获取类的简易名字
             * User
             */
            System.out.println("类的简易名字-->" + clazz.getSimpleName());
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }

    }
}
