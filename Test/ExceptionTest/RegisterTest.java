package com.hqyj.mc.Test.ExceptionTest;

import java.util.Scanner;

/*
要求：模拟注册操作，如果用户名，则抛出异常提示：亲，该用户已经被注册
 */
public class RegisterTest {
    public static void main(String[] args) {
        //1.定义一个数组保存已经注册过的用户名
        String[] usernames = {"热巴","娜扎","扎哈"};
        //2.Scanner获取用户输入名
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名：");
        String username = sc.next();
        checkUserName(username,usernames);

    }
    public static void checkUserName(String username,String[] usernames){
        for (String name : usernames) {
            if(username.equals(name)){
                try {
                    throw new RegisterException("亲，该用户已经被注册");
                } catch (RegisterException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}