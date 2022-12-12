package com.shivam.practice.accenture;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=OddEvenSum(n);
        System.out.println(ans);
    }
    public  static int OddEvenSum(int n)
    {
        int odd=0,even=0;

        while(n>0)
        {
            int rem=n%10;
            if(rem%2==0)
            {
                even+=rem;
            }
            else {
                odd+=rem;
            }

            n=n/10;
        }
        if(odd>=even)
            return odd;

        return even;
    }
}
