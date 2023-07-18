package com.soumik.DS.soumik.DS;

public class Leetcode_324_2 {
    public static void main(String[] args) {
        int n = 99951;
        int ans = smallestValue(n);
        System.out.println(ans);
    }
    static boolean[] factors;
    private static int smallestValue(int n) {
        factors = new boolean[n+1];
        for(int i=0; i<=n; i++){
            factors[i] = true;
        }
        for(int i=2; i<=n; i++){
            if(factors[i]){
                for(int j = i*i; j<=n; j += i){
                    factors[j] = false;
                }
            }
        }

        int ans = helper(n);
        return ans;
    }

    private static int helper(int n) {
        if(factors[n]){
            return n;
        }
        int sum = 0, num = n;
        int i = 2;
        while(i <= n){
            if(factors[i] && n % i == 0){
                sum += i;
//                if(sum == n){
//                    return sum;
//                }
                n = n / i;
            }else{
                i++;
            }
        }
        if(sum == num){
            return num;
        }else{
            return helper(sum);
        }
    }
}
