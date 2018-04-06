/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class finds the First Duplicate Number with O(1) space
 * and O(n) Time complexity
 * 
 * So one notable piece of info is that the elements in the list do not 
 * surpass the length of the list and they are positive. 
 * The trick here is to use the array itself as a hash. 
 * Treat every elements in the array as keys, a[x] as a hash function 
 * and a[keys] as values. The values are True and False but since the 
 * array is not boolean we can negate them to mark that 
 * the key which is derived from this value is visited. 
 * 2 same keys can only map to the same value in a hash 
 * so when you iterate the array the first duplicate will be returned.
 *
 */
public class FirstDuplicateInArray {

	/**
	 * 
	 * @param a
	 * @return
	 */
	int firstDuplicateNumber(int[] a) {
		int maxSeqNumber= -1;
		if(a!=null && a.length>0) {
		      for(int element:a) {
		          if(a[Math.abs(element)-1]<0) {
		              return Math.abs(element);
		          } else {
		              a[Math.abs(element)-1] *=-1;
		          }
		      }
		   }
			return maxSeqNumber;
		 }

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstDuplicateInArray firstDuplicateInArray = new FirstDuplicateInArray();
		
		int[] a = new int[]{8, 4, 6,2, 7, 4, 7, 9, 5, 8,9,1};
		int firstDuplicate = firstDuplicateInArray.firstDuplicateNumber(a);
		System.out.println(" first Duplicate "+ firstDuplicate);
	}

}
