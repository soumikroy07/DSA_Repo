package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.Set;

public class LeetcodeContest320_1 {
    public static void main(String[] args) {
        int nums[] = {4,4,2,4,3};
        int ans = unequalTriplets(nums);
        System.out.println(ans);
    }

    private static int unequalTriplets(int[] nums) {
        Set<int[]> set1 = new HashSet<>();
        for(int i=0; i<nums.length-2; i++){
            for(int j=i+1; j<nums.length-1; j++){
                Set<Integer> set = new HashSet<>();
                for(int k=j+1; k<nums.length; k++){
                    set.add(nums[i]);
                    set.add(nums[j]);
                    set.add(nums[k]);
                    if(set.size() == 3){
                        int arr[] = new int[3];
                        int x = 0;
                        for(Integer y : set){
                            arr[x++] = y;
                        }
                        set1.add(arr);
                        break;
                    }
                }
            }
        }

        return set1.size();
    }
}
