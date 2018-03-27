/**
 * 
 */
package com.test.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * This class finds the top 2 numbers from an 
 * Array.
 * 
 * For that purpose it used two variables to store some
 * default values, and start iterating through the array
 * once iterating through the array, if an element  more 
 * the default max value, that will be replaced with the max,
 * and max goes to 2ndMax. Otherwise if the element is less 
 * than the Max Element, but more than the 2nd Max Element,
 * that element will take the 2Max Element place. 
 *
 * Once the iterations on the Array are completed, We have the 
 * Max, and 2ndMax Elements.
 *
 */
public class TopTwoNumbersInArray {

	/**
	 * 
	 * @param a
	 * @return
	 */
	private int[] twoMaxNumbers(int a[]) {
		int[] resultArray = new int[2];
		int maxElement = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		if(a!=null && a.length>0) {
			for(int element : a) {
				if(element>maxElement)  {
					secondMax = maxElement;
					maxElement = element;
				} else if(element>secondMax) {
					secondMax = element;
				} else {
//					System.out.println(" The element is neither"
//							+ " less than any of these elements"
//							+ ""+element);
				}
			}
			resultArray[0] = maxElement;
			resultArray[1] = secondMax;
		} else {
			return resultArray;
		}
		return resultArray;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TopTwoNumbersInArray topTwoNumbersInArray = 
				new TopTwoNumbersInArray();
		int[] input = new int[]{4,6,9,19,16,15,18,5,6,1,3,-8,-9,10000};
		int[] result = topTwoNumbersInArray.twoMaxNumbers(input);
		System.out.println(" The max Two elements from the Array are ");
		if(result!=null && result.length>0) {
			System.out.println(Arrays.toString(result));
		}
		
	}

}
