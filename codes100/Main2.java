package com.shivam.practice.codes100;

import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        char a=sc.next().charAt(0);
        char b=sc.next().charAt(0);
        int n=sc.nextInt();

        generate("","",n/2,a,b);

    }



    private static void generate(String s, String s1, int n, char a, char b) {

        if(s.length()==n)
        {
            if(sun(Integer.parseInt(s))==sun(Integer.parseInt(s1)))
            {
                System.out.println(s+s1);
                return;
            }
            return;


        }
        generate(s+a,s1+a,n,a,b);
        generate(s+b,s1+b,n,a,b);
        generate(s+a,s1+b,n,a,b);
        generate(s+b,s1+a,n,a,b);



    }

    private static int sun(int n) {
        int ans=0;
        while(n>0)
        {
            int r=n%10;
            ans+=r;
            n=n/10;
        }
        return ans;
    }
}
