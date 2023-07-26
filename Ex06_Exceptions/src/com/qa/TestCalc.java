package com.qa;

public class TestCalc {
    public TestCalc() {
    }

    public static void main(String[] args) {
        BadCalc bc = new BadCalc();
        System.out.println(" Mult Result : " + bc.mult(2, 3));

        try {
            System.out.println(" Div Result: " + bc.div(6, 0));
        } catch (ArithmeticException var3) {
            System.out.println("calculation error caught try again");
        }

    }
}