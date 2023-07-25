package com.qa;

public class CarShop {
    public static void main(String[] args) {

        Car c1 = new Car("Renault Arcana", "valencia orange", 1,
                32000.22);
        Car c2 = new Car("Toyota CHR", "blue", 2,
                25000.62);
        Car c3 = new Car("Nissan Juke ", "red", 2,
                27000.55);
        Car c4 = new Car("Cupra Formentor", "black", 3,
                27500.44);
        Car c5 = new Car("Hyundai Tucsson ", "yellow", 1,
                35000.99);

        Car[] cars = new Car[6];
        cars[1] = c1;
        cars[2] = c2;
        cars[3] = c3;
        cars[4] = c4;
        cars[5] = c5;

        for (int i = 1; i <=5; i++ ){
            System.out.println(cars[i]);
        }

        c3.setPrice(20000);
        System.out.println(c3.getName() + " has a new price of " + c3.getPrice());

    }
}
