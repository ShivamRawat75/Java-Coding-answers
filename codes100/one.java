package com.shivam.practice.codes100;
import java.util.*;
public class one {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char ch=sc.next().charAt(0);
        char arr[]={'A','E','I','O','U'};

        HashSet<Character>set= new HashSet<>();

        for(char i:arr)
        {
            set.add(i);
        }
        ch=Character.toUpperCase(ch);
        if(Character.isLetter(ch))
        {
            if(set.contains(ch))
                System.out.println("Vowle");
            else
                System.out.println("Consonent");
        }else
        {
            System.out.println("Invalid input");
        }


        sc.close();
    }
}
