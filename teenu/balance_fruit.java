package com.shivam.practice.teenu;

import java.util.Scanner;

public class balance_fruit {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int m=sc.nextInt();
        int rs= sc.nextInt();
        if(a>m)
            System.out.println(rs-(a-m));
        else if(a<m)
            System.out.println(rs+(m-a));
        else
            System.out.println(rs);
    }
}
