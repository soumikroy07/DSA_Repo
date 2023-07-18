package com.soumik.DS.soumik.DS;

public class CheckAB {
    public static void main(String[] args) {
        boolean ans=check("abb");
        System.out.println(ans);
    }
    public static boolean check(String str){
        if(str.length()==0){
            return false;
        }
        else if(str.charAt(0)=='a' && str.charAt(1)=='a' ){
            check(str.substring(2));
            return true;
        }
        else if(str.charAt(0)=='a' && str.charAt(1)=='b' && str.charAt(2)=='b'){
            check(str.substring(3));
            return true;
        }
        else if(str.charAt(0)=='b' && str.charAt(1)=='b' && str.charAt(2)=='a'){
            check(str.substring(3));
            return true;
        }
        else if(str.charAt(0)=='b' && str.charAt(1)=='b' && str.charAt(2)==' '){
            check(str.substring(3));
            return true;
        }
        return false;
    }
}
