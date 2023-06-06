package com.shivam.practice.deloite;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int ans=Integer.MAX_VALUE;
        int a=0,b=0;
        int x=0,y=0,temp=0;
        for(int i=1;i*i<=n;i++)
        {
            if(n%i==0)
            {
                a=i;
                b=n/i;
                temp=b-a;
            }
            if(temp<=ans)
            {
                ans=temp;
                x=a;
                y=b;
            }

        }
        System.out.println(x+" "+y);
    }
}
