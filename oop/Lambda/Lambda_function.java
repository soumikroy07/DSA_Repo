package com.soumik.oop.Lambda;


/* Lambda function :
    1) No name;
    2) No Modifier
    3) No return type
 */

/* Lambda Expression : is only used for functional interface while contains only one abstract method
    if any interface having more than one abstract method then we can use Anonymous class..

    Functional Interface :   when an interface holds only one abstract method
       Example : Runnable & comparable interface
 */

public class Lambda_function {
    public static void main(String[] args) {

        // for MyInterface

        MyInterface myInterface = () -> {
            System.out.println("I am using Lambda expression in interface");
        };
        myInterface.sayHello();



        // for MySum interface

        MySum mySum = (a, b) -> a+b;
        System.out.println(mySum.sum(5, 6));
    }
}
