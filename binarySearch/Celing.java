package com.shivam.practice.binarySearch;

import java.util.Scanner;

public class Celing {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        int arr[]={1,6,7,9,12,23,26,56};
        int target=5;
        int index=find(arr,target);
        System.out.println(index);
        System.out.println(arr[index]);

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


        return s;
    }
}
