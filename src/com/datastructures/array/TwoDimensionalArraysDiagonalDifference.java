/**
 * 
 */
package com.datastructures.array;

/**
 * @author kirank1
 *
 */
public class TwoDimensionalArraysDiagonalDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][]  array  =  {  {  1,  0, 12, -1 },
                {  7, -3,  2,  5 },
                { -5, -2,  2, -9 },
                { -5, 8,  6, -20 }
             };
		int diagonalDifference = printTwoDimensionalArrays(array);
		System.out.println(" diagonalDifference  "+ diagonalDifference);
	}
	
	

	/**
	 * 
	 * @param array
	 * @return
	 */
	private static int printTwoDimensionalArrays(int[][] array) {
		int firstDiagonalSum = 0;
		int secondDiagonalSum = 0;

		if(array!=null && array.length>0) {
			for(int i=0,j=array.length-1;i<array.length&&j>=0;i++,j--) {
				firstDiagonalSum +=array[i][i];
				secondDiagonalSum +=array[i][j];
			}
		}
		return Math.abs(secondDiagonalSum-firstDiagonalSum);
	}
	
	

}
