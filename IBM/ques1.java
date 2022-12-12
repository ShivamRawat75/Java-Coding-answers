package com.shivam.practice.IBM;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ques1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=8;
        int[] arr={550,67,45,820,717,3,90,636};
//        for(int i=0;i<n;i++)
//        {
//            arr[i]=sc.nextInt();
//        }
        int pos=2;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++)
        {
            int a=(int)Math.log10(arr[i]);
            if(a+1==3)
            {
                list.add(arr[i]);
            }
        }
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list.get(pos-1));
    }
}
