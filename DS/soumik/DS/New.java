package com.soumik.DS.soumik.DS;

public class New {
    public static void main(String[] args) {
        int arr[] = {3,2,2,4,1,4}, d = 3;
        int x = shipWithinDays(arr, d);
        System.out.println(x);
    }

    public static int shipWithinDays(int[] weights, int days) {
        int low = maxOf(weights);
        int high = sumOf(weights);
        int res = 0;
        while(low <= high){
            int mid = low +(high - low) / 2;
            if(isValid(weights , days, mid)){
                res = mid;
                high = mid - 1;
            }else{
                low = mid+1;
            }
        }
        return res;
    }

    static boolean isValid(int weights[], int days, int res){
        int sum = 0, day = 1;
        for(int i : weights){
            if(sum+i > res){
                day++;
                sum = i;
            }else{
                sum += i;
            }
        }

        return day<=days ;
    }

    static int maxOf(int weights[]){
        int max = Integer.MIN_VALUE;
        for(int w : weights){
            max = Math.max(max , w);
        }
        return max;
    }

    static int sumOf(int weights[]){
        int sum = 0;
        for( int w : weights){
            sum += w;
        }
        return sum;
    }
}
