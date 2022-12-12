package com.shivam.practice.Infosys;

import java.util.Arrays;
import java.util.Scanner;

public class Solution2 {
    static String st;
    static int cash;
    static int flip;
    static int swap;

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        st=sc.nextLine();
        cash=sc.nextInt();
        swap=sc.nextInt();
        flip=sc.nextInt();


        char[] arr =st.toCharArray();

        if(flip<=swap)
        {
            Flip(arr);
            Swap(arr);
        }
        else {
            Swap(arr);
            Flip(arr);
        }
        System.out.println(binToDecimal(arr));
        //System.out.println(n);

    }

    private static int binToDecimal(char[] arr) {
        int l=arr.length-1;
        int j=0;
        int sum=0;
        for(int i=l;i>=0;i--){
            sum+=Character.getNumericValue(arr[i])*Math.pow(2,j);
            j++;
        }
        return sum;
    }

    private static void Swap(char[] arr) {
        int i = 0;
        for(int a=0;a< arr.length;a++)
        {
            if(arr[a]=='1'){
                i=a;
                break;
            }

        }
        int j=arr.length-1;
        while(j>i)
        {
            if(cash<swap)
            {
                break;
            }
            if (arr[j]=='0')
            {
                if(arr[i]=='0')
                    i++;
                else{
                    swap_digi(arr,i,j);
                    cash-=swap;
                    j--;
                }
            }
            else
                j--;
        }

    }

    private static void swap_digi(char[] arr, int i, int j) {
        char temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

    private static void Flip(char[] arr) {
        int i=0;
        for(int a=0;a<arr.length;a++)
        {
            if(arr[a]=='1')
            {
                i=a;
                break;
            }
        }
        while(cash>=flip)
        {
            if(i>=arr.length)
                break;

            if(arr[i]=='1')
            {
                arr[i]='0';
                cash-=flip;
                i++;
            }
            else{
                i++;
            }
        }
        System.out.println(arr);
    }

}
