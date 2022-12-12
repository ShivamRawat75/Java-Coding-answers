package com.shivam.practice;

import java.util.Arrays;

public class Queries {
    public static void main(String[] args) {
        int arr[]= new int[]{1,2,3};
        int arr2[][]= new int[][]{{2,1,2},{1},{3}};

        modify(arr,arr2);
        System.out.println(Arrays.toString(arr));
    }

    private static void modify(int[] arr, int[][] arr2) {

        for(int i=0;i< arr2.length;i++)
        {
            if(arr2[i][0]==1)
            {
                reverse(arr);
            } else if(arr2[i][0]==2)  {
                int a=arr2[i][1];
                int b=arr2[i][2];
                int temp=arr[a];
                arr[a]=arr[b];
                arr[b]=temp;
            }
            else if(arr2[i][0]==3)
            {
                System.out.println(arr[arr2[i][1]]);
            }


        }
    }

    private static void reverse(int[] arr) {
        int s=0,e=arr.length-1;
        while(s<=e)
        {
            int temp=arr[s];
            arr[s]=arr[e];
            arr[e]=temp;

            s++;
            e--;
        }
    }
}
