package com.watermelon.demo06;

public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFerndsInfo[] arr = new GirlFerndsInfo[4];
        GirlFerndsInfo a = new GirlFerndsInfo("小花", 22, "女", "唱");
        GirlFerndsInfo b = new GirlFerndsInfo("小草", 24, "女", "跳");
        GirlFerndsInfo c = new GirlFerndsInfo("小蓝", 28, "女", "rap");
        GirlFerndsInfo d = new GirlFerndsInfo("小紫", 18, "女", "篮球");

        arr[0] = a;
        arr[1] = b;
        arr[2] = c;
        arr[3] = d;

        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            count += arr[i].getAge();
        }
        int avg = count / arr.length;
        System.out.println("女朋友的平均年龄为:" + avg);
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].getAge() < avg) {
                System.out.println(arr[i].getName() + "年龄为:" + arr[i].getAge() + "岁,小于平均值" + avg);
                System.out.println(arr[i].toString());
            }
        }
    }
}
