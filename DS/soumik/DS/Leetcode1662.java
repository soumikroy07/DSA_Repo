package com.soumik.DS.soumik.DS;

public class Leetcode1662 {
    public static void main(String[] args) {
        String word1[] = {"a", "cb"};
        String word2[] = {"ab", "c"};

        boolean ans = arrayStringsAreEqual(word1, word2);
        System.out.println(ans);
    }

    private static boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        int hash[] = new int[26];

        for(String word : word1){
            for(char c : word.toCharArray()){
                hash[c - 'a']++;
            }
        }

        for(String word : word2){
            for(char c : word.toCharArray()){
                hash[c - 'a']--;
            }
        }

        for(int i=0; i<26; i++){
            if(hash[i] != 0){
                return false;
            }
        }

        return true;
    }
}
