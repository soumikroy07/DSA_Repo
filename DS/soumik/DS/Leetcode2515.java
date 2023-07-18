package com.soumik.DS.soumik.DS;

public class Leetcode2515 {
    public static void main(String[] args) {
        String words[] = new String[]{"hsdqinnoha","mqhskgeqzr","zemkwvqrww","zemkwvqrww","daljcrktje","fghofclnwp","djwdworyka","cxfpybanhd","fghofclnwp","fghofclnwp"};
        String target = "zemkwvqrww";
        int start = 8;
        int ans = closestTarget(words, target, start);
        System.out.println(ans);
    }

    private static int closestTarget(String[] words, String target, int start) {
        int n = words.length;

        int ans = -1, len1 = Integer.MAX_VALUE, len2 = Integer.MAX_VALUE;
        for(int i=start; i<n; i++){
            if(words[i].equals(target)){
                len1 = i - start;
                break;
            }
        }

        for(int i=start; i>=0; i--){
            if(words[i].equals(target)){
                len2 = start - i;
                break;
            }
        }

        if(len2 == Integer.MAX_VALUE && len1 != Integer.MAX_VALUE){
            len2 = n - len1;
        }

        if(len1 == Integer.MAX_VALUE && len2 != Integer.MAX_VALUE){
            len1 = n - len2;
        }

        ans = Math.min(len1, len2);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }
}
