package com.hqyj.mc.Test.ThreadTest;
/*
**线程中常用方3:**—线程休眠:
public static void sLeep(Long millis) throws InterruptedException
1.静态方法
2.抛出异常
3.参数:毫秒值
4.作用:让当前线程进入休眠，放弃占有的CPU时间片，让给其他线程使用
5.经常使用场景:间隔一定时间执行一段代码
 */
public class ThreadDemo06 {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("胡");
        }
    }
}
