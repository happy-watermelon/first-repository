package com.字符串练习.TEST;

import java.util.Scanner;

public class 手机号 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String number=sc.next();
        String res=number.substring(0,3)+"****"+number.substring(7);
        System.out.println(res);
    }
}
