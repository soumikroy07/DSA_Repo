package com.soumik.DS.soumik.DS;

public class GFG_POTD_22_NOV {
    public static void main(String[] args) {
        int nums[] = {3, 2, 1, 6, 8, 2};
        int ans = countTriplets(nums);
        System.out.println(ans);
    }
    public static int countTriplets(int[] nums){
        // code here
        int n = nums.length;
        int greaterRight[] = new int[n];
        int smallerLeft[] = new int[n];

        for(int i=1; i<n-1; i++){
            int count = 0;
            for(int j = i-1; j>=0; j--){
                if(nums[j] < nums[i])
                    count++;
            }

            smallerLeft[i] = count;
        }

        for(int i=1; i<n-1; i++){
            int count = 0;
            for(int j=i+1; j<n; j++){
                if(nums[j] > nums[i])
                    count++;
            }
            greaterRight[i] = count;
        }

        int ans = 0;
        for(int i=1; i<n-1; i++){
            ans += (smallerLeft[i] * greaterRight[i]);
        }

        return ans;
    }
}
