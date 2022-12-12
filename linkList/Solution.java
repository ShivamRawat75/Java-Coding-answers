package com.shivam.practice.linkList;
import java.util.*;
public class Solution {
    public static void main(String[] args) {
       // permu("", "abc");

        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        String patern= sc.nextLine();
        int c=0;


        ArrayList<String> list=new ArrayList<>();
        list=permu2("",st);

        for(String e:list)
        {
            if(e.contains(patern))
                c++;
        }
        System.out.println(c);


        //System.out.println(list);

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
