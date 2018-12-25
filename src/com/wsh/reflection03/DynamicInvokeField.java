package com.wsh.reflection03;

import java.lang.reflect.Field;

/**
 * @Description: 动态操作字段信息
 * @author: weishihuai
 * @Date: 2018/12/19 16:00
 */
public class DynamicInvokeField {
    public static void main(String[] args) {
        Class<?> clazz = null;
        try {
            clazz = Class.forName("com.wsh.reflection03.User");

            /**
             * 通过反射API操作属性:
             * field.set(Object obj, Object value):    field: 某个字段   obj:实体对象   value:字段值
             * field.get(Object obj):   field: 某个字段  obj:实体对象
             */
            User user3 = (User) clazz.newInstance();
            Field field = clazz.getDeclaredField("name");

//            不能访问私有属性
//            field.set(user3, "wangwu");
//            System.out.println(user3.getName());

//            //不做安全检查，直接操作属性
            field.setAccessible(true);
            field.set(user3, "wangwu");
//            //wangwu
            System.out.println(user3.getName());
//            //wangwu
            System.out.println(field.get(user3));

            /**
             * 获取静态属性
             */
            Field staticField = clazz.getDeclaredField("flag");
            staticField.setAccessible(true);
            staticField.set(null, "flag");
            System.out.println("静态属性flag的值为-->" + staticField.get(null));

        } catch (ClassNotFoundException | IllegalAccessException | NoSuchFieldException | InstantiationException e) {
            e.printStackTrace();
        }
    }
}
