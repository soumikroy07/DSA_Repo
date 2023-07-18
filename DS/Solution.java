package com.soumik.DS;

import java.util.Arrays;

public class Solution {
    public static void main(String[] args) {
        int arr1[]={2 ,6 ,8 ,5 ,4 ,3};
        int arr2[]={ 2 ,3 ,4 ,7  };
        intersection(arr1,arr2);
    }

    public static void intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int i=0,j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j] ){
                System.out.print(nums1[i]+ " ");
                i++;
                j++;
            }
            else if(nums1[i]<nums2[j]){
                i++;
            }
            else
                j++;
        }
    }
}
