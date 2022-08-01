package com.学生管理系统;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<userInfo> user = new ArrayList<>();
        sign:
        while (true) {
            System.out.println("欢迎来到学生管理系统");
            System.out.println("请选择操作:");
            System.out.println("1:登录");
            System.out.println("2:注册");
            System.out.println("3:修改密码");
            System.out.println("4:退出系统");
            String Number = sc.next();
            switch (Number) {
                case "1":
                    System.out.println("登录");
                    signin(user);
                    break sign;
                case "2":
                    System.out.println("注册");
                    register(user);
                    break;
                case "3":
                    System.out.println("修改密码");
                    break;
                case "4":
                    System.out.println("退出系统");
                    break sign;
                default:
                    System.out.println("请输入 1,2或3来完成操作");
            }
        }
        ArrayList<StudentInfo> list = new ArrayList<>();
        loop:
        while (true) {
            System.out.println("-----------欢迎来到我的第一个项目--------------");
            System.out.println("1:添加学生");
            System.out.println("2:删除学生");
            System.out.println("3:修改学生");
            System.out.println("4:查询学生");
            System.out.println("5:退出系统");
            System.out.println("请输入您的选择:");

            String number = sc.next();
            switch (number) {
                case "1":
                    addStudentInfo(list);
                    break;
                case "2":
                    deleteStudentInfo(list);
                    break;
                case "3":
                    updateStudentInfo(list);
                    break;
                case "4":
                    queryStudentInfo(list);
                    break;
                case "5":
                    System.out.println("退出程序");
                    break loop;
                default:
                    System.out.println("没有这个选项");
            }
        }
    }

    //添加学生信息
    public static void addStudentInfo(ArrayList<StudentInfo> list) {
        System.out.println("添加学生");
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要添加的学生ID");
            int ID = scanner.nextInt();
            if (contains(list, ID)) {
                System.out.println("该学生ID已经存在,请重新输入");
                continue;
            }
            System.out.println("请输入要添加的学生姓名");
            String name = scanner.next();
            System.out.println("请输入要添加的学生地址");
            String address = scanner.next();
            System.out.println("请输入要添加的学生年龄");
            int age = scanner.nextInt();

            StudentInfo stuTemp = new StudentInfo(ID, name, address, age);
            list.add(stuTemp);
            System.out.println("添加成功");
            return;
        }
    }

    //删除学生信息
    public static void deleteStudentInfo(ArrayList<StudentInfo> list) {
        System.out.println("删除学生");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要删除的学生ID");
        int id = sc.nextInt();
        int index = index(list, id);
        if (index >= 0) {
            list.remove(index);
            System.out.println("删除成功!");
            return;
        } else {
            System.out.println("学生id不存在,删除失败");
            return;
        }

    }

    //修改学生信息
    public static void updateStudentInfo(ArrayList<StudentInfo> list) {
        System.out.println("修改学生信息");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入要修改的学生ID");
        int id = sc.nextInt();
        int index = index(list, id);
        if (index >= 0) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.println("请输入要修改的学生ID");
                int ID = scanner.nextInt();
                if (contains(list, ID)) {
                    System.out.println("该学生ID已经存在,请重新输入");
                    continue;
                }
                System.out.println("请输入要修改的学生姓名");
                String name = scanner.next();
                System.out.println("请输入要修改的学生地址");
                String address = scanner.next();
                System.out.println("请输入要修改的学生年龄");
                int age = scanner.nextInt();

                StudentInfo stuTemp = new StudentInfo(ID, name, address, age);
                list.set(index, stuTemp);
                System.out.println("修改成功");
                return;
            }
        } else {
            System.out.println("您输入的学生ID不存在,修改失败");
            return;
        }
    }

    //查找学生信息
    public static void queryStudentInfo(ArrayList<StudentInfo> list) {
        System.out.println("查找学生信息");
        int len = list.size();
        if (len == 0) {
            System.out.println("目前没有学生信息");
            return;
        }
        System.out.println("ID\t姓名\t\t地址\t\t年龄");
        if (len != 0) {
            for (int i = 0; i < len; i++) {
                StudentInfo stu = list.get(i);
                System.out.println(stu.getID() + "\t" + stu.getName() + "\t\t" + stu.getAddress() + "\t\t" + stu.getAge());
            }
        }
    }

    //id是否已存在
    public static boolean contains(ArrayList<StudentInfo> list, int ID) {
        return index(list, ID) >= 0;
    }
    //登录
    public  static  void signin(ArrayList<userInfo> user) {
        int count=0;
        Scanner sc = new Scanner(System.in);
        while (true) {
            //密码连错三次,直接锁住,停止虚拟机运行
            if(count==3)
                System.exit(0);
            System.out.println("请输入用户名");
            String username=sc.next();
            System.out.println("请输入密码");
            String password=sc.next();
            if(namecontains(user,username)){
                int index=nameindex(user,username);
                userInfo u=user.get(index);
                if(password.equals(u.getPassword())){
                    System.out.println("登陆成功");
                    break;
                }else{
                    System.out.println("密码错误请重新输入");
                    count++;
                    continue;
                }
            }else{
                System.out.println("你输入的用户名不存在,请重新输入");
                count++;
                continue;
            }
        }
    }

    //根据id返回index
    public static int index(ArrayList<StudentInfo> list, int ID) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            StudentInfo temp = list.get(i);
            if (ID == temp.getID()) {
                return i;
            }
        }
        return -1;
    }

        //注册
    public static void register(ArrayList<userInfo> user) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请输入要注册的用户名");
            String tmpname = sc.next();
            if(TOF(tmpname)){
                continue;
            }
            if (namecontains(user, tmpname)) {
                System.out.println("该用户名已经存在,请重新输入:");
                continue;
            }
            userInfo userinfo=new userInfo();
            userinfo.setUsername(tmpname);
            while(true) {
                System.out.println("请输入要注册的密码");
                String tmppassword = sc.next();
                System.out.println("请确认输入的密码");
                String tmppassword2 = sc.next();
                if (tmppassword.equals(tmppassword2)) {
                    userinfo.setPassword(tmppassword);
                    break;
                } else {
                    System.out.println("两次输入的密码不相同,请重新输入");
                    continue;
                }
            }
            while(true){
                System.out.println("请输入你的身份证号码");

                String tmppersonid=sc.next();
                int length=tmppersonid.length();
                if(length!=18){
                    System.out.println("请输入正确的身份证号:");
                    continue;
                }
                for (int i = 0; i < length; i++) {
                    char c=tmppersonid.charAt(i);
                    if(i<17&&(c>'9'||c<'0')){
                        System.out.println("请输入正确的身份证号:");
                        continue;
                    }else if(i==17&&!(c!='x' || (c >= '0' && c <= '9') || c!='X')){
                        System.out.println("请输入正确的身份证号:");
                        continue;
                    }
                }
                userinfo.setPersonid(tmppersonid);
                break;
            }
            while (true){
                System.out.println("请输入你的手机号,六位数");
                int number=sc.nextInt();
                if(number/100000!=1){
                    System.out.println("请输入正确的手机号");
                    continue;
                }else{
                    userinfo.setPhonenumber(number);
                    break;
                }
            }
            user.add(userinfo);
            System.out.println("注册成功");
            break;
        }
    }


    //用户名是否已存在
    public static boolean namecontains(ArrayList<userInfo> list, String username) {
        return nameindex(list, username) >= 0;
    }


    //根据用户名返回index
    public static int nameindex(ArrayList<userInfo> list, String username) {
        int len = list.size();
        for (int i = 0; i < len; i++) {
            userInfo temp = list.get(i);
            if (username.equals(temp.getUsername())) {
                return i;
            }
        }
        return -1;
    }

    //用户名合法判断
    public static boolean TOF(String tmpname) {
        if (tmpname.length() > 15 || tmpname.length() < 3) {
            System.out.println("请输入的用户名的位数在3到15之间");
            return true;
        }
        for (int i = 0; i < tmpname.length(); i++) {
            char c = tmpname.charAt(i);
            if (!((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c >= 'A' && c <= 'Z'))) {
                System.out.println("用户名请输入在合法范围内的字符");
                return true;
            }
        }
        return false;
    }
    //修改密码
    public static void remove(ArrayList<userInfo> user){
        signin(user);
        System.out.println("修改成功");
    }
}