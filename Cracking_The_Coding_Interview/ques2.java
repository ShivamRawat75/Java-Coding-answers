package com.shivam.practice.Cracking_The_Coding_Interview;

import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

// check if wo given string is permutation of one another
public class ques2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();

        if(s1.length()!=s2.length())
        {
            System.out.println("false");
            return;

        }
        System.out.println(ispermu(s1,s2));
    }
    static boolean ispermu(String s1,String s2)
    {
        if(sort(s1).equals(sort(s2)))
            return true;
        return false;

    }
    static String sort(String s)
    {
        char[] st=s.toCharArray();
        Arrays.sort(st);

        return Arrays.toString(st);
    }
}
