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
	private char[] buildCharFrequencyArray(String input) {
		char [] frequencyArray = new char[26];
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				frequencyArray[input.charAt(i)-'a']++;
			}
		}
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
			char[] frequencyArray = 
					buildCharFrequencyArray(input);
			
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
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FindElementsAppearingMoreThanKTimes  findElementsAppearingMoreThanKTimes =
				new FindElementsAppearingMoreThanKTimes();
		String input = "test";
		int n = input.length();
		int k = 2;
		char[] charElems =
				findElementsAppearingMoreThanKTimes.findElementsWithGivenOccurances(input,n/k);
		System.out.println(" The Array Elements are "+ Arrays.toString(charElems));
	}

}
