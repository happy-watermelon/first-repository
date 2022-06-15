package com.waterlemon.demo01;

import java.util.Scanner;

public class plantprice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入机票价格:");
        double price = sc.nextDouble();
        System.out.println("请输入月份:");
        int month = sc.nextInt();
        System.out.println("头等舱请输入1,经济舱请输入2");
        int signal = sc.nextInt();
        price = getPrice(price, month, signal);

        System.out.println("最终价格为:"+price);
    }

    private static double getPrice(double price, int month, int signal) {
        if (month <= 10 && month >= 5) {//说明是旺季
            if (signal == 1)
                price *= 0.9;
            else if (signal == 2)
                price *= 0.85;
            else
                System.out.println("舱位选择请输入1或者2 ! !");

        } else if (month < 0 || month > 12) {
            System.out.println("请输入正确的月份");

    }
        else {//淡季
            if (signal == 1)
                price *= 0.7;
            if (signal == 2)
                price *= 0.65;
            else{
                System.out.println("舱位选择请输入1或者2 ! !");

        }

    }
        return price;
    }


}
