/**
 * 
 */
package com.datastructures.array;

/**
 * @author Kiran Kanaparthi
 * 
 * This class handles the Max Sum Subsequence Algorithm
 *
 */
public class MaxSumSubArrayKadanesAlgorithm {


	/**
	 * This method returns max Sum SubArray
	 * @param a
	 * @return
	 */
	private int maxSumSubArray(int a[]) {
		int maxSumSoFar = 0;
		int maxEndingHere = 0;
		if(a!=null && a.length>0) {
			for(int i=0;i<a.length;i++) {
				maxEndingHere = maxEndingHere+a[i];
				if(maxEndingHere<0) {
					maxEndingHere = 0;
				} else if(maxSumSoFar<maxEndingHere) {
					maxSumSoFar = maxEndingHere;
				}
			}
		}
		return maxSumSoFar;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		MaxSumSubArrayKadanesAlgorithm maxSumSubArrayKadanesAlgorithm =
				new MaxSumSubArrayKadanesAlgorithm();
		int[] max = new int[]{-2,-3,4,-1,-2,1,5,3,10};
		int maxSum = maxSumSubArrayKadanesAlgorithm.maxSumSubArray(max);
		System.out.println(" maxSum "+ maxSum);
	}

}
