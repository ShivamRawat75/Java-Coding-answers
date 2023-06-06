package com.shivam.practice.DP_Level_1;
// Climbing Stairs - Dynamic Programming using Tabulation and memoization

import java.util.Scanner;

public class One {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=paths(n,new int[n+1]);
        System.out.println(ans);
    }

    private static int paths(int n, int[] dp) {
        if(n<=2)
            return n;
        if(dp[n]!=0)
            return dp[n];
        int path=paths(n-1,dp)+paths(n-2,dp);

        dp[n]=path;

        return path;

    }
}
