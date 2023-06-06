package com.shivam.practice.dsajava;

import java.util.Scanner;

public class wave {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                mat[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<r;i++)
        {
            if(i%2==0)
            {
                for(int j=0;j<c;j++)
                {
                    System.out.print(mat[j][i]);
                }
            }
            else{
                for(int j=c-1;j>=0;j--)
                {
                    System.out.print(mat[j][i]);
                }
            }

            System.out.println();

        }


    }
}
