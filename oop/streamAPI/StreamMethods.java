package com.soumik.oop.streamAPI;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMethods {
    public static void main(String[] args) {
        /*
        filter : filter(predicate : boolean)
         */

        List<String> cities = List.of("Kolkata", "Kochi", "Kedarnath", "Delhi");
        List<String> city = cities.stream().filter(e -> e.startsWith("K")).collect(Collectors.toList());
        System.out.println(city);

        List<String> cityLength  = cities.stream().filter(e -> e.length() == 5).collect(Collectors.toList());
        System.out.println(cityLength);




        /*
            map : map(function)
         */

        List<Integer> numbers = List.of(5,16,23,6,7,2);
        List<Integer> sqrt = numbers.stream().map(i -> i*i).collect(Collectors.toList());
        System.out.println(sqrt);



        /*
            sorted
         */

//        numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
        numbers.stream().sorted((a,b) -> b-a).forEach(System.out::println);


        /*
            find min
         */

        Integer MinValue = numbers.stream().min((a,b) -> a-b).get();
        System.out.println("Min value : "+MinValue);




        /*
            find max
         */

        Integer maxValue = numbers.stream().max((a,b) -> a-b).get();
        System.out.println("Max value : "+maxValue);
    }
}
