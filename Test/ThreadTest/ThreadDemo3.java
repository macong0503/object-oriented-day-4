package com.hqyj.mc.Test.ThreadTest;
//创建线程的第三种方法：匿名内部类
public class ThreadDemo3 {
    public static void main(String[] args) {
        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 0; i < 50; i++) {
                    System.out.println("run--"+i);
                }
            }
        });
        t.start();
    }
}
