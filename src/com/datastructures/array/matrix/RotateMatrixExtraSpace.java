/**
 * 
 */
package com.datastructures.array.matrix;

/**
 * @author kkanaparthi
 * 
 * This class rotates the given 2d matrix by 90 degrees using extra space.
 * New Matrix is created and the existing data is copied into the 
 * new matrix.
 *
 */
public class RotateMatrixExtraSpace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = {
				{1,2,3,4},
				{5,6,7,8},
				{9,10, 11,12},
				{13,14,15,16},
				{17,18,19,20}
		};
		System.out.println(" Before Rotation ");
		printMatrix(matrix);
		int[][] clockWise = rotateClockwise(matrix);
		System.out.println(" After Right Rotation ");
		printMatrix(clockWise);
		int[][] counterClockMatrix = rotateCounterClockwise(matrix);
		System.out.println(" After Left Rotation ");

		printMatrix(counterClockMatrix);
	}

	private static int[][] rotateClockwise(int[][] data) {
		int totalRowsOfRotatedMatrix = data[0].length;
		int totalColumnsOfRotatedMatrix = data.length ;
		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix]
				[totalColumnsOfRotatedMatrix];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				rotatedMatrix[j][totalColumnsOfRotatedMatrix-1-i] = data[i][j];
			}
		}
		return rotatedMatrix;
	}
	
	private static int[][] rotateCounterClockwise(int[][] data) {
		int totalRowsOfRotatedMatrix = data[0].length;
		int totalColumnsOfRotatedMatrix = data.length ;
		int[][] rotatedMatrix = new int[totalRowsOfRotatedMatrix]
				[totalColumnsOfRotatedMatrix];
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				rotatedMatrix[totalRowsOfRotatedMatrix-1-j][i] = data[i][j];
			}
		}
		return rotatedMatrix;
	}
	
	private static void printMatrix(int[][] data) {
		for(int i=0;i<data.length;i++) {
			for(int j=0;j<data[0].length;j++) {
				System.out.print(" "+data[i][j]);
			}
			System.out.println();
		}
	}
}
