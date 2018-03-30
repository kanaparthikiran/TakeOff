/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 * 
 * This class replaces Every Element with the greatest 
 * element on it's right. The far right most element does
 * not have any elements to it's right, so that will be 
 * replaced by -1
 * 
 * The approach followed is to traverse the elements from the 
 * right side, and start the update with right most element value set 
 * to -1.Take the current element value(buffer), and continue to traverse from 
 * right to left,keep the current value if no greater value is found, and
 * replace the subsequent elements with this value, if any greater value
 * than the current value(buffer) is found, replace the existing value, 
 * use the greater value for replacement
 *                             
 *
 */
public class ReplaceElementWithGreatestOnRight {

	/**
	 * 
	 * @param array
	 * @return
	 */
	private int[] replaceElementsWithGreaterValueOnRight(int[] array) {
		
		int greaterElement = Integer.MIN_VALUE;
		int buffer = 0;
		if(array!=null && array.length>0) {
			buffer = array[array.length-1];
			greaterElement = array[array.length-1];
			array[array.length-1] = -1;
			for(int i=array.length-2;i>=0;i--) {
				if(array[i]>buffer) {
					buffer = array[i];
					array[i] = greaterElement;
				} else {
					array[i] = buffer;
					greaterElement = buffer;
				}
			}
		}
		return array;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReplaceElementWithGreatestOnRight replaceElementWithGreatestOnRight = 
				new ReplaceElementWithGreatestOnRight();
		int[] array = new int[]{16,17,4,3,5,2};
		int[] resultArray = 
				replaceElementWithGreatestOnRight.
				replaceElementsWithGreaterValueOnRight(array);
		
		if(resultArray!=null && resultArray.length>0) {
			for(int resultArrayElem : resultArray) {
				System.out.print("   "+resultArrayElem);
			}
		}
	}
	
	
	

}
