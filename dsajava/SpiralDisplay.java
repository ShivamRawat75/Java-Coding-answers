package com.shivam.practice.dsajava;

import java.util.Scanner;

public class SpiralDisplay {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int minR=0,minC=0;
        int maxR=r-1,maxC=c-1;
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        int ctr=0;
        while(ctr<r*c)
        {
            for(int i=minR;i<=maxR && ctr<r*c;i++)
            {
                System.out.println(mat[i][minC]);
                ctr++;
            }
            minC++;
            for(int i=minC;i<=maxC && ctr<r*c;i++)
            {
                System.out.println(mat[maxR][i]);
                ctr++;
            }
            maxR--;
            for(int i=maxR;i>=minR && ctr<r*c;i--)
            {
                System.out.println(mat[i][maxC]);
                ctr++;
            }
            maxC--;
            for(int i=maxC;i>=minC && ctr<r*c;i--)
            {
                System.out.println(mat[minR][i]);
                ctr++;
            }
            minR++;


        }
    }
}
