package com.soumik.DS.soumik.DS;

import java.util.Stack;

public class GFG_POTD_24_APR {
    public static void main(String[] args) {
        int arr[] = new int[]{1, 3, 2};
        int ans[] = nearestSmallestTower(arr);
        for (int a: ans){
            System.out.print(a + " ");
        }
    }

    private static int[] nearestSmallestTower(int[] arr) {
        int n = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] left = new int[n];
        int[] right = new int[n];
        left[0] = -1;
        st.push(0);

        for(int i=0; i<n; i++){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                left[i] = -1;
                st.push(i);
            }else{
                left[i] = st.peek();
                st.push(i);
            }
        }

        st.clear();
        st.push(n-1);
        right[n-1] = -1;

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && arr[st.peek()] >= arr[i]){
                st.pop();
            }

            if(st.isEmpty()){
                right[i] = -1;
                st.push(i);
            }else{
                right[i] = st.peek();
                st.push(i);
            }
        }


        int ans[] = new int[n];

        for(int i=0; i<n; i++){
            if(left[i] == -1 && right[i] == -1){
                ans[i] = -1;
            }else if(left[i] != -1 && right[i] == -1){
                ans[i] = left[i];
            }else if(left[i] == -1 && right[i] != -1){
                ans[i] = right[i];
            }else{
                int distanceOnLeft = i - left[i];
                int distanceOnRight = right[i] - i;
                if(distanceOnLeft < distanceOnRight){
                    ans[i] = left[i];
                }else if(distanceOnLeft > distanceOnRight){
                    ans[i] = right[i];
                }else{
                    if(arr[left[i]] < arr[right[i]]){
                        ans[i] = left[i];
                    }else if(arr[left[i]] > arr[right[i]]){
                        ans[i] = right[i];
                    }else{
                        ans[i] = left[i];
                    }
                }
            }
        }

        return ans;
    }
}
