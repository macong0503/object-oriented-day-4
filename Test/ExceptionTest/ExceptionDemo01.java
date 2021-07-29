package com.hqyj.mc.Test.ExceptionTest;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ExceptionDemo01 {
    /*
    * java.lang.Throwable Java语言中所有错误和异常的根类
java.lang.Error ：错误
错误就相当于程序得了一个无法治愈的毛病，必须修改源代码，程序才能继续执行。
java.lang.Exception ：异常
异常就相当于程序得了一个小小的毛病，把异常处理掉，程序就可以继续执行
异常的分类——————
编译期异常：写代码的时候报红
IOException  FileNotFoundException  ParseException
运行期异常：控制台报红 RuntimeException
ArithmeticException IllegalArgumentException ClassCastException
IndexOutofBoundsException(ArrayIndexOutOfBoundsException,StringIndexOutOfBoundsException )
NoSuchElementException NullPointerException
注意：以后出现的所有异常都要记住，记住出现的原因和解决方式
面试题会考!!!!!!
    * */
    public static void main(String[] args) throws ParseException {
        //编译期异常 代码爆红
        SimpleDateFormat date = new SimpleDateFormat("yyyy-MM-dd");
        date.parse("2000-06-04");
        //运行期异常
        int[] i = {1,2,3};
        //System.out.println(i[3]);//ArrayIndexOutOfBoundsException
        //错误java.lang.OutOfMemoryError内存溢出错误，创建的数组太大了，超出了JVM分配的内存
        //int[] i2 = new int[1024*1024*1024];
        int[] i2 = new int[1024*1024];
        System.out.println(i2[123]);
    }
}
