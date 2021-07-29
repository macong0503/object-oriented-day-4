package com.hqyj.mc.Test.ExceptionTest;
/*
* throw关键字：
作用：在指定方法中抛出异常
使用的格式：throw new 异常类名(“异常产生的原因”);
注意：
1.throw关键字必须写在方法内部
2.throw关键字后面new的异常对象必须是Exception 或者Exception 的子类
3.throw关键字抛出了异常对象，我们就需要处理这个异常对象
    抛出的异常对象是RunTimeException或者RunTimeException，我们可以不手动处理，交给JVM处理
    抛出的异常对象是编译期异常，我们必须要手动处理：throws  try...catch
* */
public class ExceptionDemo02 {
    public static void main(String[] args) {

        /*int[] arr = null;
        int e = getElement(arr, 0);
        System.out.println(e);*/

        int[] arr = new int[3];
        System.out.println(getElement(arr,3));
    }
    /**
     * 对传入的数组和数组的索引进行合法校验
     */
    public static int getElement(int[] arr,int index){
        if(arr==null){
            throw new NullPointerException("传递的数组为null");
        }
        if(index<0||index>arr.length-1){
            throw new ArrayIndexOutOfBoundsException("数组的索引超出了使用范围");
        }
        return index;
    }
}
