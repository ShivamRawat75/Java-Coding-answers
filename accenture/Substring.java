package com.shivam.practice.accenture;

import java.util.Scanner;

public class Substring {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        print_subset(st,"");
    }

    private static void print_subset(String p,String up) {

        if(p.length()==0)
        {
            System.out.println(up);
            return;
        }

        char ch=p.charAt(0);
        print_subset(p.substring(1),up+ch);
        print_subset(p.substring(1),up);

    }
}
