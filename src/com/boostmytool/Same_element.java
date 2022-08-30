package com.boostmytool;

 class Element {
     public static void main(String[] args) {
         int[] arr1 = {1,2,3,};
         int[] arr2 = {1,2,3,4,5,6, 7, 8,};
         int i=0;
         int j=0;

         while(j<arr2.length) {
             if (i < arr1.length && arr1[i] == arr2[j] && j < arr2.length)
             {
                 i++;
                 j++;

                 continue;

             }
             else{
                 System.out.println(arr2[j]);
                 j++;
             }
         }
     }
 }