package com.shivam.practice.dsajava;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ar=sc.nextInt();
        int ac=sc.nextInt();
        int a[][]=new int[ar][ac];
        for(int i=0;i<ar;i++)
        {
            for(int j=0;j<ac;j++)
            {
                a[i][j]=sc.nextInt();
            }
        }
        int br=sc.nextInt();
        int bc=sc.nextInt();
        int b[][]=new int[br][bc];
        for(int i=0;i<br;i++)
        {
            for(int j=0;j<bc;j++)
            {
                b[i][j]=sc.nextInt();
            }
        }

        int prod[][]=new int[ar][bc];
        int sum=0;

        for(int i=0;i<ar;i++)
        {
            for(int j=0;j<bc;j++)
            {
                for(int k=0;k<ac;k++)
                {
                    prod[i][j]+=a[i][k]*b[k][j];
                }
            }
        }

        for(int i=0;i<ar;i++)
        {
            for(int j=0;j<bc;j++)
            {
                System.out.println(prod[i][j]);
            }
        }


    }
}
