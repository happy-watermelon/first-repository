package com.watermelon.demo07;

public class studentTest {
    public static void main(String[] args) {
        student[] s = new student[3];
        student s1 = new student(1, "王富亮", 22);
        student s2 = new student(2, "张栋", 23);


        s[0] = s1;
        s[1] = s2;


        student s4 = new student(4, "浩东", 20);
        boolean flag = contains(s, s4.getStudentID());
        int count = fullOrNot(s);
        if (flag) {
            if (count < s.length) {
                int index = count;
                s[index] = s4;
                prin(s);
            } else {
                student[] ss = new student[s.length + 1];
                for (int i = 0; i < s.length; i++) {
                    ss[i] = s[i];
                }
                ss[s.length] = s4;
                prin(ss);

            }
        } else
            System.out.println("你输入的学生ID重复");
        int index=getIndex(s,s1.getStudentID());
        if(index!=-1)
        s[index]=null;
        else
            System.out.println("删除失败");
        prin(s);

       int Dindex= getIndex(s,2);
       if(Dindex>-0){
           s[Dindex].setStudentAge(s[Dindex].getStudentAge()+1);
       }
       else
           System.out.println("index不存在");
    }

    //判断数组中的id是否重复
    public static Boolean contains(student[] s, int studentID) {
        for (int i = 0; i < s.length; i++) {
            student a = s[i];
            int sid=0;
            if(a!=null)
            sid = a.getStudentID();
            if (sid == studentID)
                return false;
        }
        return true;
    }

    //判断数组是否已经满了
    public static int fullOrNot(student[] s) {
        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i] != null)
                count++;
        }
        return count;
    }

    //遍历数组
    public static void prin(student[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
    //获得待删除的元素的索引
    public static  int getIndex(student []arr,int studentID){
        for (int i = 0; i < arr.length; i++) {
            student a=arr[i];
            if(a!=null){
                int sid=a.getStudentID();
                if(sid==studentID)
                    return i;
            }
        }
        return -1;
    }
}