/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author Kiran Kanaparthi
 *
 */
public class UnionAndIntersectionOfTwoArrays {

	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private boolean isEmptyArray(int [] elements) {
		if(elements!=null && elements.length>0) {
			return true;
		}
		return false;
	}
	/**
	 * 
	 * @param elementSetOne
	 * @param elementSetTwo
	 * @return
	 */
	private int[] getUnionOfArrays(int[] elementSetOne, int[] elementSetTwo)  {
		int[] unionArray = null;
		if(!isEmptyArray(elementSetOne) &&
				!(isEmptyArray(elementSetTwo))) {
			int elementSetOneIndex=0,elementSetTwoIndex=0;
			int minArrayLength = Math.max(elementSetOne.length,
					elementSetTwo.length);
			
			for(int i=0;i<minArrayLength;) {
				
				elementSetOneIndex++;
				elementSetTwoIndex++;
				
			}
			
		}
		
		return unionArray;
	}
	
	/**
	 * 
	 * @param elementSetOne
	 * @param elementSetTwo
	 * @return
	 */
	private int[] getIntersectionOfArrays(int[] elementSetOne, int[] elementSetTwo) {
		int[] intersectionArray = null;
		
		return intersectionArray;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		UnionAndIntersectionOfTwoArrays unionAndIntersecion =
				new UnionAndIntersectionOfTwoArrays();
		int [] a = new int[] {1,2,3,4,5,7,10};
		int [] b = new int[] {3,5,20};
		int[] unionArray = unionAndIntersecion.getUnionOfArrays(a,b);
		System.out.println(" Union Array "+Arrays.toString(unionArray));
		int[] intersectionArray = 
				unionAndIntersecion.getIntersectionOfArrays(a,b);
		System.out.println(" Intersection Array "+
				Arrays.toString(intersectionArray));
	
	}

}
