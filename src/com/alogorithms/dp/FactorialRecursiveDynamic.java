/**
 * 
 */
package com.alogorithms.dp;

import java.math.BigInteger;

/**
 * @author Kiran Kanaparthi
 *
 */
public class FactorialRecursiveDynamic {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FactorialRecursiveDynamic factorialRecursiveDynamic = 
				new FactorialRecursiveDynamic();
		long startTimeRecursive  = System.currentTimeMillis();
		int factResult = factorialRecursiveDynamic.factorialRecursive(10);
		long endTimeRecursive  = System.currentTimeMillis();
		System.out.println(" Factorial Result is  "+ factResult
				+" \n  Total time taken is"
				+ " "+(endTimeRecursive-startTimeRecursive)
				+" milli seconds ");

		long startTimeIterative  = System.currentTimeMillis();
		BigInteger factResultIterative = factorialRecursiveDynamic.
				factorialIterative(10);
		long endTimeIterative  = System.currentTimeMillis();
		System.out.println(" Factorial factResultIterative is  "
		+ factResultIterative+" \n  Total time taken is"
				+ " "+(endTimeIterative-startTimeIterative)+" milli seconds ");
		int n=10;
		int[] cacheArray = new int[n+1];
		int dynamicFactorial = factorialDynamicProgramming(n, cacheArray);
		System.out.println(" dynamicFactorial "+dynamicFactorial );
		System.out.println(" Recursive factorial is :" +
				printRecursiveFact(100l,new long[101]));
	}
	
	
	 static int factorialDynamicProgramming(int n,int[] cacheArray) {
	        if(n<=1) {
	            return 1;
	        } else {
	            System.out.println(" n "+n);
	            if(cacheArray[n]==0) {
	                cacheArray[n] = 
	                		n*factorialDynamicProgramming(n-1,cacheArray);
	                System.out.println(" cacheArray[n]  calculated as "+
	                		cacheArray[n] );
	            }
	            return cacheArray[n];
	        }
	    }
	 
	 
	 
	 private static long printRecursiveFact(long n,long[] cacheArray) {
	        if(n<=1) {
	            return 1;
	        } else {
	            System.out.println(" n "+n);
	            if(cacheArray[(int) n]==0) {
	                cacheArray[(int) n] = n*printRecursiveFact(n-1,cacheArray);
	                System.out.println(" cacheArray[n]  calculated as "+
	                		cacheArray[(int) n] );
	            }
	            return cacheArray[(int) n];
	        }
	 }
	 
	/**
	 * 
	 * @param n
	 * @return
	 */
	private int factorialRecursive(int n) {
		if(n<=1) {
			return n;
		} else {
			return n*factorialRecursive(n-1);
		}
	}
	
	
	
	/**
	 * 
	 * @param n
	 * @return
	 */
	private BigInteger factorialIterative(int n) {
		BigInteger fact = new BigInteger("1");
		for(int i=1;i<=n;i++) {
			fact = fact.multiply
					(new BigInteger(String.valueOf(i)));
		}
		return fact;
	}
	

}
