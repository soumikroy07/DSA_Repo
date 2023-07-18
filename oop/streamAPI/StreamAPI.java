package com.soumik.oop.streamAPI;
/*
    1) basically used for bulk operations & processed the objects of collection
    2) reduced the code size
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamAPI {
    public static <StringStream> void main(String[] args) {

        // here lists are immutable
        List<Integer> list = List.of(10,20,50,30,62,41,69,26);


//        list.add(89);// this operation will not perform here it gives *Unsupported Operation Exception*




        /*

        previously we were using this types of operation to check even numbers

        List<Integer> newList = new ArrayList<>();

        for(int i : list){
            if(i % 2 == 0) {
                newList.add(i);
            }
        }
        System.out.println(newList);

        */



        // we are adding all even numbers using stream
        List<Integer> evenList = list.stream().filter( i-> i%2 == 0 ).collect(Collectors.toList());
        System.out.println(evenList);



        // We can use stream in array also
        // we can make operation in a stream only once
        String names[] = {"Soumik", "Sikkim", "Darjeeling", "Sandakphu"};
        Stream<String> allNames = Stream.of(names);


//        allNames.forEach(e ->{
//            System.out.print(e + " ");
//        });
        System.out.println();
        allNames.filter(e -> e.startsWith("S")).forEach(System.out::println);



        System.out.println();




        //Integer stream
        IntStream numbers =  Arrays.stream(new int[]{2, 79,25,17,46,69});

        numbers.forEach(e->{
            System.out.print(e + " ");
        });
    }
}
