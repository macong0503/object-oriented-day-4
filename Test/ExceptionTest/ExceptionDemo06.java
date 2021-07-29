package com.hqyj.mc.Test.ExceptionTest;

import java.util.ArrayList;
import java.util.Collections;

/*
异常中的注意事项一：(笔试题）
多个异常使用捕获处理
1.多个异常分别处理
2.多个异常一次捕获，多次处理(注意：子类异常放在上面）
3.多个异常一次捕获，一次处理
 */
public class ExceptionDemo06 {
    public static void main(String[] args) {
        //1.多个异常分别处理
        try {
            int[] a = {1,2,3};
            System.out.println(a[3]);
        }catch (IndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        try{
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        //多个异常一次捕获，多次处理
        try {
            int[] a = {1,2,3};
            System.out.println(a[3]);
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,2,3);
            System.out.println(list.get(3));
        }catch (ArrayIndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        catch (IndexOutOfBoundsException e){
            e.fillInStackTrace();
        }
        //多个异常一次捕获，一次处理
        try {
            int[] a = {1,2,3};
            System.out.println(a[3]);
            ArrayList<Integer> list = new ArrayList<>();
            Collections.addAll(list,1,2,3);
            System.out.println(list.get(3));
        }catch (Exception e){
            e.fillInStackTrace();
        }

    }
}
