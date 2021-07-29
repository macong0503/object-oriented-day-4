package com.hqyj.mc.Test.ExceptionTest;

import java.util.Objects;

/*
* Objects中requireNonNull(T obj)：
public static <T> T requireNonNull(T obj) {
if (obj == null)
throw new NullPointerException();
return obj;
* */
public class ExceptionDemo03 {
    public static void main(String[] args) {

        getElement(null);
    }
    public static void getElement(Object obj){
       /* if(arr==null){
            throw new NullPointerException("传递的数组为null");
        }*/
        Objects.requireNonNull(obj,"传递的数组为null");
    }

}
