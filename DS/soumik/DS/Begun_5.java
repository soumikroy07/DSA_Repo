package com.soumik.DS.soumik.DS;

public class Begun_5 {
    static int mod = (int) 1e9+7;

    public static void main(String[] args) {
        long ans = greatestFactorial(5L, 3L, 8L);
        System.out.println(ans);
    }

    private static long greatestFactorial(long a, long b, long c) {
        long a1 = fact(a);
        long a2 = fact(b);
        long a3 = fact(c);

        long gcd1 = getGcd(a1, a2);
        long ans = getGcd(gcd1, a3);
        return ans % mod;
    }

    private static long getGcd(long a1, long a2) {
        if(a1 < a2){
            return getGcd(a2, a1);
        }
        if(a1 % a2 == 0){
            return a2;
        }
        return getGcd(a2, a1%a2);
    }

    private static long fact(long a) {
        long ans = 1L;
        while (a > 0){
            ans = (ans * a) % mod;
            a--;
        }
        return ans % mod;
    }
}
