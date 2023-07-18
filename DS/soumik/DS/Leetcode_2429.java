package com.soumik.DS.soumik.DS;

public class Leetcode_2429 {
    public static void main(String[] args) {
        int num1 = 1, num2 = 12;
        int x = minimizeXor(num1, num2);
        System.out.println(x);
    }

    private static int minimizeXor(int num1, int num2) {
        int bitCount2 = Integer.bitCount(num2);
        int bitCount1 = Integer.bitCount(num1);
        if(bitCount1 == bitCount2) return num1;

        int bits[] = new int[32];
        int k = 31;
        while(num1 != 0){
            bits[k--] = num1 % 2;
            num1 = num1 >> 1;
        }

        int def = Math.abs(bitCount1 - bitCount2);

        if(bitCount1 < bitCount2){
            for(int i=31; i>=0; i--){
                if(bits[i] == 0){
                    bits[i] = 1;
                    def--;
                }
                if(def == 0) break;
            }
        }else{
            for(int i=31; i>=0; i--){
                if(bits[i] == 1){
                    bits[i] = 0;
                    def--;
                }
                if(def == 0) break;
            }
        }
        int ans = 0;
        for(int i=31; i>=0; i--){
            ans += (bits[i] * (int)(Math.pow(2, (31-i))));
        }

        return ans;
    }
}
