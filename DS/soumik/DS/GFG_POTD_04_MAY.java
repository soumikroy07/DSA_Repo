package com.soumik.DS.soumik.DS;

public class GFG_POTD_04_MAY {
    public static void main(String[] args) {
        int ranges[][] = new int[][]{{1 ,3 ,4}, {2 ,3 ,5}, {3 ,4 ,2}};
        int ans = maxCoins(3, ranges);
        System.out.println(ans);
    }

    static int ans = 0;
    public static int maxCoins(int n,int ranges[][])
    {
        solve(ranges, 0, 0, n, 0);
        return ans;
    }

    public static void solve(int arr[][], int i, int price, int n, int count){
        if(i == n){
            if(count == 2){
                ans = Math.max(ans, price);
                // return;
            }
            return;
        }

        if(i == 0){
            solve(arr, i+1, price+arr[i][2], n, count+1);
            solve(arr, i+1, price, n, count);
        }else if(arr[i][0] >= arr[i-1][1]){
            solve(arr, i+1, price+arr[i][2], n, count+1);
            solve(arr, i+1, price, n, count);
        }else if(arr[i][0] < arr[i-1][1]){
            solve(arr, i+1, price, n, count);
        }
    }
}
