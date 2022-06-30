package com.watermelon.demo01;

public class GoodsTest {
    public static void main(String[] args) {
        Goods goods[]=new Goods[3];

        Goods a=new Goods(0,"苹果",3,20);
        Goods b=new Goods(1,"桃子",5,30);
        Goods c=new Goods(2,"香蕉",2,15);

        goods[0]=a;
        goods[1]=b;
        goods[2]=c;

        for (int i = 0; i < goods.length; i++) {
            Goods n=goods[i];
            System.out.println(n.toString());
        }
    }
}
