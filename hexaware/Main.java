package com.shivam.practice.hexaware;

import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int arr1[]=new int[26];
        int arr2[]=new int [26];
        for(int i=0;i<s1.length();i++)
        {
            arr1[97-(int)(s1.charAt(i))]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            arr2[97-(int)(s2.charAt(i))]++;
        }
        for(int i=0;i<s2.length();i++)
        {
            char ch=(s2.charAt(i));
            arr2[97-(int)ch]++;
        }

    }
}
