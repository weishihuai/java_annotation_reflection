package com.wsh.annotation01;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/10 20:29
 */

//@MyAnnotation01
public class Demo02 extends Object {

    //    @MyAnnotation01
    @MyAnnotation01(name = "zhangsan", num = 25, hobby = {"pingpong"})
    @Override
    public String toString() {
        return "";
    }

}
