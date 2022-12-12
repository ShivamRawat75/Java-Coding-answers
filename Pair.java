package com.shivam.practice;

public class Pair {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 2, 4, 2, 5, 3, 5 };
        int x=2;
        int ans=count(arr,x);
        System.out.println(ans);
    }

    private static int count(int[] arr,int x) {
        int ans=0;
        for(int i=0;i< arr.length-1;i++)
        {
            for(int j=i+1;j< arr.length;j++)
            {
                if(arr[i]==arr[j] && (i*j)%x==0)
                    ans++;
            }

        }
        return ans;
    }
}
