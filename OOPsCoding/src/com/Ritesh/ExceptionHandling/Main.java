package com.Ritesh.ExceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a = 5;
        int b = 0;

        try {
            divde(a, b);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("Code Terminated...");
        }
    }
    static int divde(int a, int b) throws Exception{
        if (b == 0){
            throw new Exception("Please provide non zero number");
        }
        return a / b;
    }
}
