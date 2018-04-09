/**
 * 
 */
package com.datastructures.array;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 * 
 * This class finds the first Non Repeating
 * element in an Array
 * 
 * It uses the approach to store the array using a 
 * HashSet, and parses the Array from right to left
 * once the first(0th index) element is reached, We have 
 * the desired element, whether it is repeated or non-repeated
 * element.
 *
 */
public class FirstRepeatingAndNonRepeatingElements {

	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int firstRepeatedElement(int[] elements) {
		int firstRepeatedElement = -1;
		if(elements!=null && elements.length>0) {
			Set<Integer> setOfElements = new HashSet<>();
			for(int i=elements.length-1;i>=0;i--){
				if(setOfElements.contains(elements[i])) {
					firstRepeatedElement = elements[i];
				} else {
					setOfElements.add(elements[i]);
				}
			}
		}
		return firstRepeatedElement;
	}
	
	
	private int  firstNonRepeatedHashSet(int [] elements)  {
		int firstNonRepatedElement = -1;
		Set<Integer> hashOfElements = new HashSet<>();
		if(elements!=null && elements.length>0) {
			for(int i=elements.length-1;i>=0;i--) {
				if(!hashOfElements.contains(elements[i])) {
					hashOfElements.add(elements[i]);
					firstNonRepatedElement = elements[i];
				}
			}
		}
		return firstNonRepatedElement;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FirstRepeatingAndNonRepeatingElements firstNonRepeatingElement = 
				new FirstRepeatingAndNonRepeatingElements();
		int[] input = new int[]{1,5,3,4,3,5,6,1};
		
		int firstRepeatedElement = firstNonRepeatingElement.
				firstRepeatedElement(input);
		
		System.out.println(" The First  Repating Element is "
				+ firstRepeatedElement);
		
		
		int firstNonRepeatedElement = firstNonRepeatingElement.
				firstNonRepeatedHashSet(input);
		
		System.out.println(" The First Non Repating Element is "
				+ firstNonRepeatedElement);

	}

}
