package com.shivam.practice.Cracking_The_Coding_Interview;

import java.util.Arrays;
import java.util.Scanner;

// check if string contain all distinct character
public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        System.out.println(check(st));

    }
    static boolean check(String st)
    {
        boolean[] arr=new boolean[128];
        Arrays.fill(arr,false);

        for(int i=0;i<st.length();i++)
        {
            char val=st.charAt(i);
            if(arr[val])
                return false;
            else
                arr[val]=true;
        }
        return true;
    }
}
