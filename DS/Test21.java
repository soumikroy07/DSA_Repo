package com.soumik.DS;

public class Test21 {
    public static void main(String[] args) {
        String str="sanveev jha";
        String s=findSmallest(str);
        System.out.println(s);
    }
    static String findSmallest(String str){
        str=str+" ";
        int n=str.length();
        int count=0;
        String ans="";
        for(int i=0;i<n;i++){

            if(str.charAt(i)!=' '){
                count++;
            }else{
                for(int j=i-1;j>i-count-1;j--){
                    ans=ans+str.charAt(j);
                }
                ans=ans+" ";
                count=0;
            }

        }

        return ans;
    }
}
