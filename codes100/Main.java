package com.shivam.practice.codes100;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();

        int arr1[]=new int[n];
        int arr2[]=new int[m];

        for(int i=0;i<n;i++)  //intput array 1
        {
            arr1[i]= sc.nextInt();
        }
        for(int i=0;i<m;i++)   //input array2
        {
            arr2[i]= sc.nextInt();
        }

        int even1=0,even2=0,odd1=0,odd2=0;

        for(int i=0;i<n;i++)  //count even in array1
        {
            if(arr1[i]%2==0)
                even1++;
        }
        for(int i=0;i<m;i++)  //count even in array2
        {
            if(arr2[i]%2==0)
                even2++;
        }
        odd1=n-even1;  // calculatin odd in array1
        odd2=m-even2;  // calculatin odd in array2

        int ans=(even1*odd2)+(even2*odd1);

        System.out.println(ans);

    }
}
