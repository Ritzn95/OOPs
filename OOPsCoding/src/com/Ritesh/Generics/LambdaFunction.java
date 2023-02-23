package com.Ritesh.Generics;

import java.util.ArrayList;

public class LambdaFunction {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            arr.add(i + 1);
        }

        arr.forEach((item) -> System.out.println(item * 2));

        Operation sum = (a, b) -> a + b;
        Operation sub = (a, b) -> a - b;
        Operation prod = (a, b) -> a * b;
        Operation div = (a, b) -> a / b;

        LambdaFunction Calulator = new LambdaFunction();
        System.out.println(Calulator.operate(5, 6, sum));
        System.out.println(Calulator.operate(4, 9, sub));
        System.out.println(Calulator.operate(5 , 7, prod));
        System.out.println(Calulator.operate(12, 2, div));
    }
    private int operate(int a, int b, Operation op){
        return op.operation(a, b);
    }
}
interface Operation{
    int operation(int a, int b);
}
