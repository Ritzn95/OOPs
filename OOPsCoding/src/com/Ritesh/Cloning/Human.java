package com.Ritesh.Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[]{3, 6, 9, 2, 5};
    }

//    @Override
//    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
        Human copy = (Human) super.clone();
        copy.arr = new int[copy.arr.length];
        for (int i = 0; i < copy.arr.length; i++) {
            copy.arr[i] = this.arr[i];
        }
        return copy;
    }
}
