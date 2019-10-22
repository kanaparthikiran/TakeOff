/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class MoveNegativesToBeginning {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] data = new int[] {1,5,6,-1,7,8,-2,6,-9};
		System.out.println(" After Shifting "+Arrays.toString(data));
		MoveNegativesToBeginning mover = new MoveNegativesToBeginning();
		System.out.println(" Response is "+ 
				Arrays.toString(mover.moveNegative(data)));
	}

	private int[] moveNegative(int[] data) {
		int leftPointer = 0;
		int rightPointer = data.length-1;
		while(true) {
			while(data[leftPointer]<0 && leftPointer<rightPointer) {
				leftPointer++;
			}
			while(data[rightPointer]>0 && leftPointer<rightPointer) {
				rightPointer--;
			}
			if(leftPointer<rightPointer) {
				int temp = data[leftPointer];
				data[leftPointer] = data[rightPointer];
				data[rightPointer] = temp;
			} else {
				break;
			}
		}
		return data;
	}
}
