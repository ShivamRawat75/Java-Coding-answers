package com.shivam.practice.codes100;

import java.util.*;

public class ANS {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=sc.nextInt();

        int arr[]=new int[n];

        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);

        int ctr=0;
        for(int i=0;i<n;i++)
        {
            if(arr[i]<x)
            {
                if(x-arr[i]>c)
                {
                    arr[i]=x;
                    ctr++;
                }
            }
        }
        int sum=0;
        for(int i=0;i<n;i++)
        {
            sum+=arr[i];
        }

        System.out.println(sum-(c*ctr));
    }
}
