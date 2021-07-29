package com.hqyj.mc.Test.ExceptionTest;

import java.io.IOException;

/*
try...catch:异常处理的第二种方式——自己处理异常
格式：
try{
    可能出现异常的代码
}catch(异常类型 变量名){
    异常处理的逻辑，怎么处理异常
    一般在工作中，会把记录在一个日志中
}
....
catch(异常类型 变量名){
    异常处理的逻辑，怎么处理异常
    一般在工作中，会把记录在一个日志中
}
12345
注意：
1.try中抛出多个异常对象的时候，可以使用多个catch处理异常对象
2.如果try中产生了异常，那么就会执行catch中异常的处理逻辑，执行完毕，继续
执行try...catch后面的代码
如果try中没有产生异常，那么就不会执行catch中异常的处理逻辑，继续
执行try...catch后面的代码
 */
public class ExceptionDemo05 {
    public static void main(String[] args) {
        try {

            readFile("D:\\c.txt");
        }catch (IOException e){
            /**
             * 异常处理：
             * public void printStackTrace() 常用——JVM打印异常，打印异常的信息最全面
             * public String getMessage()返回此throwable的详细消息字符串。
             * public String toString()返回此可抛出的简短描述
             */
            e.printStackTrace();
            //System.out.println(e.getMessage());
            System.out.println(e.toString());
        }
        System.out.println(1234);
    }
    public static void readFile(String flieName) throws  IOException {

        if (!flieName.endsWith(".exe")) {
            throw new IOException("文件名错误");
        }
    }
}
