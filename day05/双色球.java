package com.waterlemon.demo01;

import java.util.Random;
import java.util.Scanner;

public class 双色球 {
    public static void main(String[] args) {
        int[] nums = creatNums();//获取获奖号
        int guessnums[]=guessNums();//购买的双色球号码
        int res=compareNums(nums,guessnums);
        if(res==0){
            System.out.println("很抱歉您未中奖");
        }
        else{
            System.out.println("您的中奖金额是:"+res+"元! !");
        }
        System.out.print("本次双色球的获奖号是:  ");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i]+" ");
        }

    }
    //判断中奖金额
    public static int compareNums(int []nums,int guessnums[]){
        int count=0;//计算红球的猜中个数
        int res=0;//中奖金额
        for (int i = 0; i < 6; i++) {
            if(nums[i]==guessnums[i])
                count++;
        }
        if(nums[6]==guessnums[6]){
            if(count==6)
                res=10000000;
            else if(count==5)
                res=3000;
            else if(count==4)
                res=200;
            else if(count==3||count==2)
                res=10;
            else if(count==1)
                res=5;
        }
        else{
            if(count==6)
                res=5000000;
            else if(count==5)
                res=200;
            else if(count==4)
                res=10;
        }
        return res;
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
        for (int i = 0; i < guessnums.length; i++) {
            System.out.print(guessnums[i]+" ");
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
