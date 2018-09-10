package com.hfad.myfirstapp;

public class Worker extends Person {
    private  float pay;

    Worker(String name, int age, float pay) {
        super(name, age);
        this.pay = pay;
    }

    public float getPay() {
        return pay;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Pay: " + pay;
    }
}
