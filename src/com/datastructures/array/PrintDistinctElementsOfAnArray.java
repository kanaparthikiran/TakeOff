/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class PrintDistinctElementsOfAnArray {

	/**
	 * 
	 */
	private void printDistinctElements(int[] elements) {
		if(elements!=null && elements.length>0) {
			Arrays.sort(elements);
			for(int i=0;i<elements.length;i++) {
				while(i<elements.length-1 && elements[i]==elements[i+1]) {
					i++;
				}
				System.out.print(elements[i]+" ");
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PrintDistinctElementsOfAnArray printDistinctElementsOfAnArray =
				new PrintDistinctElementsOfAnArray();
		int[] elements = new int[]{1,2,2,3,3,5,6,8,7,10,4};
		printDistinctElementsOfAnArray.printDistinctElements(elements);
	}

}
