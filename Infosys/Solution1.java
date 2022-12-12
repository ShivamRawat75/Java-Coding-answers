package com.shivam.practice.Infosys;

import java.util.Scanner;

public class Solution1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=34430;
        int base=2;

        while(convert(m,base)!=1)
        {
            base++;
        }
        System.out.println(base);
    }

    private static int convert(int m, int base) {

        int rem=m%base;
        m=m/base;
        while(m>base)
        {
            if (m%base!=rem)
            {
                return 0;
            }
            m=m/base;
        }
        if(m==rem)
            return 1;

        return 0;
    }
}
