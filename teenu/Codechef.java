package com.shivam.practice.teenu;
import java.util.*;
class Codechef
{
    public static void main (String[] args)
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();


        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            int max=0;
            HashSet<Integer>set=new HashSet<>();
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
                set.add(arr[i]);
            }
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int i:arr)
            {
                if(!map.containsKey(i))
                {
                    map.put(i,1);
                }
                else if(map.containsKey(i))
                {
                    map.replace(i,map.get(i)+1);
                }
            }
            for(int i:arr)
            {
                if(map.get(i)>=max)
                    max=map.get(i);
            }

            int c=0;
            for(int i:set)
            {
                if(max==map.get(i))
                    c++;
            }
            if(c==1)
                System.out.println("YES");
            else
                System.out.println("NO");
            t--;
        }


    }
}
