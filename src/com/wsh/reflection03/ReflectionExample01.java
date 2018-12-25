package com.wsh.reflection03;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

/**
 * @Description: 反射示例一: 绕过泛型检查
 * @author: weishihuai
 * @Date: 2018/12/19 16:06
 */
public class ReflectionExample01 {
    public static void main(String[] args) {

        List<String> namesList = new ArrayList<>();
        namesList.add("zhangsan");
        namesList.add("lisi");

//        编译器报错，不满足泛型类型要求
//        namesList.add(123);

        System.out.println("改变之前-->" + namesList);

        //通过反射获取List的Class对象
        Class<? extends List> clazz = namesList.getClass();
        try {
            Method method = clazz.getDeclaredMethod("add", Object.class);
            method.invoke(namesList, 123);

            System.out.println("改变之后-->" + namesList);
        } catch (NoSuchMethodException | InvocationTargetException | IllegalAccessException e) {
            e.printStackTrace();
        }

    }
}
