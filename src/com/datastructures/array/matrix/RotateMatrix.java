/**
 * 
 */
package com.datastructures.array.matrix;

import java.util.Arrays;


/**
 * @author Kiran
 * 
 * This class rotates the Matrix by 90 degrees
 * Since the rotation has to be done in place, 
 * the rotation can be done by rotating the sides
 * one by one
 *
 */
public class RotateMatrix {


	/**
	 * 	
	//1 2 3
	//4 5 6
	//7 8 9
	 * @param elements
	 * @return
	 */
	private int[][] rotateMatrix(int[][] elements) {
		for(int layer=0;layer<elements.length/2;layer++) {
			int first = layer;
			int last = elements.length-1-layer;
			System.out.println(" first  "+ first+" last "+last);
			for(int i=first;i<last;i++) {
				int offset = i-first;
				//save top
				int top = elements[first][i];
				
				System.out.println(" offset "+offset+" top "+top);

				//left to top
				elements[first][i] = elements[last-offset][first];
				
				System.out.println(" elements[last-offset][first] "+
				elements[last-offset][first]+"  elements[last][last-offset] "
						+ elements[last][last-offset]);

				//bottom to left
				 elements[last-offset][first] = elements[last][last-offset];
				 
				 //right to bottom
				 elements[last][last-offset] = elements[i][last];
				 
				 //top to right
				 elements[i][last] = top;
			}
		}
		return elements;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		RotateMatrix rotateMatrix = new RotateMatrix();
		int[][] elements = new int[][] {
			{1,2,3},{4,5,6},{7,8,9}
		};
		
		System.out.println(" Before Rotation ");
		for(int i=0;i<elements.length;i++) {
			System.out.println(Arrays.toString(elements[i])
			);
		}
		
		int[][] rotatedMatrix = 
				rotateMatrix.rotateMatrix(elements);

		System.out.println(" After Rotation ");
		for(int i=0;i<rotatedMatrix.length;i++) {
			System.out.println(Arrays.toString(rotatedMatrix[i])
			);
		}
	}

	

}
