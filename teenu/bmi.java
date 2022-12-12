package com.shivam.practice.teenu;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int w=sc.nextInt();
        float h=sc.nextFloat();
        float ans=getBmi(w,h);
        System.out.println(ans);
        if(ans<18)
            System.out.println(0);
        else if(ans<25)
            System.out.println(1);
        else if(ans<30)
            System.out.println(2);
        else if(ans<40)
            System.out.println(3);
        else
            System.out.println(4);

    }
    public static float getBmi(int w,float h)
    {
        return w/((float)h*h);
    }
}
