package com.watermelon.demo04;

public class game {
    public static void main(String[] args) {
        hero qiaofeng=new hero(100,20,"乔峰");
        hero laowang=new hero(150,5,"老王");

        //开始格斗
        while(true){
            qiaofeng.attach(laowang);
            if(laowang.getHP()==0){
                System.out.println(laowang.getName()+"被Ko了");
                break;
            }
            laowang.attach(qiaofeng);
            if(qiaofeng.getHP()==0){
                System.out.println(qiaofeng.getName()+"被Ko了");
                break;
            }
        }
    }
}
