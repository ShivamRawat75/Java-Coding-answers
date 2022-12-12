package com.shivam.practice.linkList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr =new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        String st= Arrays.toString(arr);
        ArrayList<String> list;
        list=permu2("",st);
        String small=st;
        for(String e:list){
            if(small.compareTo(e)>0)
                small=e;
        }
        System.out.println(small);
    }
    static ArrayList<String> permu2(String p, String up){
        if(up.isEmpty())
        {

            ArrayList<String> list=new ArrayList<>();
            list.add(p);
            return list;
        }
        char ch=up.charAt(0);

        ArrayList<String> ans=new ArrayList<>();
        for(int i=0;i<=p.length();i++)
        {
            String f=p.substring(0,i);
            String l=p.substring(i,p.length());
            ans.addAll(permu2(f+ch+l, up.substring(1)));
        }
        return ans;
    }
}
