package com.boostmytool.com.com;
import java.util.Scanner;
public class Table {
    public static void main(String[] args)
    {
    int i;
   // int t=1;
    int number;
        System.out.println("enter the number");
    Scanner sc = new Scanner(System.in);
    number=sc.nextInt();

        for(i =1;i<=10;i++)


            System.out.println(number+"*"+i+"="+number*i);
}
}