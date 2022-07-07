package com.watermelon.demo07;

public class student {
    private int studentID;
    private String studentName;
    private  int studentAge;

    public student() {
    }

    public student(int studentID, String studentName, int studentAge) {
        this.studentID = studentID;
        this.studentName = studentName;
        this.studentAge = studentAge;
    }

    /**
     * 获取
     * @return studentID
     */
    public int getStudentID() {
        return studentID;
    }

    /**
     * 设置
     * @param studentID
     */
    public void setStudentID(int studentID) {

        this.studentID = studentID;
    }

    /**
     * 获取
     * @return studentName
     */
    public String getStudentName() {
        return studentName;
    }

    /**
     * 设置
     * @param studentName
     */
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    /**
     * 获取
     * @return studentAge
     */
    public int getStudentAge() {
        return studentAge;
    }

    /**
     * 设置
     * @param studentAge
     */
    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public String toString() {
        return "student{studentID = " + studentID + ", studentName = " + studentName + ", studentAge = " + studentAge + "}";
    }
}
