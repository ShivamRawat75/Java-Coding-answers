package com.shivam.practice.binarySearch;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int ans=maxSum(a,b,c);
        System.out.println(ans);
    }

    private static int maxSum(int a, int b, int c) {

        int max=Math.max(a,b);
        max=Math.max(max,c);

        int ans=0;

        for(int i=1;i<=max;i++)
        {
            int temp=(a^i)+(b^i)+(c^i);
            ans=Math.max(ans,temp);
        }
        return ans;
    }
}
