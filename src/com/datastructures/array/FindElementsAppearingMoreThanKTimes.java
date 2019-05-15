/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author Kiran
 *
 */
public class FindElementsAppearingMoreThanKTimes {

	/**
	 * 
	 * @return
	 */
	private char[] buildCharFrequencyArray(char[] input) {
		char [] frequencyArray = new char[26];
		if(input!=null && input.length>0) {
			for(char elem : input) {
				frequencyArray[elem-'a']++;
			}
		}
		System.out.println(" frequencyArray "+Arrays.toString(frequencyArray));
		return frequencyArray;
	}
	/**
	 * 
	 * @return
	 */
	private char[] findElementsWithGivenOccurances(String input,int frequencyK) {
		char[] frequencyElements = null;
		if(input!=null && input.length()>0) {
			frequencyElements = new char[input.length()];
			char[] inElements = input.toCharArray();
			char[] frequencyArray = 
					buildCharFrequencyArray(inElements);
			System.out.println(" The frequencyArray Elements are "
					+ Arrays.toString(frequencyArray));

			for(int i=0;i<input.length();i++) {
				if(frequencyArray[input.charAt(i)-'a']==frequencyK) {
					frequencyElements[i] = input.charAt(i);
					System.out.println(" The Repeated Character is "+ input.charAt(i));
				}
			}
		}
		return frequencyElements;
	}
	
	
	private char[] findElemWithFrequency(String input,int frequency) {
		char[] results = new char[1];
		char[] elements = input.toCharArray();
		char[] countElements = new char[26];
		for(char elem :elements) {
//			System.out.println(" index  "+ (elem-'a'));
			countElements[elem-'a']++;
		}
		System.out.println(" Arrays values "+ Arrays.toString(countElements));
		for(char elem :elements) {
			if(countElements[elem-'a']==frequency) {
				results[0] = elem;
			}
		}
		return results;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		FindElementsAppearingMoreThanKTimes  findElementsAppearingMoreThanKTimes =
				new FindElementsAppearingMoreThanKTimes();
		String input = "test";
		int n = input.length();
		int k = 2;
		char[] charElems =
				findElementsAppearingMoreThanKTimes.findElemWithFrequency(input,n/k);
		System.out.println(" The Array Elements are "+ Arrays.toString(charElems));
	}

}
