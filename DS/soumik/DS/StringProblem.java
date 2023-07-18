package com.soumik.DS.soumik.DS;

public class StringProblem {
    public static void main(String[] args) {
        String s="01001";
        int ans=longBinSubs(s);
        System.out.println(ans);
    }
    private static int longBinSubs(String s) {
        int count=-1,ans=1;
        int i=0;
        while(i<s.length()-1){
            if(s.charAt(i)!=s.charAt(i+1)){
                ans++;
            }else{
                if(ans>count && ans!=1){
                    count=ans;

                }
                ans=1;
            }
            i++;
        }
        return count;
    }
}
