/**
 * 
 */
package com.test.scratchpad;

import java.util.Arrays;
import java.util.Map;

//Optimized Java program to find last 
//digit of n'th Fibonacci number
class Solution
{
 // Filongs f[] with first 
 // 60 Fibonacci numbers
 void fib(int f[])
 {
     // 0th and 1st number of 
     // the series are 0 and 1
     f[0] = 0;
     f[1] = 1;

     // Add the previous 2 numbers 
     // in the series and store 
     // last digit of result 
     for (int i = 2; i <= 59; i++)
         f[i] = (f[i - 1] + f[i - 2]) % 10;
 }

 // Returns last digit of n'th Fibonacci Number
 int findLastDigit(long n)
 {
     // In Java, values are 0 by default
     int f[] = new int[60];

     // Precomputing units digit of 
     // first 60 Fibonacci numbers
     fib(f);
  
     int index = (int)(n % 60L); 

     return f[index];
 }

 
 // Driver code
 public static void main(String[] args)
 {
     long n;
     Solution ob = new Solution();
     n = 1;
     System.out.println(ob.findLastDigit(n));
     n = 61;
     System.out.println(ob.findLastDigit(n));
     n = 7;
     System.out.println(ob.findLastDigit(n));
     n = 67;
     System.out.println(ob.findLastDigit(n));
 }
}
