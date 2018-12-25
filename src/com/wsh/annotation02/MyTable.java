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
@Target(ElementType.TYPE)
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyTable {
    /**
     * 数据表名称
     */
    String value();
}
