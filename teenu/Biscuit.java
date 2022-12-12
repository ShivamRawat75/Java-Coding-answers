package com.shivam.practice.teenu;

import java.util.Scanner;

public class Biscuit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        int ans=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]<ans)
                ans=arr[i];
        }
        System.out.println(ans);
    }
}
