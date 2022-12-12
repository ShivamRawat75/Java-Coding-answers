package com.shivam.practice.accenture;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class codecheff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            HashMap<Integer,Integer> map=new HashMap<>();
            HashSet<Integer>set=new HashSet<>();
            int ans=0;
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
                set.add(arr[i]);
            }
            for(int i:arr)
            {
                if(!map.containsKey(i))
                {
                    map.put(i,1);
                }
                else
                    map.replace(i, map.get(i)+1);
            }
            //System.out.println(map);
            int max=Integer.MIN_VALUE;

            for(int i:set)
            {
                int a=map.get(i);
                if(max<=a)
                {
                    max=a;
                }
            }
            //System.out.println(max);
            int f=0;
            for(int i:set)
            {
                int a=map.get(i);
                if(a==max &&f==0)
                {
                    f=1;
                } else if (a!=max) {
                    ans+=a;
                } else if (a==max &&f==1) {
                    ans+=a;

                }
            }
            if(max==1)
                System.out.println(n-1);
            else
            System.out.println(ans);



            t--;

        }
    }
}
