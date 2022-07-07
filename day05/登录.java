package com.字符串练习.API中scanner的使用;

import java.util.Scanner;

public class 登录 {
    public static void main(String[] args) {
        String ID="7487";
        String password="t123";
        int count=3;
        while(count>0){
            Scanner sc = new Scanner(System.in);
            System.out.println("请输入账号:");
            String userid=sc.next();
            System.out.println("请输入密码:");
            String userPassword=sc.next();

            if(ID.equals(userid)) {
                if (password.equals(userPassword)) {
                    System.out.println("登录成功");
                    break;
                } else {
                    System.out.println("账号或密码错误");
                    count--;
                    System.out.println("请重新输入账号密码,你还有" + count + "次机会");
                }
            }
            else  {
                    System.out.println("账号或密码错误");
                    count--;
                    System.out.println("请重新输入账号密码,你还有"+count+"次机会");
                }
            }
        if(count==0){
            System.out.println("账号已经冻结,请五分钟后再试");
        }
        }
    }

