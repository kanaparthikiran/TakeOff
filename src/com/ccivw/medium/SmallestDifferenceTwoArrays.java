/**
 * 
 */
package com.ccivw.medium;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class SmallestDifferenceTwoArrays {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] a = new int[] {1,2,11,15};
		int b[] = new int[] {5,18,19,23,127,235};
		
		int smallestDifference = 
				getSmallestDifference(a, b);
		System.out.println(" Smallest difference is "+smallestDifference);
		int n = getFactorialZeros(29);
		System.out.println(" Factorial zeroes "+n);
	}

	private static int getSmallestDifference(int a[], int b[]) {
		Arrays.sort(a);
		Arrays.sort(b);
		int m = a.length-1;
		int n = b.length-1;
		int i = 0;
		int j = 0;
		int smallestDifference = Integer.MAX_VALUE;
		while(i<m&&j<n) {
			if(Math.abs(a[i]-b[j])<smallestDifference) {
				smallestDifference = Math.abs(a[i]-b[j]);
			}
			if(a[i]<b[j]) {
				i++;
			} else {
				j++;
			}
			
		}
		return smallestDifference;
	}
	
	private static int getFactorialZeros(int n) {
		if(n<0) {
			return 0;
		}
		int count = 0;
		for(int i=5;n/i>0;i=i*5) {
			count+=n/i;
		}
		return count;
	}
}
