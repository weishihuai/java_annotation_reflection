package com.wsh.reflection04;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/13 20:22
 */
public class User {
    private int id;
    private String name;
    private int age;

    /**
     * 静态属性
     */
    private static String flag;

    /**
     * 静态方法
     *
     * @param name
     * @return
     */
    public static String sayHello(String name) {
        return name;
    }

    public User() {
    }

    public User(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static String getFlag() {
        return flag;
    }

    public static void setFlag(String flag) {
        User.flag = flag;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
