/**
 * 
 */
package com.datastructures.core;

/**
 * @author kkanaparthi
 *
 */
public class BinarySearch {

	/**
	 * 
	 */
	public BinarySearch() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int a [] = new int[]{1,3,4,5,10,12,13,15,18,20};
		BinarySearch bst = new BinarySearch();
		bst.binarySearchIterative(a, a.length, 13);
		
		int start  =0;
		int end = a.length;
		bst.binarySearchRecursive(a, a.length, 13, start, end);
	}

	/**
	 * 
	 * @param a
	 * @param size
	 * @param x
	 * @param start
	 * @param end
	 * @return
	 */
	private int binarySearchRecursive(int a[],int size,int x,int start,int end) {
		int indexOfElement = -1;
		int mid = (start+end)/2;
		
		if(x==a[mid]) {
			indexOfElement = mid;
			System.out.println("The Element FOund Using Recursion as well at the Index "
					+ " "+ indexOfElement);
		} else if(x<a[mid]) {
			System.out.println(" x<a[mid] condition is reached ");
			return binarySearchRecursive(a, size, x, start, mid-1);
		} else if(x>a[mid]) {
			System.out.println(" x>a[mid] condition is reached ");
			return binarySearchRecursive(a, size, x, mid+1, end);
		}  else {
			System.out.println("It Should NOT be printed at all ");
		}
	
		return indexOfElement;
	}
	
	
	/**
	 * 
	 * @param a
	 * @param size
	 * @param x
	 * @return
	 */
	private int binarySearchIterative(int a[],int size,int x) {
		int indexOfElem = -1; 
		int start =0, end=0, middle=0;
		end = size;
		
		//int i =0;
		for(int i=start;i<end;i++) {
				
			//i++;	
			System.out.println("start "+start+" end "+end+" i"+i);
			middle = (start+end)/2;
			if(x<a[middle]) {
				System.out.println("searching value is less than Middle");
				start = 0;
				end = middle-1; 
			} else if(x>a[middle]) {
				System.out.println("searching value is more than Middle");
				start = middle+1;
			} else {
				System.out.println("searching value is In the Middle");
				indexOfElem = i;
			}
		}
		System.out.println("The Element Found at the Index of "+indexOfElem);
		return indexOfElem;
	}
}
