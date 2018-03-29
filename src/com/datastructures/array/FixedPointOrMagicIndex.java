/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class finds the fixed Point or Magic Index
 * of any array such that index of an element becomes
 * equal to the element., i.e.,i=a[i]
 * 
 * The Array is sorted and can contain negative numbers as well
 * 
 * Since the Array is Sorted We can use Binary Search rather than 
 * Linear Search to achieve logN time complexity
 *
 */
public class FixedPointOrMagicIndex {
		
	/**
	 * 
	 * @return
	 */
	private int findFixedPointOrMagicNumber(int[] array,int low,int high) {
		int mid = (low+high)/2;
		int result  = 0;
		if(array[mid]==mid) {
			return mid;
		} else {
			if(mid>array[mid]) {
				result = findFixedPointOrMagicNumber(array, mid+1, high);
			} else if(array[mid]>mid) {
				result = findFixedPointOrMagicNumber(array, low, mid-1);
			} else {
				result = -1;
			}
		}
		return result;	
	}

	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FixedPointOrMagicIndex fixedPointOrMagicIndex = new FixedPointOrMagicIndex();
		int[] array = new int[]{-10,-9,1,2,3,7,6,9,10};
		int fixedPoint = 
				fixedPointOrMagicIndex.
				findFixedPointOrMagicNumber(array, 0, array.length-1);
		System.out.println(" The Fixed Point of the Array is "+fixedPoint);
		
	}

}
