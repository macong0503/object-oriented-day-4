package com.hqyj.mc.Test.ThreadTest;

public class ThreadDemo08 {
    public static void main(String[] args) throws InterruptedException {
        MyThread08 mt =new MyThread08();
        Thread t = new Thread(mt);
        t.setName("t");
        t.start();
        Thread.sleep(1000);
        mt.flag = false;
    }

}
class MyThread08 implements Runnable{
    boolean flag = true;
    @Override
    public void run() {
        for (int i = 0; i <10 ; i++) {
            if (flag){
                System.out.println(Thread.currentThread().getName()+i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                return;
            }
            }
    }
}
