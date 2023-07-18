package com.soumik.oop.methodReference;

import java.time.LocalDate;

public class MyWork {
    public static void myWork(){
        System.out.println("I have completed my work");
        LocalDate time = LocalDate.now();
        System.out.println(time.toString());
    }

    public static void threadTask() {
        for (int i=1; i<11; i++){
            System.out.println("Table of 2 : 2 X " + i +" = " + 2*i);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }

    public  void printSeries(){
        for (int i=0; i<11; i++){
            System.out.println(i * 3);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
    }
}
