/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 *
 */
public class LostElementFromTwoDuplicatedArrays {

	/**
	 * This method finds the lost element between
	 * two duplicate Arrays
	 * 
	 * @return
	 */
	private int lostElementFromArrays(int a[], int[] b) {
		int xorValue = 0;
		for(int elem: a) {
			xorValue ^=elem;
		}
		for(int elem: b) {
			xorValue ^=elem;
		}
		return xorValue;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		LostElementFromTwoDuplicatedArrays lostElementFromTwoDuplicatedArrays =
				new LostElementFromTwoDuplicatedArrays();
		int[] a = new int[]{1,2,4,5,6};
		int[] b = new int[]{1,2,3,4,5,6};
		int lostElement = 
				lostElementFromTwoDuplicatedArrays.lostElementFromArrays(a, b);
		System.out.println(" Lost Element Between two Arrays is "+ lostElement);
	}

}
