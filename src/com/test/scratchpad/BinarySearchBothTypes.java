/**
 * 
 */
package com.test.scratchpad;

import java.util.Arrays;
import java.util.Comparator;

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
	 * This method does the mergesort for the given array
	 * 
	 * @param a
	 * @param start
	 * @param end
	 * @param backup
	 */
	private void mergeSort(int[]a,int start, int end, int[] helper) {
		if(start<end) {
			int middle = (start+end)/2;
			mergeSort(a, start, middle, helper);
			mergeSort(a, middle+1, end, helper);
			merge(a, start, middle, end, helper);
		}
	}
	
	
	
	/**
	 * Does the merge operation of the merge sort.
	 * 
	 * @param a
	 * @param start
	 * @param middle
	 * @param end
	 * @param backup
	 */
	private void merge(int[]a,int start, int middle, int end, int[] helper) {
		for(int i=start;i<=end;i++) {
			helper[i] = a[i];
		}
		int helperLeft = start;
		int helperRight = middle+1;
		int current = start;
		
		//Iterate through the helper array. Compare the left and right half, copying back
		//the smaller elements from the two halves into the original array.
		while(helperLeft<=middle && helperRight<=end) {
			if(helper[helperLeft]<=helper[helperRight]) {
				a[current] = helper[helperLeft];
				helperLeft++;
			} else {
				a[current] = helper[helperRight];
				helperRight++;
			}
			current++;
		}
		
		/* Copy rest of the left side of the array into the target array */
		int remaining = middle-helperLeft;
		for(int i=0;i<=remaining;i++) {
			a[current+i] = helper[helperLeft+i];
		}
	}
//
//	/**
//	 * 
//	 * @param a
//	 * @param b
//	 */
//	private int[] mergeTwoArraysIntoOne(int a[],int[] b) {
//		int aLastIndex = 0;
//		int bLastIndex = 0;
//		int mergedLastIndex = 0;
//		if(a!=null && a.length>0 && b!=null && b.length>0) {
//			aLastIndex = a.length-1;
//			bLastIndex = b.length-1;
//			mergedLastIndex = aLastIndex+bLastIndex-1;
//			while(bLastIndex>=0) {
//				if(aLastIndex>=0 && b[bLastIndex]>a[aLastIndex]) {
//					a[mergedLastIndex]=b[bLastIndex];
//					bLastIndex--;
//				} else if(bLastIndex>=0 && aLastIndex>=0 && a[aLastIndex]>b[bLastIndex]) {
//					a[mergedLastIndex] = a[aLastIndex];
//					aLastIndex--;
//				} else {
//					a[mergedLastIndex] = a[aLastIndex];
//					aLastIndex--;
//					bLastIndex--;
//				}
//				mergedLastIndex--;
//			}
//		}
//		return a;
//	}
//	
	
	/**
	 * 
	 * @param a
	 * @param start
	 * @param end
	 * @return
	 */
	private int binSearchDelete(int a[],int searchElement,int start,int end) {
		int result = -1;
		if(a!=null && a.length>0) {
			while(start<=end) {
				int middle = (start+end)/2;
				if(a[middle]==searchElement) {
					return middle;
				} else if(a[middle]>searchElement) {
					end = middle-1;
				} else {
					start = middle+1;
				}
			}
		}
		return result;
	}
	
	/**
	 * 
	 * @param a
	 * @param searchElement
	 * @param start
	 * @param end
	 * @return
	 */
	private int binSearchRec(int a[], 
			int searchElement,int start, int end) {
		int response = 0;
		if(a!=null && a.length>0) {
			int middle = start+ ((end-start)/2);
			if(a[middle] == searchElement) {
				return middle;
			} else if(a[middle]>searchElement) {
				return(binSearchRec(a, searchElement, start, middle-1));
			} else {
				return(binSearchRec(a, searchElement, middle+1, start));
			}
		}
		return response;
	}
	
	private int sumOfNumbers(int a[],int n) {
			if(n==0) {
				return 0;
			}
			return n+sumOfNumbers(a,n-1);
	}
	
	
	private int powersOfNumber(int n) {
		if(n<1) {
			return 0;
		} else if(n==1) {
			System.out.println(1);
			return 1;
		} else {
			int prev = powersOfNumber(n/2);
			int next = prev*2;
			System.out.println(next);
			return next;	
		}
	}

	public static void tricky(Point arg1, Point arg2)
	{
	  arg1.x = 100;
	  arg1.y = 100;
	  Point temp = arg1;
	  arg1 = arg2;
	  arg2 = temp;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		BinarySearchBothTypes binarySearch =
				new BinarySearchBothTypes();
		
		int[] elements = new int[] {1,3,4,5,9,12,15};
		
		binarySearch =
				new BinarySearchBothTypes();
		int[] elementsForMerge = new int[] {4,1,2,5,6,10};
		binarySearch.mergeSort(elementsForMerge, 0, elementsForMerge.length-1,
						new int[elementsForMerge.length]);
		System.out.println(" Elements After Merge Sort are "+ Arrays.toString(elementsForMerge));
		
//		int[] response =
//				binarySearch.mergeTwoArraysIntoOne(new int[] {2,3,4,0,0}, new int[] {1,6});
//		System.out.println(" The Array Response is "+ Arrays.toString(response));
//		
		
		  Point pnt1 = new Point(0,0);
		  Point pnt2 = new Point(0,0);
		  System.out.println("X: " + pnt1.x + " Y: " +pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);
		  System.out.println(" ");
		  tricky(pnt1,pnt2);
		  System.out.println("X: " + pnt1.x + " Y:" + pnt1.y); 
		  System.out.println("X: " + pnt2.x + " Y: " +pnt2.y);  

		  
		
		int sumOfAllNumbers = binarySearch.sumOfNumbers(null, 10);
		System.out.println(" sum Of All Numbers "+sumOfAllNumbers);
		int powersOfNumber = binarySearch.powersOfNumber(10);
		System.out.println(" Powers of Number "+powersOfNumber);
		int binDeleteResponse = binarySearch.binSearchDelete(elements, 15,0,elements.length);
		int binResponse = binarySearch.binSearchRec(elements, 15,0,elements.length);
		System.out.println("  Binary Search Response is "+binDeleteResponse);
		
		System.out.println("  Binary Search Recursive response is "+binResponse);

		int thirdLargest = binarySearch.findThirdLargest(new int[] {5,2,1,3});
		System.out.println(" Third Largest Element is "+ thirdLargest);
		System.exit(1);
		
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
	
	
	private int findThirdLargest(int[] a) {
		int firstLargest = Integer.MIN_VALUE;
		int secondLargest = 0;
		int thirdLargest = 0;
		if(a!=null && a.length>0) {
			for(int element : a) {
				if(element>firstLargest) {
					secondLargest = firstLargest;
					thirdLargest = secondLargest;
					firstLargest = element;
				} else if(element>secondLargest) {
					thirdLargest = secondLargest;
					secondLargest = element;
				} else if(element>thirdLargest) {
					thirdLargest = element;
				}
			}
		}
		return thirdLargest;
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




class Point implements Comparator<Point> {
	int x,y;

	public Point(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
	public int compare(Point p1,Point p2) {
		if(p1.x>p2.x) return 1;
		else if(p1.x<p2.x) return -1;
		else return 0;
	}
	
	public int compareTo(Point c) {
		if(this.x>c.x) {
			return 1;
		} else {
			return -1;
		}
	}
}
