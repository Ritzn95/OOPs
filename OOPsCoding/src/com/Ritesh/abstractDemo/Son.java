package com.Ritesh.abstractDemo;

public class Son extends Parent{
    public Son(int age) {
        super(age);
    }
    @Override
    void career() {
        System.out.println("I am going to be a ");
    }

    @Override
    void partner() {
        System.out.println("I love  she is ");
    }
}
