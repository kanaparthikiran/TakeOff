/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;

/**
 * @author kkanaparthi
 *
 */
public class MinimumStepsToGetDesiredArray {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] desired = new int[] {5,2,4,5,9,6};
		int[] original = new int[] {0,0,0,0,0};
		int minSteps = getMinSteps(desired,original);
		System.out.println(" Minimum steps required to "
				+ "get the desired array "+minSteps);
	}

//	private int[] findOdds(int[] data) {
//		int [] oddIndices = new int[data.length];
//		if(data!=null && data.length>0) {
//			for(int i=0;i<data.length;i++) {
//				if(data[i]%2==0) {
//					oddIndices[i] =
//				}
//			}
//		}
//		return oddIndices;
//	}
	
	/**
	 * 
	 * @param source
	 * @param target
	 * @return
	 */
	private static int getMinSteps(int[] source,int [] target) {
		int result = 0;
		int zeroCount = 0;
		if(source!=null && source.length>0) {
			while(true) {
				for(int i=0;i<source.length;i++) {
					if(source[i]%2==1) {
						source[i] = source[i]%2;
						result++;
					} else {
						source[i] = (source[i]-1)%2;
						result++;
					}
				}
			}
		}
		return result;
	}
	
}
