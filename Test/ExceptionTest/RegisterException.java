package com.hqyj.mc.Test.ExceptionTest;
/*
自定义异常：
1.自定义异常类一般以Exception结尾，说明它是个异常类
2.必须继承Exception或者RuntimeException
3.必须添加一个无参数构造方法
4.添加一个带异常信息的构造方法
 */
public class RegisterException extends Exception{
    public RegisterException() {
    }

    public RegisterException(String message) {
        super(message);
    }
}
