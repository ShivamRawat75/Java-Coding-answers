package com.shivam.practice.IBM;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String s=sc.nextLine();
        char a,b;
        int i=0;
        while(s.length()>1&&i!=s.length()-1)
        {
            a=s.charAt(i);
            b=s.charAt(i+1);

            if((a-'0')+(b-'0')==17)
            {
                s=s.substring(0,i)+s.substring(i+2);
                i=0;
            }
            else i++;
        }
        System.out.println(s);
        System.out.println(s.length());

    }


}
