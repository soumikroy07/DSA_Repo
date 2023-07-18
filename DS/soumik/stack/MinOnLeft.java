package com.soumik.DS.soumik.stack;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class MinOnLeft {
    public static void main(String[] args) {
        int n = 7;
        int arr[] = {8,8,8,8,8,8,8};

        ArrayList<Integer> ans = leftSmaller( n, arr);
        for (int i=0; i<ans.size(); i++){
            System.out.print(ans.get(i)+ " ");
        }
    }

    static ArrayList<Integer> leftSmaller(int n, int a[])
    {
        //code here
        ArrayList<Integer> list = new ArrayList<>();
        Stack<Integer> st = new Stack<>();
        list.add(-1);
        st.push(a[0]);
        for(int i=1; i<n; i++){
            if(!st.isEmpty()){
                while(a[i] <= st.peek()){
                    st.pop();
                    if(st.isEmpty()){
                        list.add(-1);
                        st.push(a[i]);
                        break;
                    }
                }
                if(st.peek() < a[i]){
                    list.add(st.peek());
                    st.push(a[i]);
                }
            }
        }
        return list;
    }
}
