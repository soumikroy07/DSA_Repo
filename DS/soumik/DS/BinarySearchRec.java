package com.soumik.DS.soumik.DS;

public class BinarySearchRec {
    public static void main(String[] args) {
        int nums[]={2,3,4,7,8};
//        int n= arr.length;

        int target=4;
//        int start=0;
//        int end=n-1;
//        x=BSearch(arr,start,end,x);

        int low = 0, high = nums.length-1, ans = -1;
        while(low <= high){
            int mid = low + (high - low) / 2;
            if(nums[mid] == target){
                ans = mid;
            }else if(nums[mid] < target){
                low = mid+1;
            }else{
                high = mid - 1;
            }
        }

        System.out.println(ans);
    }
    static int BSearch(int arr[],int start,int end,int x){
        int mid=(start+end)/2;
        if(arr[mid]==x){
            return mid;
        }
        else if(arr[mid]>x){
            return BSearch(arr,start,mid-1,x);
        }
        else{
            return BSearch(arr,mid+1,end,x);
        }
    }


}
