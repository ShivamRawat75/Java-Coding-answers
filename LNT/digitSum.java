package com.shivam.practice.LNT;

import java.util.Scanner;

public class digitSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String temp="";
        int sum=0;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);

            if(Character.isDigit(ch))
            {
                temp+=ch;
            }
            else
            {
                sum+=Integer.parseInt(temp);

                temp="0";
            }
        }
        System.out.println(sum+Integer.parseInt(temp));

    }
}
