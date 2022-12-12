package com.shivam.practice.teenu;

import java.util.Scanner;

public class count_specific_no_problem {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int c=0;
        for(int i=m;i<=n;i++)
        {
            int k=check(i);
//            if(k==1)
//            {
//                System.out.print(i+" ");
//            }
            c+=k;
        }
        System.out.println(c);
    }

    private static int check(int i) {
        while(i>0)
        {
            if(i%10==1||i%10==4||i%10==9)
                i=i/10;
            else
                return 0;
        }
        return 1;
    }

}
