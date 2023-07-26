package com.qa.model;

public class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    @Override
    public String sayHello() {
        return "Oh helo! Your're back! Hello! Hello! Hello! " + " I missed you ! Hello!";
    }

    @Override
    public String move(){
        return "Ruuuuuuuuun";
    }

    public String toString(){
        return "Dog: " + super.toString();
    }
}


