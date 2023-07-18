package com.soumik.oop;

interface Demo{
    void method1();
    void method2();
}

public class Anonimous {
    public static void main(String[] args) {

        // object can't be form in case of interface so here we directly implement the child class

        Demo dm = new Demo() {
            @Override
            public void method1() {
                System.out.println("I am method 1");
            }

            @Override
            public void method2() {
                System.out.println("I am method 2");
            }
        };
        dm.method1();
        dm.method2();
    }
}


/*

    Note :

    In the main function we are not implementing Interface in another class
    Rather we implement that abstract methode while calling the object of that interface
    so here the implementation is known as Anonymous class

 */