package com.shivam.practice.teenu;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class subset_prob {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st=sc.nextLine();
        HashSet<String> set=new HashSet<>();
        ArrayList<String> list=new ArrayList<>();

        substr(st,"",set);
        for(String s:set)
        {
            if(!s.contains("a")||!s.contains("b")|| !s.contains("c"))
            {
                System.out.println(s);
            }
        }
        list.addAll(substr(st,""));
        System.out.println(list);
    }

    private static ArrayList<String> substr(String st, String s) {

        ArrayList<String> list=new ArrayList<>();
        if(st.length()==0)
        {
            list.add(s);

            return list;
        }
        list.addAll(substr(st.substring(1),s+st.charAt(0)));
        list.addAll(substr(st.substring(1),s));

        return list;
    }

    private static void substr(String up, String p, HashSet<String> set) {

        if(up.length()==0)
        {
            set.add(p);
            return;
        }
        substr(up.substring(1),p+up.charAt(0), set);
        substr(up.substring(1),p, set);
    }

}
