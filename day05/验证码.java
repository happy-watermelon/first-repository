package com.waterlemon.demo01;
//前四位是随机大小写的英文字母,最后一位是数字
import java.util.Random;

public class 验证码 {
    public static void main(String[] args) {
        char[] words = new char[52];//把大小写字母存入数组,然后通过random index来随机
        for (int i = 0; i <words.length; i++) {
            if (i < 25)
                words[i]=(char) (65 + i);//将大写二十六个字母存入
            else
                words[i]=(char) (97 + i - 26);//将小写二十六个字母存入
        }
        String result="";
        Random r=new Random();
        for (int i = 0; i < 4; i++) {
            int index=r.nextInt(words.length);
            result=result+words[index];
        }
        int number=r.nextInt(10);
        result=result+number;
        System.out.println(result);
    }
}
