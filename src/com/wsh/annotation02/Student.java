package com.wsh.annotation02;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/11 20:54
 */
@MyTable(value = "tb_student")
public class Student {
    @MyField(columnName = "sname", type = "varchar2", length = 128)
    private String name;
    @MyField(columnName = "age", type = "int", length = 3)
    private int age;
    @MyField(columnName = "id", type = "int", length = 128)
    private int id;

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
}
