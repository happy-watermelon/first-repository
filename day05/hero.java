package com.watermelon.demo04;

import java.util.Random;

public class hero {
    private int HP;
    private int AD;
    private String name;


    public hero() {
    }

    public hero(int HP, int AD, String name) {
        this.HP = HP;
        this.AD = AD;
        this.name = name;
    }

    /**
     * 获取
     *
     * @return HP
     */
    public int getHP() {
        return HP;
    }

    /**
     * 设置
     *
     * @param HP
     */
    public void setHP(int HP) {
        if(HP>=0)
        this.HP = HP;
    }

    /**
     * 获取
     *
     * @return AD
     */
    public int getAD() {
        return AD;
    }

    /**
     * 设置
     *
     * @param AD
     */
    public void setAD(int AD) {
        this.AD = AD;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return "hero{HP = " + HP + ", AD = " + AD + ", name = " + name + "}";
    }

    public void attach(hero hero){
        //暴击伤害的计算
        Random r=new Random();
        int damage=r.nextInt(10);

        //剩余血量计算
        int remainHP=(hero.getHP()-(this.getAD()+damage));
        //验证受伤是否被KO
        remainHP=remainHP>0?remainHP:0;
        //修改被击中英雄的血量
        hero.setHP(remainHP);

        //打印游戏内容
        System.out.println(this.getName()+"怒扁"+hero.getName()+""+(this.getAD()+damage)+
                "点血，"+hero.getName()+"还剩"+remainHP+"点血");
    }


}
