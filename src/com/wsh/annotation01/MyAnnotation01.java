package com.wsh.annotation01;

import java.lang.annotation.*;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/10 20:50
 */

//@Target : 描述注解使用在什么地方
@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})

//@Retention: 表示需要在什么级别保存注解信息，用于描述注解的生命周期
// Runtime : 在运行时保存(可以通过反射机制读取)
// source:源文件中
// class:字节码文件中
@Retention(value = RetentionPolicy.RUNTIME)
//@Documented : 表示是否将注解信息添加在java文档中
@Documented
public @interface MyAnnotation01 {

    //可以通过default指定默认值
    //参数名称: name
    //参数类型: String
//    String name() ;


    int num() default 0;

    int index() default -1;

    String name() default "";
    //使用数组 指定默认值的时候使用{}中括号
    String[] hobby() default {"basketball", "football"};

}
