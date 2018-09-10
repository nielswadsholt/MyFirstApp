package com.hfad.myfirstapp;

public class Pensioner extends Person {
    private int retirementYear;

    Pensioner(String name, int age, int retirementYear) {
        super(name, age);
        this.retirementYear = retirementYear;
    }

    public int getRetirementYear() {
        return retirementYear;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Age: " + getAge() + ", Retirement year: " + retirementYear;
    }
}
