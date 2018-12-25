package com.wsh.annotation01;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/10 20:50
 */

@Target(value = {ElementType.METHOD, ElementType.FIELD, ElementType.CONSTRUCTOR, ElementType.TYPE})
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation02 {

    //如果只有一个属性，一般使用value作为属性名(当然也可以使用其他名字)
    String value() default "";

}
