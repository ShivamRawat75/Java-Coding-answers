package com.shivam.practice.teenu;

import java.util.*;

public class easyPermu {
    public static void main(String[] args) {
        // your code goes here
            Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                int j = n;
                int k = 1;
                for (int i = 0; i < n; i++) {
                    arr[i] = i + j;
                    i++;
                    j--;
                }
                int lcm = arr[0];
                for (int i = 1; i < n; i++) {
                    if (arr[i] % lcm == 0) {
                        lcm = Math.max(lcm, arr[i]);
                    } else {
                        lcm = lcm * arr[i];
                    }

                }
                System.out.println(lcm);
                t--;
            }
        }
    }

