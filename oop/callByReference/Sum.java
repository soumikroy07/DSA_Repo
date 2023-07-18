package com.soumik.oop.callByReference;

public class Sum {
    int a,b;

    public Sum(int a, int b) {
        this.a = a;
        this.b = b;
    }

    void change(Sum s){
        s.a=s.a-5;
        s.b=s.b+5;
    }
}

class Main {
    public static void main(String[] args) {
        Sum s= new Sum(5,10);
        s.change(s);
        System.out.println(s.a + " "  +s.b);
    }
}
