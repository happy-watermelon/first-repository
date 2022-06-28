package com.watermelon.demo04;

import java.util.Random;

public class hero {
    private int HP;
    private int AD;
    private String name;
    private char gender;
    private String face;
    String[] boyfaces= {"风流俊雅","气宇轩昂","相貌英俊","五官端正","相貌平平","一塌糊涂","面目狰狞"};
    String[] girlfaces ={"美奂绝伦","沉鱼落雁","婷婷玉立","身材娇好","相貌平平","相貌简陋","惨不忍睹"};

    String[] attacks_desc={
            "%s使出了一招【背心钉】，转到对方的身后，一掌向%s背心的灵台穴拍去。",
            "%s使出了一招【游空探爪】，飞起身形自半空中变掌为抓锁向%s。",
            "%s大喝一声，身形下伏，一招【劈雷坠地】，捶向%s双腿。",
            "%s运气于掌，一瞬间掌心变得血红，一式【掌心雷】，推向%s。",
            "%s阴手翻起阳手跟进，一招【没遮拦】，结结实实的捶向%s。",
            "%s上步抢身，招中套招，一招【劈挂连环】，连环攻向%s。"
    };


    String[] injureds_desc={
            "结果%s退了半步，毫发无损",
            "结果给%s造成一处瘀伤",
            "结果一击命中，%s痛得弯下腰",
            "结果%s痛苦地闷哼了一声，显然受了点内伤",
            "结果%s摇摇晃晃，一跤摔倒在地",
            "结果%s脸色一下变得惨白，连退了好几步",
            "结果『轰』的一声，%s口中鲜血狂喷而出",
            "结果%s一声惨叫，像滩软泥般塌了下去"
    };

    public hero() {
    }

    public hero(int HP, int AD, String name,char gender) {
        this.HP = HP;
        this.AD = AD;
        this.name = name;
        this.gender=gender;
        setFace(gender);
    }




    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public String getFace() {
        return face;
    }

    public void setFace(char gender) {
        Random r=new Random();
        if(gender=='男'){
            int boyfaceindex=r.nextInt(boyfaces.length);
            this.face=boyfaces[boyfaceindex];
        }
        else if(gender=='女'){
            int girlfaceindex=r.nextInt(girlfaces.length);
            this.face=girlfaces[girlfaceindex];
        }
        else
            face="面目狰狞";
        this.face = face;
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
        int attachIndex=r.nextInt(attacks_desc.length);
        String attach=attacks_desc[attachIndex];
        int damage=r.nextInt(10);


        //剩余血量计算
        int remainHP=(hero.getHP()-(this.getAD()+damage));
        //验证受伤是否被KO
        remainHP=remainHP>0?remainHP:0;
        //修改被击中英雄的血量
        hero.setHP(remainHP);
        //打印游戏内容
        System.out.printf(attach,this.getName(),hero.getName());
        System.out.println();
        if(remainHP>90) {
            System.out.printf(injureds_desc[0], hero.getName());
        }
        else if(remainHP>80) {
            System.out.printf(injureds_desc[1], hero.getName());
        }
        else if(remainHP>70) {
            System.out.printf(injureds_desc[2], hero.getName());
        }
        else if(remainHP>60) {
            System.out.printf(injureds_desc[3], hero.getName());
        }
        else if(remainHP>50) {
            System.out.printf(injureds_desc[4], hero.getName());
        }
        else if(remainHP>40) {
            System.out.printf(injureds_desc[5], hero.getName());
        }
        else if(remainHP>20) {
            System.out.printf(injureds_desc[6], hero.getName());
        }
        else if(remainHP>0) {
            System.out.printf(injureds_desc[7], hero.getName());
        }


        System.out.printf("掉了%d的血,还剩%d血量",(damage+hero.getAD()),remainHP);
        System.out.println();


    }

    public void showheroinfo(){
        System.out.println("姓名为:"+getName());
        System.out.println("血量为:"+getHP());
        System.out.println("攻击力为:"+getAD());
        System.out.println("性别为:"+getGender());
        System.out.println("面目为:"+getFace());
    }


}
