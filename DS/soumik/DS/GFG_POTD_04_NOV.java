package com.soumik.DS.soumik.DS;

public class GFG_POTD_04_NOV {
    public static void main(String[] args) {
        String s = "aeroplane";
        String ans = rearrange(s, s.length());
        System.out.println(ans);
    }

    private static String rearrange(String s, int n) {
        int con[] = new int[26];
        int vow[] = new int[26];

        for(char c : s.toCharArray()){
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'){
                vow[c - 'a']++;
            }else{
                con[c - 'a']++;
            }
        }

        int i = 0, j = 0;
        StringBuilder sb = new StringBuilder();
        while(i < 26 && j < 26){
            while(vow[i] == 0) i++;
            while(con[j] == 0) j++;
            if(vow[i] != 0){
                sb.append((char) (i+97));
                vow[i]--;
            }
            if(con[j] != 0){
                sb.append((char) (j+97));
                con[j]--;
            }
        }

        return sb.toString();
    }
}
