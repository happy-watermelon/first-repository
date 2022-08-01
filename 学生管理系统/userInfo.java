package com.学生管理系统;

public class userInfo {
    private String username;
    private String password;
    private String personid;
    private int phonenumber;

    public userInfo() {
    }

    public userInfo(String username, String password, String personid, int phonenumber) {
        this.username = username;
        this.password = password;
        this.personid = personid;
        this.phonenumber = phonenumber;
    }

    /**
     * 获取
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取
     * @return personid
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * 设置
     * @param personid
     */
    public void setPersonid(String personid) {
        this.personid = personid;
    }

    /**
     * 获取
     * @return phonenumber
     */
    public int getPhonenumber() {
        return phonenumber;
    }

    /**
     * 设置
     * @param phonenumber
     */
    public void setPhonenumber(int phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String toString() {
        return "userInfo{username = " + username + ", password = " + password + ", personid = " + personid + ", phonenumber = " + phonenumber + "}";
    }
}
