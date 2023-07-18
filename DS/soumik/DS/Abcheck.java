package com.soumik.DS.soumik.DS;

public class Abcheck {
    static int a ;
    Abcheck(){

    }
    void print(){

    }
}

class B extends Abcheck{

    @Override
    void print(){
        System.out.println("implemented function from abstract class");
    }

    public static void main(String[] args) {
        Abcheck ab = new Abcheck();
        Abcheck.a = 10;
        System.out.println(Abcheck.a);
    }
}
