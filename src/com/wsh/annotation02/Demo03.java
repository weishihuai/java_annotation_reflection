package com.wsh.annotation02;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/11 21:01
 */
public class Demo03 {
    public static void main(String[] args) {

        try {
            //通过反射获取Student类对象
            Class clazz = Class.forName("com.wsh.annotation02.Student");

            //获取Student类的所有有效注解
            Annotation[] annotations = clazz.getAnnotations();
            for (Annotation annotation : annotations) {
                //@com.wsh.annotation02.MyTable(value=tb_student)
                System.out.println(annotation);
            }

            //获取类指定的注解
            MyTable myTable = (MyTable) clazz.getAnnotation(MyTable.class);
            System.out.println(myTable.value());  //tb_student

            //获取类的属性的注解
            Field name_field = clazz.getDeclaredField("name");
            MyField nameField = name_field.getAnnotation(MyField.class);
            System.out.println(nameField.columnName());   //sname
            System.out.println(nameField.type());  //varchar2
            System.out.println(nameField.length());  //128

            //至此，各个字段的属性名称、长度、类型都获取了、就可以动态拼接创建数据表的sql...

        } catch (ClassNotFoundException | NoSuchFieldException e) {
            e.printStackTrace();
        }

    }
}
