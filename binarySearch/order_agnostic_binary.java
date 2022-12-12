package com.shivam.practice.binarySearch;

import java.util.Scanner;

public class order_agnostic_binary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={9,8,7,6,5,4,3,2,1};
        int target=7;
        int index=find(arr,target);
        System.out.println(index);

    }

    private static int find(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        boolean isAsce=arr[s]<arr[e];

        while (s<=e)
        {
            int mid=s+(e-s)/2;
            if(arr[mid]==target)
                return mid;

            else if(isAsce)
            {
               if(target>arr[mid])
                s=mid+1;
            else
                e=mid-1;
            }
            else
            {
                if(target<arr[mid])
                    s=mid+1;
                else
                    e=mid-1;
            }

            }


        return -1;
    }
}
