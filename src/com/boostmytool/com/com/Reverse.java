package com.boostmytool.com.com;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
        int a[] = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.println("enter elemrnts ");


        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println(" elemrnts ");


        for (int i = 0; i < a.length; i++) {
            System.out.println(+a[i]);
        }
        System.out.println(" reverse elemrnts ");
        for (int i = a.length - 1; i >= 0; i--) {
            System.out.print(+a[i]+" ");
        }

    }
}
