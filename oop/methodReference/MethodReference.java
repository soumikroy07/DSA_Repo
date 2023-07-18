package com.soumik.oop.methodReference;

/*
    Types : static method, Instance methods of particular object, Constructor
    when ever we are going to pass methods of another class we need to validated their argument should be same
 */

public class MethodReference {
    public static void main(String[] args) {



        // here we are referring static method
        Work work = MyWork ::myWork;

        work.doWork();


        // using thread by static method reference { class :: method }
        Runnable runnable = MyWork ::threadTask;

        Thread thread = new Thread(runnable);
        thread.start();



        // using thread by non-static method reference { object :: method }
        MyWork myWork = new MyWork();
        Runnable run = myWork ::printSeries;

        Thread thread1 = new Thread(run);
        thread1.start();
    }
}
