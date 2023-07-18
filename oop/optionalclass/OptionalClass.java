package com.soumik.oop.optionalclass;


/*
    Mainly used to handle null pointers exception
 */

import java.util.Optional;

public class OptionalClass {
    public static void main(String[] args) {

        String str = "I will achieve my dreams";
        Optional<String> optional = Optional.ofNullable(str);

        System.out.println(optional.isEmpty());
        System.out.println(optional.isPresent());


//        System.out.println(optional.get());

        System.out.println(optional.orElse("No value present in the string"));

        Optional<String> myName = getName();
        System.out.println(myName.orElse("No name is provided"));
    }


    public static Optional<String> getName(){
        String name = "Soumik";
        return Optional.ofNullable(name);
    }
}
