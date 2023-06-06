package com.shivam.practice.deloite;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String st=sc.nextLine();

        resultantString(st);


    }



    private static void resultantString(String st) {

        int n=Integer.parseInt(st);

        HashMap<Integer,Character>map=new HashMap<>();
        int a[]={1,2,3,4,5,6,7,8,9};
        char b[]={'A','B','C','D','E','F','G','H','I'};

        for(int i=0;i<9;i++)
        {
            map.put(a[i],b[i]);
        }
        String ans="";
        while(n>0)
        {
            int r=n%10;
            ans+=map.get(r);
            n/=10;
        }

        char arr[]=ans.toCharArray();
        Arrays.sort(arr);
        System.out.println(arr);

    }
}
