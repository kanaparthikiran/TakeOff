/**
 * 
 */
package com.datastructures.core;

import java.util.HashMap;
import java.util.Map;

/**
 * @author kkanaparthi
 *
 */
public class FindHighestIndexOfOccurances {


	public static void main(String a[]) {
		int x =5,y=14;
		int array[] = new int[]{1,5,5,10,10,7,5,10,6,9,14,5,10,7,9,4};
		int matchingIndex = -1;
		int length = array.length;
		int xCount=0 ,yCount =0;
		for(int i=0;i<length;i++) {
			if(array[i] == x) {
				xCount++;
				matchingIndex = i;
			} else if(array[i]==y) {
				yCount++;
				matchingIndex = i;
			} else {
				System.out.println
					("No Match with X and Y "+array[i]);
			}
		}
		if(xCount==yCount) {
			System.out.println("x and y are repeated for the"
					+ " same count of times "+xCount+" matchingIndex "+matchingIndex);
		} else {
			System.out.println("X and Y counts are NOT equal"
					+ " xCount "+xCount+" yCount "+yCount);
		}
	}
}
