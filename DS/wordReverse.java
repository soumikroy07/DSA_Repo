package com.soumik.DS;

public class wordReverse {
    public static void main(String[] args) {
        String str=" Sanjeev Jha";
        reverseWord(str);

    }
    static void reverseWord(String s){
        char[] str = s.toCharArray();
        int start=0;
        int n=s.length();
        for(int i=0;i<n;i++){
            if(str[i]== ' '){
                reverse(str,start,i-1);
                start=i+1;
            }
        }
        reverse(str,start,n-1);
        reverse(str,0,n-1);
        System.out.println(str );
    }
    static void reverse(char [] str,int low,int high){
        while(low<=high){
            char temp=str[low];
            str[low]=str[high];
            str[high]=temp;

            low++;
            high--;
        }

    }
}
