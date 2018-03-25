/**
 * 
 */
package com.test.search;

/**
 * @author Kiran
 *
 */
public class BinarySearchRecursive {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchRecursive binarySearch = new BinarySearchRecursive();
		int[] elements = new int[]{3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int searchElement = 1  ;
		int start = 0;
		int end = 0;

		if(elements!=null) {
			end =  (elements.length); 
		}
		int elementIndex = 
				binarySearch.doBinarySearch(elements, searchElement, start, end);
		if(elementIndex!=-1) {
			System.out.println(" Found the searching element"
					+ " at the Index of "
							+ elementIndex);
		} else {
			System.out.println(" The element is Not"
					+ "  found in the Array ");
		}
	}
	
	
	/**
	 * 
	 * @return
	 */
	private int doBinarySearch(int elements[],int searchElement,int start,int end)  {
		int elementIndex = 0;
		int middle = (start+end)/2;
		System.out.println(" Middle started at  "+ middle+" start "+start+" end "+end);
		if(searchElement==elements[middle]) {
			elementIndex = middle;
			return elementIndex;
		} else {
			if(searchElement<middle) {
				elementIndex = doBinarySearch(elements, searchElement, start, middle-1);	
			} else if(searchElement>middle) {
				elementIndex = doBinarySearch(elements, searchElement, middle+1, end);	
			} else {
				System.out.println(" The element is "
						+ " Not found in the Array ");
				elementIndex = -1;
			}
		}
		return elementIndex;
	}

}
