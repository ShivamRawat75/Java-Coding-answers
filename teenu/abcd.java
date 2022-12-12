package com.shivam.practice.teenu;

import java.util.Scanner;

public class abcd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String st2="";
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(ch>=97&&ch<=122)
                st2+=(int)(ch-'a')+1;   //  g-a+1=> 103-97+1
            else if(ch>=65&&ch<=90)
                st2+=(int)(ch-'A')+1;
            else
                st2+=ch;
        }
        System.out.println(st2);
    }
}
