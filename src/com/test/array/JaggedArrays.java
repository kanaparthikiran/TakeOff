/**
 * 
 */
package com.test.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 * 
 * JaggedArrays are the Arrays with the member arrays of
 * different sizes, The 2-D Arrays with variable number of 
 * columns
 * 
 */
public class JaggedArrays {

	/**
	 * 
	 */
	private void printJaggedArrays(int a[][])  {
		if(a!=null && a.length>0) {
			for(int i=0;i<a.length;i++) {
				System.out.println(Arrays.toString(a[i]));
			}
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[][] = new int[3][2];
		array[0] = new int[]{1,2,3};
		array[1] = new int[]{4,5};
		
		JaggedArrays jaggedArrays = new JaggedArrays();
		jaggedArrays.printJaggedArrays(array);
		
	}

}
