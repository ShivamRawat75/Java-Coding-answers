package com.shivam.practice.Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n,m,k;
        n=sc.nextInt();
        m=sc.nextInt();
        k=sc.nextInt();
        int arr[]=new int[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        int start=0,end=k;
        int finalAns=0;
        if(k>=m)
        {
            System.out.println(n);
            return;
        }
        if(k<m)
        {
            finalAns=arr[end]-1;
        }
        for(int j=end+1;j<m;j++)
        {
            finalAns=Math.max(finalAns,n-arr[start]);
        }
        finalAns=Math.max(finalAns,n-arr[start]);
        System.out.println(finalAns);

    }
}
