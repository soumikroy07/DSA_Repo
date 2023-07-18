package com.soumik.DS;

public class StringPermutation {
    public static void main(String[] args) {
        String str1="sinrtg";
        String str2="string";
        boolean ans=permutationString(str1,str2);
        System.out.println(ans);
    }
    static boolean permutationString(String str1,String str2){
        char[ ] s1=str1.toCharArray();
        char [] s2=str2.toCharArray();
        int l1=s1.length;
        int l2=s2.length;
        int count=0;
        boolean ans=true;
        for(int i=0;i<l1;i++){
            for(int j=0;j<l2;j++){
                if(s1[i]==s2[j]){
                    s2[j]=' ';
                    count++;
                }
            }
            if(count==0){
                ans=false;
            }
        }
        return ans;
    }
}
