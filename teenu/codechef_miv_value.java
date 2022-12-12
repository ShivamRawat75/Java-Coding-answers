package com.shivam.practice.teenu;


import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef_miv_value
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t>0)
        {
            int n=sc.nextInt();
            int arr[]=new int[n];
            for(int i=0;i<n;i++)
            {
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);
            for(int i=n-1;i>0;i--)
            {
                arr[i]=findGCD(arr[i],arr[i-1]);
            }
            int sum=0;
            for(int i=0;i<n;i++)
            {
                sum+=arr[i];
            }
            System.out.println(sum);
            t--;

        }
    }
    public static int findGCD(int a, int b)
    {
        if (b == 0)
            return a;
        return findGCD(b, a % b);
    }
}