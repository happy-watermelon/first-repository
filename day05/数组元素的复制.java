package com.waterlemon.demo01;

import java.util.Scanner;

//把一个数组的元素复制到另一个数组中
public class 数组元素的复制 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int []nums=new int[3];
        for (int i = 0; i < nums.length; i++) {
            nums[i]=sc.nextInt();
        }
        int []numscopy=new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            numscopy[i]=nums[i];
        }
    }
}
