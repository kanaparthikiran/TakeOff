/**
 * 
 */
package com.test.core;

/**
 * @author kkanaparthi
 *
 */
public class FibonacciRecursion {

	/**
	 * 
	 */
	public FibonacciRecursion() {
		
	}
	
	/**
	 * This method prints the values of Fibonacci series 
	 * recursively
	 */
	private int printFiboRecursion(int n) {
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}
		return printFiboRecursion(n-1)+ printFiboRecursion(n-2);
		
	}
	
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
//		FibonacciRecursion fibonacciRecursion = new FibonacciRecursion();
//		int fibValue = fibonacciRecursion.printFiboRecursion(5);
//		System.out.println(" fibValue "+fibValue);
//		
//		for(int i=0;i<10;i++) {
//			System.out.print(printFibonacci(i)+"  ");
//		}
		
		 //  (a) -> System.out.println("Hello World");

	    int n = 100;
	    long startTime = System.currentTimeMillis();
	    System.out.println(fib(n));
		long endTime = System.currentTimeMillis();
		System.out.println(" Total Time Taken in the Recursive method "
				+ (endTime-startTime)+" milli seconds ");

	}

	static int fib(int n)
    {
    if (n <= 1)
       return n;
    return fib(n-1) + fib(n-2);
    }
	
	
	private static int  printFibonacci(int maxNum) {
		int fibonacci = 0;
		if(maxNum<2) {
			//System.out.print(1+" "+1);
			return 1;
		} else  {
			fibonacci = printFibonacci(maxNum-1)+printFibonacci(maxNum-2);
			return fibonacci;
		
		}
	}
}
