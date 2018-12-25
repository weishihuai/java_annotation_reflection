package com.wsh.annotation02;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/11 20:55
 */
@Target(ElementType.FIELD)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyField {
    /**
     * 列名称
     */
    String columnName();

    /**
     * 数据类型
     */
    String type();

    /**
     * 长度
     */
    int length();

}
