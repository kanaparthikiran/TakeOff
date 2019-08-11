/**
 * 
 */
package com.algorithms.numbers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class RemoveDuplicatesFromSortedArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] elements = new int[] {1,2,2,3,3,3,4,5,6,6};
		System.out.println(" Total unnique numbers "+ removeDuplicates(elements));
		
		int response = getATOI("123");
		System.out.println(" Response is "+response);
		
		int result = sqrt(625);
		System.out.println(" The sqrt is "+result);
		
	}

	private static int removeDuplicates(int[] elements) {
//		List<Integer> dedup = new ArrayList<>();
		int size = 0;
		int i = 0;
		for(int j=0;j<elements.length;j++) {
			if(elements[i]!=elements[j]) {
				i++;
				elements[i] = elements[j];
			}
//			size++;
//			System.out.println(" element "+elements[i]);
		}
		int[] dedupElements = new int[size];
		System.out.println(" Deduplicated array is "+ Arrays.toString(elements));
		return i+1;
		
	}
	
	private static int getATOI(String data) {
		int result = 0;
		for(int i=0;i<data.length();i++) {
			int number = (int)((data.charAt(i)-'0'));
			result = result*10+number;
			System.out.println("  element "+ number+" result each step "+result);

		}
		return result;
	}
	
	private static int sqrt(int number) {
		int result = -1;
		int start = 0;
		int end = number;
		while(start<=end) {
			int middle = start+(end-start)/2;
			if(middle*middle==number) {
				result =  middle;
				return result;
			} else if(middle*middle<number) {
				start = middle+1;
			} else {
				end = middle-1;
			}
		}
		return result;
	}
}
