/**
 * 
 */
package com.datastructures.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author kkanaparthi
 * 
 * This class provides the SortedArray Elements With 
 * a Given sum, There are a couple of approaches
 * 
 * 1) LinearSearch and Use a HashSet to store the pairs and print 
 * in the end.
 * 
 *  2) As the Array is Sorted Binary Search gives better performance in
 *  O(log n) time
 */
public class SortedArrayElementsWithGivenSum {

	/**
	 * 
	 * @param a
	 * @param sum
	 * @return
	 */
	private Pair[] findElementsWithGivenSumUnSortedArray(int a[],int sum) {
		List<Pair> paifOfElements = new ArrayList<>();
		Set<Integer> hashOfElements = new HashSet<>();
		if(a!=null && a.length>0) {
			for(int i=0;i<a.length;i++) {
				int compliment = sum - a[i];
				if(hashOfElements.contains(compliment) &&
						!hashOfElements.contains(a[i])) {
					paifOfElements.add(new Pair(a[i],compliment));
				} else {
					hashOfElements.add(a[i]);
				}
			}
		}
		return paifOfElements.toArray(new Pair[0]);
	}
	
	/**
	 * 
	 * @param a
	 * @param sum
	 * @return
	 */
	private Pair[] findElementsWithGivenSumSortedArray(int a[],int sum) {
		List<Pair> paifOfElements = new ArrayList<>();
		Set<Integer> hashOfElements = new HashSet<>();
		if(a!=null && a.length>0) {
			//sort the Array
			Arrays.sort(a);
			
			//Now the Array is Sorted Use Binary Search Approach
			//1,2,2,3,4,5,5,7
			for(int i=0;i<a.length;i++) {
				int compliment = sum - a[i];
				int complimentElement =
						binarySearchForCompliment(a,0,a.length,compliment);
				if(hashOfElements.contains(compliment) &&
						!hashOfElements.contains(a[i])) {
					paifOfElements.add(new Pair(a[i],compliment));
				} else {
					hashOfElements.add(a[i]);
				}
			}
		}
		return paifOfElements.toArray(new Pair[0]);
	}

	/**
	 * 
	 * @return
	 */
	private int binarySearchForCompliment(int[] a,int low, int high,int compliment) {
		int complimentElementIndex = -1;
		int mid = (low+high)/2;
		System.out.println("  mid "+mid);
		if(a[mid]==compliment) {
			return a[mid];
		} else {
			if(compliment<a[mid]) {
				System.out.println(" Searching on the left side of the Array ");
				complimentElementIndex = binarySearchForCompliment(a, low, mid-1, complimentElementIndex);
			} else {
				System.out.println(" Searching on the right side of the Array ");
				complimentElementIndex = binarySearchForCompliment(a, mid+1, high, complimentElementIndex);
			}
		}
		return complimentElementIndex;
	}

	
	private int binarySearchRecursive(int a[],int x,int start,int end) {
		int indexOfElement = -1;
		int mid = (start+end)/2;
		if(start<=end) {
			if(x==a[mid]) {
				indexOfElement = mid;
				System.out.println("The Element Found Using Recursion as well at the Index "
						+ " "+ indexOfElement);
				return mid;
			}
			 if(x<a[mid]) {
				System.out.println(" x<a[mid] condition is reached ");
				return binarySearchRecursive(a, x, start, mid-1);
			 }
				return binarySearchRecursive(a, x, mid+1, end);
		}
		return indexOfElement;
	
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedArrayElementsWithGivenSum sorted = new 
				SortedArrayElementsWithGivenSum();
		int n[] = new int[]{1,3,4,5,10,12,13,15,18,20};
		int sum  = 10;
		
//		Pair[] minSum = sorted.findElementsWithGivenSumUnSortedArray(n, sum);
//		
//		System.out.println(" Minimum Distance between two numbers is "
//				+ Arrays.toString(minSum));
		Arrays.sort(n);
		System.out.println(" After Sorting "+Arrays.toString(n));
		int binarySearchElement = sorted.binarySearchRecursive(n,7, 0, n.length);

//		int binarySearchElement =
//				sorted.binarySearchRecursive(n, 0, n.length, 7);
//		
		System.out.println(" Binary Searched Element is "+binarySearchElement);
	}



	class Pair {
		/**
		 * @param pA
		 * @param pB
		 */
		public Pair(int pA, int pB) {
			super();
			a = pA;
			b = pB;
		}

		int a,b;

		/**
		 * @return the a
		 */
		public int getA() {
			return a;
		}

		/**
		 * @param pA the a to set
		 */
		public void setA(int pA) {
			a = pA;
		}

		/**
		 * @return the b
		 */
		public int getB() {
			return b;
		}

		/**
		 * @param pB the b to set
		 */
		public void setB(int pB) {
			b = pB;
		}

		/* (non-Javadoc)
		 * @see java.lang.Object#toString()
		 */
		@Override
		public String toString() {
			return "Pair [a=" + a + ", b=" + b + "]";
		}
		
	}
	
}


