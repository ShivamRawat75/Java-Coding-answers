package com.shivam.practice.teenu;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class count_factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        int l=st.length();
        int ans;

        HashMap<Character,Integer> map=new HashMap<>();
        HashSet<Character> set=new HashSet<>();

        for(int i=0;i<l;i++)
        {
            char ch=st.charAt(i);
            set.add(ch);

            if(!map.containsKey(ch))
            {
                map.put(ch,1);

            }
            else
                map.replace(ch,map.get(ch)+1);
        }
        ans=fact(l);
        for(char ch:set)
        {
            ans/=fact(map.get(ch));
        }
        System.out.println(ans);
    }

    private static int fact(int l) {
        int fact=1;
        for(int i=1;i<=l;i++)
        {
            fact*=i;
        }
        return fact;
    }
}
