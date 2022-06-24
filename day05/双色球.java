package com.waterlemon.demo01;

import java.util.Random;
import java.util.Scanner;

public class 双色球 {
    public static void main(String[] args) {
        int[] nums = creatNums();

//        for (int i = 0; i < nums.length; i++) {
//            System.out.print(nums[i] + " ");
//        }
        int guessnums[]=guessNums();
        for (int i = 0; i < guessnums.length; i++) {
            System.out.print(guessnums[i] + " ");
       }
    }
    //双色球买号
    public static int[] guessNums(){
        int [] guessnums=new int[7];
        Scanner sc=new Scanner(System.in);
        for (int i = 0; i < 6; ) {
            guessnums[i]=sc.nextInt();
            if(guessnums[i]<=33&&guessnums[i]>=1)
                i++;
            else
                System.out.println("输入的红球数字越界请重新输入第"+(i+1)+"个红球");
        }
        guessnums[6]=sc.nextInt();
        while(guessnums[6]>16||guessnums[6]<1){
            System.out.println("蓝色球输入越界,请重新输入");
            guessnums[6]=sc.nextInt();
        }
        return guessnums;
    }



    //用于生成随机获奖号码
    public static int[] creatNums() {
        Random r = new Random();
        int[] creatnums = new int[7];
        for (int i = 0; i < creatnums.length - 1; i++) {
            creatnums[i] = r.nextInt(33);
        }
        creatnums[6] = r.nextInt(16);
        return creatnums;
    }
}
