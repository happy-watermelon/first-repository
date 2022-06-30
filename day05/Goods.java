package com.watermelon.demo01;

public class Goods {
    private int ID;
    private String name;
    private double price;
    private int number;

    public Goods() {
    }

    public Goods(int ID, String name, double price, int number) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.number = number;
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
     * @return price
     */
    public double getPrice() {
        return price;
    }

    /**
     * 设置
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }

    /**
     * 获取
     * @return number
     */
    public int getNumber() {
        return number;
    }

    /**
     * 设置
     * @param number
     */
    public void setNumber(int number) {
        this.number = number;
    }

    public String toString() {
        return "Goods{ID = " + ID + ", name = " + name + ", price = " + price + ", number = " + number + "}";
    }
}
