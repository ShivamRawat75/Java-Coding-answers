package com.shivam.practice.teenu;
import java.util.*;
public class codechef2 {
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner (System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n-1];
            int target[]=new int[n-1];
            int sum=0,a=0,b=0;
            for(int i=0;i<n-1;i++)
            {
                arr[i]=sc.nextInt();
                sum+=arr[i];
                target[i]=sum;
            }
            int i=0;
            while(a!=target[n-2])
            {
                if(a==0)
                {
                    a+=arr[i];
                }
                else if(a==target[i-1])
                {
                    a+=arr[i];
                    b+=arr[i-1];

                }
                i++;

            }
            System.out.println(target[n-2]+target[n-2]-b);
            t--;
        }
    }
}


