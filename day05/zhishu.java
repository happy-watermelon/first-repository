package com.waterlemon.demo01;

public class zhishu {
    public static void main(String[] args) {
        //101-200之间有多少质数
        int count = 0;
        for (int i = 101; i < 200; i++) {
            int signal=0;
            for (int j = 2; j <i/2 ; j++) {
                if(i%j==0) {
                    signal = 1;
                    break;
                }
            }
            if (signal==0) {
                count++;
                System.out.println(i+"是质数");
            }
        }
        System.out.println("一共"+count+"个质数");
    }
}
