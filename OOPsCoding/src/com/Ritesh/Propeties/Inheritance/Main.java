package com.Ritesh.Propeties.Inheritance;

public class Main {
    public static void main(String[] args) {
        Box box = new Box(1, 2, 3);
        Box box1 = new Box(box);
        BoxCost bo2 = new BoxCost(21,34,200);
    }
}
