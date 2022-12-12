package com.shivam.practice.teenu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class wow {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        HashSet<Integer>set=new HashSet<>();
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i:arr)
        {
            set.add(i);
            if(map.containsKey(i))
            {
                map.replace(i, map.get(i)+1);
            }
            else
            {
                map.put(i,1);
            }

        }
        int ctr=0;
        for(int i:set)
        {
            int a=map.get(i);
            if(a%3==0)
                ctr+=a/3;
            else if(a%2==0)
                ctr+=a/2;
            else if (a%2!=0 || a%3!=0) {
                ctr=-1;
                break;
            }
        }
        System.out.println(ctr);
    }
}
