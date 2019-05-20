/**
 * 
 */
package com.datastructures.array.matrix;

/**
 * @author kkanaparthi
 *
 */
public class RotateMatricInplace {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[][] matrix = new int[][] {
			   {1,  2,  3,  4},
			   {5,  6,  7,  8},
			   {9,  10, 11, 12},
			   {13, 14, 15, 16}
		};
		System.out.println(" Matrix Before rotation ");
		printMatrix(matrix);
		int[][] rotatedMatrix = rotateMetrix(matrix);
		System.out.println("Matrix After rotation ");
		printMatrix(rotatedMatrix);
	}

	private static int[][] rotateMetrix(int[][] matrix) {
		int length = matrix.length-1;
		for(int i=0;i<length/2;i++) {
			for(int j=i;j<length-i;j++) {
				//coordinate 1
				int p1 = matrix[i][j];
				//coordinate 2
				int p2 = matrix[j][length-i];
				//coordinate 3
				int p3 = matrix[length-i][length-j];
				//coordinate 4
				int p4 = matrix[length-j][i];
				
				//Swap values of 4 coordinates
				matrix[j][length-i] = p1;
				matrix[length-i][length-j] = p2;
				matrix[length-j][i] = p3;
				matrix[i][j] = p4;
				
			}
		}
		return matrix;
	}
	
	private static void printMatrix(int[][] matrix) {
		if(matrix!=null && matrix.length>0) {
			for(int i=0;i<matrix.length;i++) {
				for(int j=0;j<matrix[0].length;j++) {
					System.out.print(" " +matrix[i][j]);
				}
				System.out.println();
			}
		}
	}
}
