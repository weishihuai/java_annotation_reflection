package com.wsh.annotation01;

/**
 * @Description:
 * @Author: weishihuai
 * @Date: 2018/12/10 20:29
 */
public class Demo01 extends  Object {

    //内置注解(标志注解)

    //重写父类方法
    @Override

    //过时方法、类(不建议使用，还是可以使用)
    @Deprecated

    //抑制编译时的一些警告信息
    @SuppressWarnings(value = "unchecked")
    public String toString() {
        return "aa";
    }

}
