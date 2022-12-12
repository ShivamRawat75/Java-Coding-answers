package com.shivam.practice.Infosys;

public class Main {
    public static void main(String[] args) {

    }
    public static int soldier(int num,int soldierPosition[][],int posSoldier)
    {
        int arr[]=new int[num+1];
        for(int i=0;i<=num;i++)
        {
            arr[i]=i;
        }
        for(int i=0;i< soldierPosition.length;i++)
        {
            int a=soldierPosition[i][0];
            int b=soldierPosition[i][1];

            int temp=arr[a];
            arr[a]=arr[b];
            arr[b]=temp;
        }
        return arr[posSoldier];
    }
}
