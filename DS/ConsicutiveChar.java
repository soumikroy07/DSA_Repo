package com.soumik.DS;

class ConsecutiveChar {
    public static void main(String[] args) {
        String str="aaaabbbccaaaavvvejfff";
        String ans=removeConsecutive(str);
        System.out.println(ans);
    }
    public static String removeConsecutive(String str){
        int n=str.length()-1;
        String ans="";
        int i=0;
        while(i<=n){
            if(ans.length()==0){
                ans=""+str.charAt(i);
                i++;
            }
            else if (str.charAt(i-1) != str.charAt(i)) {
                ans = ans + str.charAt(i);
            }
            i++;
        }
        return ans;
    }
}


