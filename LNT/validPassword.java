package com.shivam.practice.LNT;

import java.util.HashSet;
import java.util.Scanner;

public class validPassword {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        if(st.length()<8)
        {
            System.out.println("Invalid");
            return;
        }
        HashSet<Character> set=new HashSet<>();
        int s=0,l=0,d=0,m=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            set.add(ch);
        }
        for(int i=65;i<=90;i++)
        {
            if(set.contains((char)i))
            {
                l=1;
                break;
            }
        }
        for(int i=97;i<=122;i++)
        {
            if(set.contains((char)i))
            {
                s=1;
                break;
            }
        }
        for(int i=48;i<=57;i++)
        {
            if(set.contains((char)i))
            {
                d=1;
                break;
            }
        }
        if(st.contains("_")||st.contains("@")||st.contains("$"))
        {
            m=1;
        }
        if(s==1&&d==1&&l==1&&m==1)
        {
            System.out.println("valid");
        }
        else{
            System.out.println("Invalid");
        }

    }
}
