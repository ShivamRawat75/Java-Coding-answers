package com.shivam.practice.mayank;
import java.util.*;
public class Codecheff {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int f=0;
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
            if(arr[i]%k==0)
                f=1;
        }

        if(f==0)
        {
            for(int i=0;i<n;i++)
            {
                if(k%arr[i]==0)
                {
                    k=k/arr[i];
                }

                if(k==1)
                {
                    f=1;
                    break;
                }
            }
        }
        if(f==1)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}
