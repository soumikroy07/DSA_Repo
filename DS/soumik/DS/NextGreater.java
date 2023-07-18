package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class NextGreater {
    public static void main(String[] args) {
        long arr[] = new long[] {1L, 3L, 2L, 4L};
        long ans[] = nextLargerElement(arr, arr.length);
        for (long a: ans
             ) {
            System.out.print(a + " ");
        }
    }

    private static long[] nextLargerElement(long[] arr, int n) {
        long ans[] = new long[n];
        Stack<Long> st = new Stack<>();
        ans[n-1] = -1;
        st.push(arr[n-1]);
        for(int i=n-2; i>=0; i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()){
                ans[i] = -1L;
            }else{
                ans[i] = st.peek();
            }

            st.push(arr[i]);
        }

        return ans;
    }
}
