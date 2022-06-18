package com.waterlemon.demo01;

import java.util.Scanner;

public class 数字翻转 {
    public static void main(String[] args) {
        System.out.println("请输入你要加密的数字:");
        Scanner sc=new Scanner(System.in);
        int number=sc.nextInt();
        int index=wei(number);
        int []nums=disclose(number,index);
        for (int i = 0; i < nums.length; i++) {
            System.out.println(nums[i]);
            nums[i]+=5;//加5
            nums[i]%=10;//取余
        }
        //翻转数组
        for (int i = 0,j=nums.length-1; i < j; i++,j--) {
            int temp=nums[i];
            nums[i]=nums[j];
            nums[j]=temp;
        }
        int res=0;
        for (int i = 0; i < nums.length; i++) {
            res=res*10+nums[i];
        }
        System.out.println("加密后的结果为:");
        System.out.println(res);


    }
    public static int[] disclose(int x,int index){//将数字存入数组
        int []nums=new int[index];
        for (int i = nums.length-1; i >=0; i--) {

                int a = x % 10;
                x = x / 10;
                nums[i] = a;

        }
        return nums;
    }
    public static int wei(int x){//判断输入数字的位数
        int count=0;
        while(x!=0){
            x/=10;
            count++;
        }
        return count;
    }
}
