package com.shivam.practice.teenu;

import java.util.ArrayList;

public class reverse {
    public static void main(String[] args) {
        ArrayList<Integer> arr=new ArrayList<>();
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);
        arr.add(5);

        rev(arr,5,3);
    }
    static void rev(ArrayList<Integer>arr,int n,int k){

        int ans[]=new int[n];
        int j=0;
        for(int i:arr)
        {
            ans[j++]=i;
        }
        swap(ans,0,k-1);
        swap(ans,k,n-1);

        for(int i:ans){
            System.out.print(i);
        }


    }
    static void swap(int[] ans,int i,int j)
    {
        int temp;
        while (i<=j)
        {
            temp=ans[i];
            ans[i]=ans[j];
            ans[j]=temp;

            i++;
            j--;
        }
    }
}
