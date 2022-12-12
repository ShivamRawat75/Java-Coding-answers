package com.shivam.practice.binarySearch;

import java.util.Scanner;

public class Question1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]={1,2,3,4,5,6,7,8,9};
        int target=7;
        int index=find(arr,target);
        System.out.println(index);

        }
        static int find(int arr[],int target){
            int s=0;
            int e=arr.length-1;
            while (s<=e)
            {
                int mid=s+(e-s)/2;
                if(arr[mid]==target)
                    return mid;
                else if(target>arr[mid])
                    s=mid+1;
                else
                    e=mid-1;
            }
            return -1;
        }
    }

