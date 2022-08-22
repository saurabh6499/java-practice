package com.boostmytool.com.com;
import java.util.Scanner;
public class Ascending {

    public static void main(String[] args) {
        int a[] = new int[5];
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the array");
        for (int i = 0; i<5; i++)
        {
            a[i] = sc.nextInt();
        }
            for ( int i = 0; i<5; i++) {
                for (int j = i + 1; j<5; j++) {

                    if (a[i] > a[j]) {
                        n = a[i];
                        a[i] = a[j];
                        a[j] = n;
                    }
                }
            }

            System.out.println("sorted array");
            for (int i = 0; i < 5; i++) {
                System.out.println(a[i]+" ");
            }
        }
        }



