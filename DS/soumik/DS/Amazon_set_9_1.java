package com.soumik.DS.soumik.DS;

import java.util.HashSet;
import java.util.Set;

public class Amazon_set_9_1 {
    static Set<Character> set = new HashSet<>();
    public static void main(String[] args) {
        String password = "aeiou";
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        int ans = getStrength(password);
        System.out.println(ans);
    }

    private static int getStrength(String password) {
        int vowel = 0, consonant = 0;
        int ans = 0;
        int n = password.length();
        for(int i=0; i<n; i++){
            char c = password.charAt(i);
            if(set.contains(c)){
                vowel++;
            }else {
                consonant++;
            }

            if (vowel >= 1 && consonant >= 1){
                ans++;
                vowel = 0;
                consonant = 0;
            }
        }

        return ans;
    }
}
