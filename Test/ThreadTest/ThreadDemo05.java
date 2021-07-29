package com.hqyj.mc.Test.ThreadTest;
/*
线程中常用方法2：——线程的优先级（1-10）
最高：10 最低：1 默认：5
public static final int MAX_PRIORITY线程可以拥有的最大优先级。
public static final int MIN_PRIORITY线程可以拥有的最小优先级。
public static final int NORM_PRIORITY分配给线程的默认优先级。
public final void setPriority(int newPriority)更改此线程的优先级。
public final int getPriority()返回此线程的优先级。
 */
public class ThreadDemo05 {
    public static void main(String[] args) {
        System.out.println(Thread.MAX_PRIORITY);//10
        System.out.println(Thread.MIN_PRIORITY);//1
        System.out.println(Thread.NORM_PRIORITY);//5
        Thread t1 = new Thread(new MyThread05());
        t1.setName("t1");
        Thread t2 = new Thread(new MyThread05());
        t2.setName("t2");
        t1.setPriority(1);
        t2.setPriority(10);
        System.out.println(t1.getPriority());
        System.out.println(t2.getPriority());
        t1.start();
        t2.start();
    }
}
class MyThread05 extends Thread{
    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println(Thread.currentThread());
        }

    }
}
