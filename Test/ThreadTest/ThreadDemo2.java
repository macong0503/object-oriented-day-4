package com.hqyj.mc.Test.ThreadTest;
/*
线程创建的第二种方式：实现Runnable接口————实际工作中推荐此方式创建线程
定义一个线程类，实现Runnable接口
实现Run方法
创建对象：public Thread(Runnable target)
调用start方法启动线程

输出结果：有先有后，有多有少，因为Java是抢占式调度，多个线程抢占CPU时间片是随机的，谁抢到谁执行

好处：
1.避免了单继承的局限性
一个类只能继承一个类，线程类继承了Thread类就不能再继承其他类，
实现Runnable接口，还有继承其他类和实现其他接口的功能。
2.增强了程序的扩展性，降低了程序的耦合性（解耦）：
实现了runnable接口的方式把设置线程任务和开启线程进行了分离（解耦）
 */
public class ThreadDemo2 {
    public static void main(String[] args) {
        MyThread01 mt = new MyThread01();
        Thread t =new Thread(mt);
        /*
        注：当调用start()，它会先告诉JVM开辟分支栈内存空间，
        系统会自动调用重写后的run方法，无需程序员调用！！！
         */
        t.start();
        for (int i = 0; i < 100; i++) {
            System.out.println("main---"+i);
        }
    }
}
class MyThread01 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 50; i++) {
            System.out.println("Thread--"+i);
        }
    }
}
