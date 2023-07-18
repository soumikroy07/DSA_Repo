package com.soumik.DS.soumik.DS;

public class Leetcode424 {
    public static void main(String[] args) {
        int k = 2;
        String s = "ABBB";
        int ans = characterReplacement(s, k);
        System.out.println(ans);
    }

    private static int characterReplacement(String s, int k) {
        int count = k;
        int left = 0, right = 0, len = 0, ans = 0;

        while(right < s.length() && left < s.length()){
            if(s.charAt(right) == 'A'){
                right++;
                len = right - left;
                ans = Math.max(ans, len);
            }else{
                if(count != 0){
                    count--;
                    right++;
                    len = right - left;
                    ans = Math.max(ans, len);
                }else{

                    while(left < s.length() && s.charAt(left) == 'A'){
                        left++;
                    }
                    count++;
                    left++;
                }
            }
        }
        return ans;
    }
}
