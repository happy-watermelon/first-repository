package com.waterlemon.demo01;

import java.util.Random;

public class 抢红包 {
    public static void main(String[] args) {
        int []nums=new int[]{8,18,58,128,888};
        int []compare=new int[5];
        int signal=0;
        Random r=new Random();
        for (int i = 0; i < nums.length; i++) {
            int index=r.nextInt(nums.length);
            for (int j = 0; j <i ; j++) {
                if(nums[index]==compare[j]){
                    signal=1;
                    break;
                }
                else
                    signal=0;
            }
            if(signal==0) {
                System.out.println("抽出的金额是:" + nums[index]);
                compare[i]=nums[index];

            }
            else
                i--;
        }

    }
}
