package com.shivam.practice.DP;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();

        while(t>0)
        {
            float hr=sc.nextFloat();
            float extra= sc.nextFloat();

            float ans;
            if(hr<=40)
            {
                ans=20*hr;
            }
            else
            {
                ans=(40*20)+(hr-40)*(20+extra);


            }
            System.out.println(ans);
            t--;


        }

    }

}
