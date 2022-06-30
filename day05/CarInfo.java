package com.watermelon.demo05;

public class CarInfo {
    private String name;
    private double price;
    private String color;

    public CarInfo() {
    }

    public CarInfo(String name, double price, String color) {
        this.name = name;
        this.price = price;
        this.color = color;
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
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public String toString() {
        return "CarInfo{name = " + name + ", price = " + price + ", color = " + color + "}";
    }
}
