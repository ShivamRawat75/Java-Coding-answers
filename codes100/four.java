package com.shivam.practice.codes100;

import java.util.ArrayList;
import java.util.Scanner;

public class four {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        if(x%2==0)
        System.out.println("even");
        else
            System.out.println("odd");
        ArrayList list=new ArrayList<>();
        list.add("alice");
        list.add("bob");
        list.add(1,"mike");
        list.add(3,"tara");
        list.remove(-1);

        System.out.println(list);
    }

}
