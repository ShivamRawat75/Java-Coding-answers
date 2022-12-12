package com.shivam.practice.Infosys;

import java.util.HashMap;
import java.util.Scanner;

public class Solution4 {


    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        HashMap<Character,Integer> map=new HashMap<>();
        int index=-1;
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(map.containsKey(ch))
            {
                int temp=map.get(ch);
                map.replace(ch,temp,temp+1);

            }
            else{
                map.put(ch,1);

            }
        }
        for(int i=0;i<st.length();i++)
        {
            char ch=st.charAt(i);
            if(map.get(ch)==1)
            {
                index = i + 1;
                break;
            }
        }
        System.out.println(index);
    }
}
