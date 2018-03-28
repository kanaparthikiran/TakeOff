/**
 * 
 */
package com.datastructures.dynamicprogramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kkanaparthi
 *
 */
public class FibonacciNumberDynamic {

//0 1 1

	/**
	 * 
	 * @param n
	 */
	private void printFibonacciIterative(int n) {
		int a =0, b=0;
		int c = 1;
			//a = 0;
			b = 1;
		System.out.print(" " +a+ "  "+b);

		for(int i=2;i<10;i++) {
			int temp = c;
			c= c+b;
			b = temp;
			System.out.print("  "+c);
		}
	}
	
	
	
	private void fiboIterative(int n) {
		int a=0,b=1;
		
		System.out.print(" "+a+" "+b);
		
		for(int i=2;i<n;i++) {
			int c  = a+b;
			a = b;
			b = c;
			System.out.print(" "+c);
		}
		
	}
	/**
	 * 
	 * @param n
	 */
	private int printFibonacciRecursive(int n) {
		if(n==0 || n==1) {
			return n;
		} else {
			return printFibonacciRecursive(n-1)+printFibonacciRecursive(n-2);
		}
	}
	
	public int fibonacciRecursive(int n) {
		if(n <= 1) {
			return n;
		}
		return fibonacciRecursive(n-1) + fibonacciRecursive(n-2);
	}
	
	/**
	 * 
	 * @param n
	 * @param computedValues
	 * @return
	 */
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
	 * @param n
	 * @param computedValues
	 * @return
	 */
	private int printFiboRecursion(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		
		int fibo = printFiboRecursion(n-1)+ printFiboRecursion(n-2);
		return fibo;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		FibonacciNumberDynamic fibonacciNumberDynamic = new FibonacciNumberDynamic();
		
		System.out.println(" Started Fibonacci Iterative Method ");
		
		int n = 50;
		
		fibonacciNumberDynamic.fiboIterative(10);
		
		System.out.println("\n Printed Fibo numbers ");
		
		fibonacciNumberDynamic.printFibonacciIterative(n);
		
		long startTime = System.currentTimeMillis();
		
		System.out.println("\n Started Fibonacci Recursive Method ");
		Map<Integer,Integer> mapValues = new HashMap<>();
		for(int i=0;i<n;i++) {
			System.out.print(" "+fibonacciNumberDynamic.printFiboRecursion(i));
		}
		
		long endTime = System.currentTimeMillis();

		System.out.println("\n\n Total time taken for the process to complete is "
				+ ((endTime-startTime))+" milli seconds ");
		
		long startTimeDynamic = System.currentTimeMillis();
		
		for(int i=0;i<n;i++) {
			System.out.print(" "+fibonacciNumberDynamic.
					printFiboRecursionDynamic(i,mapValues));
		}
		
		ArrayList al = new ArrayList<>();

		long endTimeDynamic = System.currentTimeMillis();

		System.out.println("\n\n Total time taken for the process "
				+ " using Dynamic Programming -> to complete is "
				+ ((endTimeDynamic-startTimeDynamic))+" milli seconds ");
		

	}

}
