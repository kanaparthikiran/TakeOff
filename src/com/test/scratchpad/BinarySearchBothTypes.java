/**
 * 
 */
package com.test.scratchpad;

/**
 * @author Kiran Kanaparthi
 *
 */
public class BinarySearchBothTypes {

	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int binarySearchRecursive(int [] elements,int searchElement,int start,int end) {
		if(elements!=null && elements.length>0) {
			int middle = start+(end-start)/2;
			if(searchElement==elements[middle]) {
				return middle;
			} else if(elements[middle]>searchElement) {
				return binarySearchRecursive(elements, searchElement, start, middle-1);
			} else if(elements[middle]<searchElement) {
				return binarySearchRecursive(elements, searchElement, middle+1, end);
			} else {
				return -1;
			}
		}
		return -1;
	}
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int binarySearchIterative(int [] elements,
				int searchElement,int start,int end) {
		int elementIndex = -1;
		if(elements!=null && elements.length>0) {
			while(start<=end) {
				int middle = start+(end-start)/2;
				if(elements[middle]==searchElement) {
					return middle;
				} else if(elements[middle]>searchElement) {
					end = middle-1;
				} else if(elements[middle]<searchElement) {
					start = middle+1;
				} else {
					
				}
			}
		}
		return elementIndex;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinarySearchBothTypes binarySearch =
				new BinarySearchBothTypes();
		
		int[] elements = new int[] {1,3,4,5,9,12,15};
		int searchElement = 9;
		int elementIndexIterative = binarySearch.
				binarySearchIterative(elements,searchElement,0,elements.length);
		
		System.out.println(" The elementIndexIterative is  "+elementIndexIterative);
		int elementIndexRecursive = binarySearch.
				binarySearchRecursive(elements,searchElement,0,elements.length);
		
		System.out.println(" The elementIndexRecursive is  "+elementIndexRecursive);

		for(int i=0;i<1000;i++) {
			int fibonacciNumber =
					binarySearch.fibinacciTopDown(i, new int[i+1]);
			System.out.print("  "+ fibonacciNumber);
		}
		
		System.out.println("\n Fibonacci Bottom Up Approach ");
		
		for(int i=0;i<10;i++) {
			System.out.print("    "+binarySearch.fibonacciBottomUp(i));
		}
	}

	
	private int fibonacciBottomUp(int n) {
		if(n==0) {
			return 0;
		}
//		if(n==1) {
//			return 1;
//		}
		int a  = 0;
		int b = 1;
		int c = 0;
		for(int i=2;i<n;i++) {
			
			c = a+b;
			a=b;
			b=c;
		}
		return a+b;
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
	 * @param cache
	 * @return
	 */
	private int fibinacciTopDown(int n,int[] cache) {
		if(cache[n]!=0) {
			return cache[n];
		}
		if(n==0) {
			return 0;
		}
		if(n==1) {
			return 1;
		}

		if(cache[n]==0) {
			cache[n] = fibinacciTopDown(n-1, cache)
					+ fibinacciTopDown(n-2, cache);
		}
		return cache[n];
	}

}
