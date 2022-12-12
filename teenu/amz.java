package com.shivam.practice.teenu;

import java.util.Scanner;

public class amz {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int s=sc.nextInt();
        int x=sc.nextInt();
        int arr[][]=new int[x][2];
        for(int i=0;i<x;i++)
        {
            for(int j=0;j<2;j++)
            {
                arr[i][j]=sc.nextInt();
            }
        }
        double t=Double.MIN_VALUE;
        double sum=0.0;
        for(int i=1;i<x;i++)
        {
            sum=dist(arr[i-1][0],arr[i][0],arr[i-1][1],arr[i][1]);
            if(sum>t)
                t=sum;

        }
        System.out.println(t/(double)s);
    }
    public static double dist(int a1,int a2,int b1,int b2)
    {
        return Math.sqrt(Math.pow((b2-b1),2)+Math.pow((a2-a1),2));
    }
}
