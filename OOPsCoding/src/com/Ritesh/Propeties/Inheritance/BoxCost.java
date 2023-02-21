package com.Ritesh.Propeties.Inheritance;

public class BoxCost extends BoxWeight{
    double price;
    BoxCost (){
        super();
        this.price = -1;
    }
    BoxCost(BoxCost other){
        super(other);
        this.price = other.price;
    }
    public BoxCost(double l, double h, double w, double weight, double price) {
        super(l, h, w, weight);
        this.price = price;
    }
    public BoxCost(double side, double weight, double price){
        super(side, weight);
        this.price = price;
    }
}
