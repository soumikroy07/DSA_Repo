package com.soumik.DS.soumik.DS;

public class Leetcode_Biweekly_92_3 {
    public static void main(String[] args) {
        String c = "YN";
        int ans = bestClosingTime(c);
        System.out.println(ans);
    }

    private static int bestClosingTime(String customers) {
        int n = customers.length();
        int [] marr = new int[n];
        int [] tara = new int[n];
        char[]ca = customers.toCharArray();

        if(ca[0]=='N')
            tara[0]++;

        for(int i=1;i<n;i++)
        {
            if(ca[i]=='N')tara[i]++;tara[i]+=tara[i-1];
        }

        if(ca[n-1]=='Y')marr[n-1]++;

        for(int i=n-2;i>=0;i--)
        {
            if(ca[i]=='Y')marr[i]++;marr[i]+=marr[i+1];
        }

        int marks = 10000000;
        int ind = -1;
        for(int i=0;i<n;i++)
        {
            int curr = marr[i];int prev = 0;
            if(i-1>=0)prev = tara[i-1];curr +=prev;
            if(curr<marks)
            {
                marks = curr;
                ind = i;
            }
        }

        int lastt = tara[n-1];
        if(lastt<marks)return n;
        return ind;


    }
}
