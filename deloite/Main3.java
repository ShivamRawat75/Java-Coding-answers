package com.shivam.practice.deloite;

import java.util.Scanner;



public class Main3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t= sc.nextInt();

        while(t>0)
        {
            int r=3;
            int n=sc.nextInt();
            if(n<3)
                System.out.println(0);
            else {
                System.out.println(fact(n) / fact(n-r));
            }
            t--;
        }
    }

    private static long fact(long n) {

        long f = 1;
        long j = 1;
        while(j <= n) {
            f = f * j;
            j++;
        }
        return f;
    }
}
