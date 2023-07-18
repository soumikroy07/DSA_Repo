package com.soumik.DS;

public class StringRemove {
    public static void main(String[] args) {
        String input="xxxxxss";


        System.out.println(removeX(input));
    }
    public static String removeX(String input){
        if(input.length()==0){
            return input;
        }
        String small=removeX(input.substring(1));
        if(input.charAt(0)=='x'){
            return small;
        }else{
            return input.charAt(0)+small;
        }


    }
}
