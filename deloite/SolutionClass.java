package com.shivam.practice.deloite;

import java.util.HashSet;
import java.util.Scanner;

public class SolutionClass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int T=sc.nextInt();

        T=T/2;

        while(T>0) {

            String s = sc.nextLine();
            String t = sc.nextLine();
            HashSet<Character> a = new HashSet<>();
            HashSet<Character> b = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                a.add(s.charAt(i));
            }
            for (int i = 0; i < t.length(); i++) {
                b.add(t.charAt(i));
            }
            if (a.size() == b.size() && a.size() == 1) {
                if (s.charAt(0) == t.charAt(0))
                    System.out.println("No");
            } else
                System.out.println("Yes");

            T--;
        }
    }
}
