package com.hqyj.mc.Test.ThreadTest;
/*
线程中常用方4：——终止线程休眠：
睡眠太久，中途醒来的方法：
public void interrupt()中断这个线程的休眠。
 */
public class ThreadDemo07 {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new MyThead07());
        t.setName("小胡");
        t.start();
        Thread.sleep(1000*5);
        t.interrupt();
    }
}
class MyThead07 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--begin");
        try {
            Thread.sleep(1000*1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"--end");
    }
}
