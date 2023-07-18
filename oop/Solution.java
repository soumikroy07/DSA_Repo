package com.soumik.oop;
import java.util.*;
public class Solution {
    public static void main(String[] args) {

        int nums1[] = {1,2,3,0,0,0};
        int nums2[] = {2,5,6};
        merge(nums1, nums1.length, nums2, nums2.length);
        for (int i=0; i< nums1.length; i++){
            System.out.print(nums1[i] + " ");
        }
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=0, j=0;
        while(i<m && nums1[i] != 0){
            if(nums1[i]<=nums2[j]){
                i++;
            }else {
                int temp = nums1[i];
                nums1[i] = nums2[j];
                nums2[j] = temp;
                i++;
            }
        }
//        int idx = 0;
        for(int k=i; k<m; k++){
            nums1[k] = nums2[j];
            j++;
        }
    }
}
