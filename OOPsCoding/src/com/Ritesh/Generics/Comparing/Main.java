package com.Ritesh.Generics.Comparing;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Student Ritesh = new Student(13, 64.6f);
        Student Rahul = new Student(12,57.8f);
        Student Umar = new Student(15,97.7f);
        Student Swaran = new Student(14,77.5f);
        Student Deepak = new Student(5,87.8f);

        Student[] list = {Ritesh, Rahul, Umar, Swaran, Deepak};

        System.out.println(Arrays.toString(list));
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));;

//        if (Ritesh.compareTo(Rahul) < 0){
//            System.out.println("Rahul has more marks than Ritesh");
//            System.out.println(Ritesh.compareTo(Rahul));
//        }
    }
}
