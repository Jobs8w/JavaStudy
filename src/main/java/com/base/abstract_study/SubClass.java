package com.base.abstract_study;

public class SubClass extends AbstractClass {
    @Override
    public void abstractMethod() {
        System.out.println("Hello");
    }

    public static void main(String[] args) {
        new SubClass().abstractMethod();

    }
}