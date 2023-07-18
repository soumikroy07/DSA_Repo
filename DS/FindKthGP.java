package com.soumik.DS;

import java.util.*;
public class FindKthGP {
    public static void main(String[] args) {
        double x=findKthsum(3);
        System.out.println(x);
    }
    public static double findKthsum(int k){
        if(k==0){
            return 1;
        }else{
            return (double) (1/Math.pow(2,k)+findKthsum(k-1));
        }
    }
}
