package com.shivam.practice.teenu_test;

import java.util.Scanner;

public class prob_one {
    public static int ans = 10000000;
    public static void solve(int a[], int n, int k,
                             int index, int sum, int maxsum)
    {
        // K=1 is the base Case
        if (k == 1) {
            maxsum = Math.max(maxsum, sum);
            sum = 0;
            for (int i = index; i < n; i++) {
                sum += a[i];
            }
            // we update maxsum
            maxsum = Math.max(maxsum, sum);
            // the answer is stored in ans
            ans = Math.min(ans, maxsum);
            return;
        }
        sum = 0;
        // using for loop to divide the array into
        // K-subarray
        for (int i = index; i < n; i++) {
            sum += a[i];
            // for each subarray we calculate sum ans update
            // maxsum
            maxsum = Math.max(maxsum, sum);
            // calling function again
            solve(a, n, k - 1, i + 1, sum, maxsum);
        }
    }



    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[] = { 1, 2, 3, 4 };
        int k = 3; // K divisions
        int n = 4; // Size of Array
        solve(arr, n, k, 0, 0, 0);
        System.out.println(ans + "\n");
    }
}
