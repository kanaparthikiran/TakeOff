/**
 * 
 */
package com.algorithms.searching;

/**
 * @author kkanaparthi
 *
 */
public class SearchSortedRotatedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] elements = new int[] {6,7,8,1,2,3,4,5};
		int searchedElementIndex = 
				search(elements, 0, elements.length-1, 8);
		System.out.println(" Searched Element index is "+
				searchedElementIndex);
	}

	/**
	 * 
	 * @param elements
	 * @param start
	 * @param end
	 * @param item
	 * @return
	 */
	private static int search(int[] elements,int start,int end, int item) {
			int middle = start+(end-start)/2;
			if(elements[start]==elements[end]) {
				return start;
			}
			if(elements[middle]==item) {
				return middle;
			}
			if(elements[start]<elements[middle]) {
				if(elements[start]<=item && elements[middle]>=item) {
					return search(elements, start, middle-1, item);
				} else {
					return  search(elements, middle+1, end, item);
				}
			} else {
				if(elements[middle]<=item && elements[end]>=item) {
					return search(elements, middle+1, end, item);
				} else {
					return search(elements, start, middle-1, item);
				}
			}
	}
	
}
