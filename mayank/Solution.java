package com.shivam.practice.mayank;

import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int a[]=new int[n];
        int b[]=new int[n];
        for(int i=0;i<n;i++)
        {
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            b[i]=sc.nextInt();
        }

        Arrays.sort(a);
        Arrays.sort(b);
        int f=0;
        for(int i=0;i<n;i++)
        {
            if(a[i]!=b[i])
            {
                f=1;
                break;
            }
        }
        if(f==0)
            System.out.println(1);
        else
            System.out.println(0);
    }
}
