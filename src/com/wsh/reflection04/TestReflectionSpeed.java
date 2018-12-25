package com.wsh.reflection04;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @Description:
 * @author: weishihuai
 * @Date: 2018/12/25 11:48
 */
public class TestReflectionSpeed {

    public static void main(String[] args) {
        Class clazz = null;
        try {
            clazz = Class.forName("com.wsh.reflection04.User");
//            noReflection(clazz);
            reflection01(clazz);
//            reflection02(clazz);


        } catch (ClassNotFoundException | NoSuchMethodException | IllegalAccessException | InstantiationException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    /**
     * 普通方法执行
     *
     * @param clazz
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void noReflection(Class clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        long startTime = System.currentTimeMillis();
        User user3 = new User();
        user3.setName("xxx");

        for (int i = 0; i < 1000000000; i++) {
            user3.getName();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("普通方法执行耗时:-->" + (endTime - startTime));
    }

    /**
     * 反射调用方法(进行安全检查)
     *
     * @param clazz
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void reflection01(Class clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        long startTime = System.currentTimeMillis();
        User user3 = (User) clazz.newInstance();
        user3.setName("xxx");
        Method method = clazz.getDeclaredMethod("getName");

        for (int i = 0; i < 1000000000; i++) {
            Object invoke = method.invoke(user3);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射【进行安全检查】调用方法执行耗时:-->" + (endTime - startTime));
    }

    /**
     * 反射调用方法(不进行安全检查)
     *
     * @param clazz
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws NoSuchMethodException
     * @throws InvocationTargetException
     */
    public static void reflection02(Class clazz) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        long startTime = System.currentTimeMillis();
        User user3 = (User) clazz.newInstance();
        user3.setName("xxx");

        Method method = clazz.getDeclaredMethod("getName");
        //不进行安全检查
        method.setAccessible(true);
        for (int i = 0; i < 1000000000; i++) {
            Object invoke = method.invoke(user3);
        }
        long endTime = System.currentTimeMillis();
        System.out.println("反射【不进行安全检查】调用方法执行耗时:-->" + (endTime - startTime));
    }

}




