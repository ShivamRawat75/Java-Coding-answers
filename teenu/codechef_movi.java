package com.shivam.practice.teenu;

import java.util.Scanner;

public class codechef_movi {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int free=sc.nextInt();
            int n=sc.nextInt();
            int arr[][]=new int[n][2];
            for(int i=0;i<n;i++)
            {
                for(int j=0;j<2;j++)
                {
                    arr[i][j]=sc.nextInt();
                }
            }
            int mov=Integer.MIN_VALUE;
            for(int i=0;i<n;i++)
            {
                if(arr[i][0]<=free)
                {
                    mov=Math.max(mov,arr[i][1]);
                }

            }
            System.out.println(mov);
            t--;
        }
    }
}
