package com.hqyj.mc.Test.ExceptionTest;

import javax.security.auth.login.FailedLoginException;
import java.io.File;
import java.io.IOException;

/*
throws关键字：异常处理的第一种方式，交给别人处理
作用：
会把方法内部抛出的异常对象抛出给方法的调用者处理（自己不处理，给别人处理），最终JVM处理——>中断处理
使用方式：在方法的声明时使用
修饰符 返回值 方法名（参数列表） throws AXXXException,BXXXException{
    throw new AXXXException("产生的原因");
    throw new BXXXException("产生的原因");
}
注意事项：
1.throws关键字必须写在方法声明处
2.throws关键字后面声明的异常必须是Exception 或者Exception 的子类
3.如果方法内部抛出多个异常，throws后面必须声明多个异常，并用逗号隔开；
如果方法内部抛出多个异常，这多个异常有父子关系，throws后面声明父类异常即可
4.调用了一个声明抛出异常的方法，我们必须处理异常
 */
public class ExceptionDemo04 {
    public static void main(String[] args) throws IOException {

        readFile("C:\\b.txt");
        System.out.println(123);
    }
    //定义方法，对传递的文件路径进行合法判断
    public static void readFile(String flieName) throws /*FailedLoginException,*/ IOException {
        /*if (!flieName.equals("C:\\a.txt")){
            throw new FailedLoginException("文件路径错误");
        }*/
        if (!flieName.endsWith(".exe")){
            throw new IOException("文件名错误");
        }
    }
}
