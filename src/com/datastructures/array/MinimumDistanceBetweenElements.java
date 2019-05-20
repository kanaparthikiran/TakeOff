/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class finds the Minimum distance between two
 * numbers in an Array.
 * 
 * We use the scanning approach. We choose a default minimumDistance value which is
 * assumed to be Integer.MAX_VALUE, and the elements we are looking for are X and Y
 * 
 *
 * Traverse the Array from the left to right and stop if either of the
 * elements we are looking are found, take that element as previous.
 * 
 *  Then Iterate through the array, and look for X or Y
 *  if either of them are found, the found element is not equal to the previous element, and
 *  the minimum distance between the previous element and found element is less 
 *  than the minimumDistance value, then take the new distance as the new minimumDistance
 *  and mark the found element to previous. 
 *  Continue this process until the end of the Array is reached.
 *
 */
public class MinimumDistanceBetweenElements {

	/**
	 * This method gets the minimum distance between the two numbers given 
	 * in the array
	 * 
	 * @return
	 */
	private int getMinimumDistanceBetween(int[] input,int x,int y) {
		int minimumDistance = Integer.MAX_VALUE;
		int previous = -1;
		int index = 0;
		int prevIndex = 0;

		if(input!=null && input.length>0) {
			//find previous Element, which will be used for search operation
			for(int elem:input) {
				if(elem==x || elem==y) {
					previous = elem;
					break;
				}
				index++;
				prevIndex++;
			}
			for(int i=prevIndex+1;i<input.length;i++) {
				if((input[i]==x || input[i]==y) 
						&& input[i]!=previous &&
						(i-index)<minimumDistance) {
					minimumDistance = i-index;
					index = i;
					previous = input[i];
				}
			}
		}
		return minimumDistance;
	}
	
	private static int minDistance(int [] data, 
			int elementOne, int elementTwo) {
		int result = 0;
		int prevElement = 0;
		int prevIndex = 0;
		int i=0 ;
		for(;i<data.length;i++) {
			if(data[i]==elementOne || data[i]==elementTwo) {
				prevElement = data[i];
				prevIndex = i;
				break;
			}
		}
		for(i=prevIndex;i<data.length;i++) {
			if((data[i]==elementOne||data[i]==elementTwo) &&
					data[i]!=prevElement) {
				result = i-prevIndex;
				break;
			}
		}
		return result;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MinimumDistanceBetweenElements minimumDistanceBetweenArrayElements = 
				new MinimumDistanceBetweenElements();
		int[] array = new int[]{2,3,4,5,6,7,3,4,7,8,9};
		int minDistance =
				minimumDistanceBetweenArrayElements.
				getMinimumDistanceBetween(array, 3, 4);
		System.out.println(" Minimum distance between"
				+ " two numbers is "+ minDistance);
		System.out.println(" The min distance between numbers is "+ minDistance(array, 5,7));
	}

}
