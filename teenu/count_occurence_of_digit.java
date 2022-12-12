package com.shivam.practice.teenu;

import java.util.Scanner;

public class count_occurence_of_digit {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int x=sc.nextInt();
        int c=0;
        for(int i=m;i<=n;i++)
        {
            int k=check(i,x);
//            if(k==1)
//            {
//                System.out.print(i+" ");
//            }
            c+=k;
        }
        System.out.println(c);
    }

    private static int check(int i,int x) {
        int c=0;
        while(i>0)
        {
            if(i%10==x)
                c++;
            i=i/10;

        }
        return c;
    }

}

