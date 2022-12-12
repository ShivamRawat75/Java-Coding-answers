package com.shivam.practice.IBM;

import java.util.Scanner;
import java.util.StringTokenizer;

public class question2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        StringTokenizer str=new StringTokenizer(st);
        StringBuilder stb;
        stb= new StringBuilder(str.nextToken());
        System.out.print(stb.reverse());
        while (str.hasMoreTokens())
        {
            stb= new StringBuilder(str.nextToken());
            System.out.print(" "+stb.reverse());

        }
    }
}
