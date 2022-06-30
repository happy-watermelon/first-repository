package com.watermelon.demo05;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        double count=0;
        Scanner sc=new Scanner(System.in);
        CarInfo []arr=new CarInfo[3];
        for (int i = 0; i < arr.length; i++) {
            CarInfo c=new CarInfo();
            String name=sc.next();
            double price=sc.nextDouble();
            String color=sc.next();
            c.setName(name);
            c.setPrice(price);
            c.setColor(color);
            arr[i]=c;
            System.out.println(c.toString());
            count+=arr[i].getPrice();
        }
        System.out.println("平均价格是:"+count/3);

    }
}
