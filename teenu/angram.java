package com.shivam.practice.teenu;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class angram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String st1 = sc.nextLine();
        String st2 = sc.nextLine();

        int n = findAnagram(st1, st2);
        System.out.println(n);
    }

    private static int findAnagram(String st1, String st2) {


        int sum = 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<st2.length();i++)
        {
            char ch=st2.charAt(i);
            if(map.containsKey(ch))
            {
                map.replace(ch,map.get(ch)+1);
            }
            else
            {
                map.put(ch,1);
            }
        }
        for(int i=0;i<st1.length();i++)
        {
            char ch=st1.charAt(i);
            if(map.containsKey(ch))
            {
                if(map.get(ch)==1)
                    map.remove(ch);
                else if (map.get(ch)>1)
                {
                    map.replace(ch,map.get(ch)-1);
                }
            }
            else if(!map.containsKey(ch))
                sum+=1;
        }
        for(int i=0;i<st2.length();i++) {
            char ch = st2.charAt(i);
            if(map.containsKey(ch))
            {
                sum+=map.get(ch);
                map.remove(ch);
            }
        }


        return sum;

    }
}
