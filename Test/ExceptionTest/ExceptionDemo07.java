package com.hqyj.mc.Test.ExceptionTest;

import java.io.IOException;

public class ExceptionDemo07 {

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
            }finally {
                System.out.println("资源释放");
            }
            System.out.println(1234);
        }
        public static void readFile(String flieName) throws  IOException {

            if (!flieName.endsWith(".exe")) {
                throw new IOException("文件名错误");
            }
        }
    }

