/**
 * 
 */
package com.test.search;

/**
 * @author Kiran
 *
 */
public class BinarySearchIterative {



	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchIterative binarySearch = new BinarySearchIterative();
		int[] elements = new int[]{3,4,5,6,7,8,9,10,11,12,13,14,15,16};
		int searchElement = 11  ;
		int start = 0;
		int end = 0;

		if(elements!=null) {
			end =  (elements.length); 
		}
		int elementIndex = 
				binarySearch.doBinarySearchIterative(elements, searchElement, start, end);
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
	 * @param elements
	 * @param searchElement
	 * @param startIndex
	 * @param endIndex
	 * @return
	 */
	private int doBinarySearchIterative(int[] elements,int searchElement,
			int startIndex,int endIndex) {
		int elementIndex = -1;
		while(startIndex<=endIndex) {
			int middleIndex = (startIndex+endIndex)/2;
				if(elements[middleIndex]==searchElement) {
					elementIndex = middleIndex;
					return elementIndex;
				} else if(searchElement<elements[middleIndex]) {
					endIndex = middleIndex-1;
				} else if(searchElement>elements[middleIndex]) {
					startIndex = middleIndex+1;
				} else {
					System.out.println(" The element is"
							+ " Not found in the Array ");
					elementIndex = -1;
				}
		}
		return elementIndex;
	}
}
