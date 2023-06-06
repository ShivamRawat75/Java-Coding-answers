package com.shivam.practice.deloite;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

class Main
{
    public static void main(String[] args) {
        String st="Quescol";

        String ans=removeVowel(st);
        System.out.println(ans);

        float arr[]={14,12,70,15,99,65,21,90};

     //   System.out.println(calculateMaxProfit(arr));
    }
    public static float calculateMaxProfit(float arr[])
    {
        float max[]={Float.MIN_VALUE};
        float min[]={Float.MAX_VALUE};

        for(float e:arr)
        {
            if(max[0]<=e)
                max[0]=e;

            if(min[0]>=e)
                min[0]=e;
        }
        float ans=max[0]-min[0];



        return ans;


    }
    public static String removeVowel(String s)
    {
        HashSet<Character> set=new HashSet<>();
        char arr[]={'a','e','i','o','u','A','E','I','O','U'};

        for(char i:arr)
        {
            set.add(i);
        }
        String ans="";

        for(int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if(!set.contains(ch))
                ans+=ch;
        }
        return ans;
    }
}
