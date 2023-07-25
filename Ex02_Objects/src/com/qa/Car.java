package com.qa;

public class Car {
    private String name;
    private String color;
    private int type;
    private double price;

    public Car(String name, String color, int type, double price) {
        this.name = name;
        this.color = color;
        this.type = type;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", type=" + type +
                ", price=" + price +
                '}';
    }
}
