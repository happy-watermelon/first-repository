package com.学生管理系统;

public class StudentInfo {
    private int ID;
    private String name;
    private String address;
    private int age;

    public StudentInfo() {
    }

    public StudentInfo(int ID, String name, String address, int age) {
        this.ID = ID;
        this.name = name;
        this.address = address;
        this.age = age;
    }

    /**
     * 获取
     * @return ID
     */
    public int getID() {
        return ID;
    }

    /**
     * 设置
     * @param ID
     */
    public void setID(int ID) {
        this.ID = ID;
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return address
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置
     * @param address
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    public String toString() {
        return "StudentInfo{ID = " + ID + ", name = " + name + ", address = " + address + ", age = " + age + "}";
    }
}
