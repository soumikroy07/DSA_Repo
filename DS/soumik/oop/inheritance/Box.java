package com.soumik.DS.soumik.oop.inheritance;

public class Box {
    int l;
    int w;
    int b;

    public Box(int l, int w, int b) {
        this.l = l;
        this.w = w;
        this.b = b;
    }

    void box(){
        System.out.println("I am parent");
    }
}

class BoxWeight extends Box {
    int weight;

    public BoxWeight(int l, int w, int b, int weight) {
        super(l, w, b);
        this.weight = weight;
    }
    @Override
    void box(){
        System.out.println("I am child1");
    }
}

class BoxPrice extends BoxWeight {
    int price;

    public BoxPrice(int l, int w, int b, int weight, int price) {
        super(l, w, b, weight);
        this.price = price;
    }
}

class Main{
    public static void main(String[] args) {
        BoxPrice bx = new BoxPrice(10, 5,15,50,100);
        bx.box();
    }
}