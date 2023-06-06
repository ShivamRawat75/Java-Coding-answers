package com.shivam.practice.mayank;

import java.util.*;
import java.lang.*;
/* Name of the class has to be "Main" only if the class is public. */
class Codecheff
{
    public static void main (String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        HashSet<Integer>set=new HashSet<>();
        while(t>0)
        {
            set.clear();
            int n=sc.nextInt();
            int k=sc.nextInt();
            int[] a=new int[n];
            int[] b=new int[n];

            for(int i=0;i<n;i++)
            {
                a[i]=sc.nextInt();
            }
            for(int i=0;i<n;i++)
            {
                b[i]=sc.nextInt();
            }
            bubbleSort(b,a,n);
            int j=0;
            int ans=0;

            int idx=0;
            while(j<k && idx<n)
            {
                if(idx==0)
                {
                    ans+=b[idx];
                    set.add(a[idx]);
                    j++;
                    idx++;
                }
                else if(set.contains(a[idx]))
                {
                    idx++;
                }
                else{
                    ans+=b[idx];
                    set.add(a[idx]);
                    j++;
                    idx++;
                }
            }
            if(j<k)
                System.out.println(-1);
            else
                System.out.println(ans);


            t--;

        }
    }
    static void bubbleSort(int[] a,int[] b, int n)
    {
        int i, j, temp,temp2;
        boolean swapped;
        for (i = 0; i < n - 1; i++)
        {
            swapped = false;
            for (j = 0; j < n - i - 1; j++)
            {
                if (a[j] > a[j + 1])
                {
                    // swap arr[j] and arr[j+1]
                    temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                    swapped = true;

                    temp2 = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp2;
                }
            }

            // IF no two elements were
            // swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }
}
