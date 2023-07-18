package com.soumik.oop.Anotation;

public class MainClass {
    public static void main(String[] args) {

        Demo demo = new Demo();
        Class c = demo.getClass();
        System.out.println(c.getName());

        MyAnno an = (MyAnno) c.getAnnotation(MyAnno.class);
        System.out.println(an.getValue());
        System.out.println(an.name());
        System.out.println(an.city());
    }
}
