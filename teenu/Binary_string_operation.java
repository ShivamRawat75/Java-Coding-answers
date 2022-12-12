package com.shivam.practice.teenu;

import java.util.Scanner;

public class Binary_string_operation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            String st=sc.next();
            int ans=st.charAt(0)-'0';
            for(int i=1;i<st.length()-1;i+=2)
            {
                char ch=st.charAt(i);
                int b=st.charAt(i+1)-'0';

                if(ch=='A')
                {
                    ans=ans&b;
                }
                else if(ch=='B')
                {
                    ans=ans|b;
                }
                else if(ch=='C')
                {
                    ans=ans^b;
                }
            }
            System.out.println(ans);
            t--;
        }


    }
}
