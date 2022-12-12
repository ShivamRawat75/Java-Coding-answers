package com.shivam.practice.IBM;
// fibonacci series serie

import java.util.Scanner;

public class question3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int f=sc.nextInt();
        int s=sc.nextInt();
        int l= sc.nextInt();

        if(f>s)
        {
            System.out.println("Invalid");
            return;
        }
        int c=0;
        for(int i=1;i<=l-2;i++)
        {
            c=f+s;
            f=s;
            s=c;
        }
        System.out.println(c);
    }
}
