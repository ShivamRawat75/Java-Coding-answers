package com.shivam.practice.teenu;

import java.util.Scanner;

public class magic_no {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println(solve(n));
    }

    public static int solve(int n) {

        int sum;
        while(n>9)
        {
            int a=n;
            sum=0;
            while(a>0)
            {
                sum+=a%10;
                a=a/10;
            }
            n=sum;
        }
        if(n==1)
            return 1;

        return 0;
    }
}
