package com.hqyj.mc.Test.ExceptionTest;
//异常中的注意事项三：
 //       1.如果父类抛出了多个异常，子类重写父类方法时，
   //     抛出和父类相同的异常或者抛出父类异常的子类或者不抛出异常
     //   2.如果父类方法没有抛出异常，子类重写父类方法时有异常也不能 抛出异常，
       // 此时子类只能try...catch
public class Fu {
    public void show01() throws NullPointerException,ClassCastException{};
    public void show02() throws IndexOutOfBoundsException{};
    public void show03() throws Exception{};
    public void show04(){};
}
class zi extends Fu{
    @Override
    public void show01() throws NullPointerException,ClassCastException{

    }

    @Override
    public void show02() throws ArrayIndexOutOfBoundsException {

    }

    @Override
    public void show03(){

    }

    @Override
    public void show04() /*throws Exception*/{

        try {
            throw new Exception("编译器异常");
        }catch (Exception e){
            e.fillInStackTrace();
        }
    }
}
