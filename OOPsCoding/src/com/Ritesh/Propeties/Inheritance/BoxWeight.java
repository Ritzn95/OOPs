package com.Ritesh.Propeties.Inheritance;

import java.util.ArrayList;

public class BoxWeight extends Box{
    double weight;

    public BoxWeight(){
        this.weight = -1;
    }
    static void greeting() {
        System.out.println("Hey, I am in BoxWeight class. Greetings!");
        ArrayList list = new ArrayList();
    }
    public BoxWeight(double l, double h, double w, double weight){
        super(l,h,w);
        this.weight = weight;
    }
    BoxWeight (BoxWeight other) {
        super(other);
        weight = other.weight;
    }
    BoxWeight(double side, double weight) {
        super(side);
        this.weight = weight;
    }
}
