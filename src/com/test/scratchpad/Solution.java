/**
 * 
 */
package com.test.scratchpad;

import java.util.Arrays;
import java.util.Map;

public class Solution {
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	public int factorialRecursive(int n) {
		if(n<=0) {
			return 1;
		} else {
			return n*factorialRecursive(n-1);
		}
	}
	
	public int factorialIterative(int n) {
		int factorialResult = 1;
		for(int i=1;i<n;i++) {
			factorialResult *= i;
		}
		return factorialResult;
	}

	
	/**
	 * 
	 * @param n
	 */
	public void fibonacciNumbers(int n) {
		int  a = 0;
		int b = 1;
		System.out.print(a+" "+b+" ");
		for(int i=2;i<n;i++) {
			int c = a+b;
			System.out.print(c+" ");
			a = b;
			b = c;
		}
	}
	
	
	public int fibonacciRecursive(int n) {
		int nthFiboNumber = 0;
		if(n<=1) {
			return 1;
		} else {
			nthFiboNumber =
					fibonacciRecursive(n-1)+fibonacciRecursive(n-2);			
		}
		return nthFiboNumber;
	}
	
    	
	public int fiboRecursiveDynamicProgramming(int n,int[] buffer) {
		if(n<=1) {
			return n;
		}
		if(buffer[n]==0) {
			buffer[n] = fiboRecursiveDynamicProgramming(n-1, buffer)+
					fiboRecursiveDynamicProgramming(n-2, buffer);
		}
		return buffer[n];
	}
	
	private int printFiboRecursionDynamic(int n,
			Map<Integer,Integer> computedValues) {
		
		if(computedValues!=null) {
			if(computedValues.containsKey(n)) {
				return computedValues.get(n);
			}
		}
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		int fibo = printFiboRecursionDynamic(n-1,computedValues)+ 
				printFiboRecursionDynamic(n-2,computedValues);
		if(computedValues!=null) {
			computedValues.put(n, fibo);
		}
		return fibo;
	}
	
	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		Solution solution = 
				new Solution();
		int factorialResult  =
				 solution.factorialIterative(6);
		System.out.println(" The factorial of the "
				+ " given number is "+factorialResult);
		solution.fibonacciNumbers(10);
		
		int fibonacciLimit = 40;
//		System.out.print("\n"+0+" "+1+" ");
		for(int i=0;i<fibonacciLimit;i++) {
			int fiboNumber = solution.fibonacciRecursive(i);
			System.out.print(fiboNumber+" ");
		}
		
		int[] buffer = new int[fibonacciLimit+1];
		System.out.println(" now \n\n ");
		for(int i=0;i<fibonacciLimit;i++) {
			int fiboNumberDynamic = solution.
					fiboRecursiveDynamicProgramming(i, buffer);
			System.out.print(fiboNumberDynamic+" ");
		}
		
		
	}
	
}
