package com.hqyj.mc.Test.ThreadTest;
/**
 * 创建线程的第一种方式：
 * 1.定义Thread类的子类，并重写该类的run()方法，
 * 该run()方法的方法体就代表了线程需要完成的任务,
 * 因此把run()方法称为线程执行体。
 * 2.创建Thread子类的实例，即创建了线程对象
 * 3.调用线程对象的start()方法来启动该线程
 * 注意：
 * 1.加入了多线程之后，JVM内存：方法区，堆，主栈（main方法里面的代码），分支栈（自定义线程类中的代码）
 * 2.运行结果有先有后，有多有少，原因：Java中的线程是抢占式调度，谁先抢到CPU时间片，谁先执行
 */
public class ThreadDemo1 {
    public static void main(String[] args) {//主线程
        MyThread mt = new MyThread();
        mt.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main:" + i);
        }

    }
}
    //线程类
     class MyThread extends Thread{
        @Override
        public void run() {
            for (int i = 0; i < 50; i++) {
                System.out.println("MyThread:"+i);
            }
        }
    }

