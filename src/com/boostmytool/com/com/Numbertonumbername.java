package com.boostmytool.com.com;

import java.util.Scanner;


class Number {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = 0;
        int rem = 0;

        System.out.print("enter the number");
        number = sc.nextInt();
        int n = number;
        int reverse = 0;

        while (n > 0) {
            rem = n % 10;
            reverse = reverse * 10 + rem;
            n = n / 10;
        }
        while (reverse > 0) {
            rem = reverse % 10;

            reverse = reverse / 10;


            //  System.out.print(rem);


            if (rem == 0) {
                {
                    System.out.print("zero");
                }
            } else if (rem == 1) {
                System.out.print("one");
            } else if (rem == 2) {
                System.out.print("two");
            } else if (rem == 3) {
                System.out.print("three");
            } else if (rem == 4) {
                System.out.print("four");
            } else if (rem == 5) {
                System.out.print("five");
            } else if (rem == 6) {
                System.out.print("six");
            } else if (rem == 7) {
                System.out.print("seven");
            } else if (rem == 8) {
                System.out.print("eight");
            } else if (rem == 9) {
                System.out.print("nine");
            } else {
                System.out.print("enter wrong no.");
            }
        }

    }
}

