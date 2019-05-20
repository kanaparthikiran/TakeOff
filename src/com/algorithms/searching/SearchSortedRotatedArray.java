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
		int element  = searchSorted(elements, 0, elements.length-1, 8);
		System.out.println(" The element is "+ element);
	}

	
	private static int searchSorted(int[] elements, int start, int end , int search) {
		if(elements!=null) {
			int middle = start + (end - start)/2;
			if(elements[middle]==search) {
				return middle;
			}
			if(elements[start]<elements[middle]) {
				if(elements[start]<=search && search<=elements[middle]) {
					return searchSorted(elements, start, middle-1, search);
				} else {
					return searchSorted(elements, middle+1, end, search);
				}
			} else {
				if(search>=elements[middle] && search<=elements[end]) {
					return searchSorted(elements, middle+1, end, search);
				} else {
					return searchSorted(elements, start, middle-1, search);
				}
			}
		}
		return -1;
		
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
