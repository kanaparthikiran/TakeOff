/**
 * 
 */
package com.test.scratchpad;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Kiran Kanaparthi
 *
 */
public class UnionAndIntersectionTestAndDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Integer[] one = {1,4,5,6,7,9};
		Integer[] two = {4,5,8,10};
		UnionAndIntersectionTestAndDelete unionAndIntersectionTestAndDelete =
				new UnionAndIntersectionTestAndDelete();
		Integer[] unionArray = unionAndIntersectionTestAndDelete.getUnionArray(one,two);
		Integer[] intersectionArray = unionAndIntersectionTestAndDelete.getIntersectionArray(one,two);
		System.out.println("Union Array is  "+Arrays.toString(unionArray) );
		Arrays.toString(unionArray);
		System.out.println("Intersection Array is  "+Arrays.toString(intersectionArray) );

	}


	/**
	 * 
	 * @param arrayOne
	 * @param arrayTwo
	 * @return
	 */
	private Integer[] getUnionArray(Integer[] arrayOne, Integer[] arrayTwo) {
		Integer[] unionArray = null;
		if(arrayOne!=null && arrayOne.length>0 && arrayTwo!=null && arrayTwo.length>0) {
			int unionArrayLength = arrayOne.length+arrayTwo.length;
			unionArray = new Integer[unionArrayLength];
			System.out.println(" unionArrayLength  "+unionArrayLength);
//			for(int i=0;i<unionArrayLength;i++) {
				int i = 0;
				int j = 0;
				int k = 0;
				while(j<arrayOne.length && k<arrayTwo.length) {
					if(arrayOne[j]<arrayTwo[k]) {
						unionArray[i]= arrayOne[j];
						j++;
						i++;
					} else if(arrayOne[j]>arrayTwo[k]) {
						unionArray[i]= arrayTwo[k];
						k++;
						i++;
					} else {
						unionArray[i]= arrayOne[j];
						j++;
						k++;
						i++;
					}
				}
		}
		System.out.println(" Union Array Length is "+unionArray.length
				+ Arrays.toString(unionArray));
		return unionArray;
	}
	
	/**
	 * 
	 * @param arrayOne
	 * @param arrayTwo
	 * @return
	 */
	private Integer[] getIntersectionArray(Integer[] arrayOne, Integer[] arrayTwo) {
		Integer [] intersectionArray = null;
		List<Integer> intersectionList = null;
		if(arrayOne!=null && arrayOne.length>0 && arrayTwo!=null && arrayTwo.length>0) {
			int intersectionArrayLength = arrayOne.length>arrayTwo.length?
					arrayOne.length:arrayTwo.length;
			intersectionArray = new Integer[intersectionArrayLength];
			intersectionList = new ArrayList<>(intersectionArrayLength);
			int i = 0;
			int j = 0;
			int k = 0;
			while(i<arrayOne.length && j<arrayTwo.length) {
				if(arrayOne[j]<arrayTwo[k]) {
					//System.out.println(" arrayOne[j]<arrayTwo[j] "+ (arrayOne[j]<arrayTwo[j]));
					j++;
				} else if(arrayOne[j]>arrayTwo[k]) {
					//System.out.println("arrayOne[j]>arrayTwo[k] "+ (arrayOne[j]>arrayTwo[k]));

					k++;
				} else {
					intersectionArray[i] = arrayOne[j];
					intersectionList.add(arrayOne[j]);
					System.out.println(" Copied Element "+ arrayOne[j]+" in to Intersection Array ");
					j++;
					k++;
					i++;
				}
			}
		}
		return intersectionList.toArray(new Integer[0]);
	}
}
