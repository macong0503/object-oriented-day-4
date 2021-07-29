package com.hqyj.mc.Test.ThreadTest;
/*
线程中常用方法1：——获取当前线程对象，赋名，取名
public static Thread currentThread()返回对当前正在执行的线程对象的引用。
public final void setName(String name)将此线程的名称更改为等于参数name 。
public final String getName()返回此线程的名称。
 */
public class ThreadDemo4 {
    public static void main(String[] args) {
        Thread t = new Thread(new MyThread02());
        t.setName("胡狗蛋");
        t.start();
        Thread t1 = new Thread(new MyThread02());
        t1.setName("胡狗蛋二号");
        t1.start();
    }
}
class MyThread02 extends Thread{
    @Override
    public void run() {
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
    }
}