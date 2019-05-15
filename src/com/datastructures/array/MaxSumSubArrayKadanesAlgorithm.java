/**
 * 
 */
package com.datastructures.array;

import java.util.LinkedList;
import java.util.Queue;

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

	
	private int maxSum(int a[]) {
		int maxSum = 0;
		int maxSumSoFar = 0;
		for(int i=0;i<a.length;i++) {
			maxSumSoFar += a[i];
			if(maxSumSoFar<0) {
				maxSumSoFar = 0;
			}
			if(maxSumSoFar>maxSum) {
				maxSum = maxSumSoFar;
			}		
		}
		return maxSum;
	}
	
	private  static void reverseQueue(Queue<Integer> input) {
		if(input==null || input.isEmpty()) {
			return;
		}
		Integer element = input.poll();
		reverseQueue(input);
		input.add(element);
	}
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		MaxSumSubArrayKadanesAlgorithm maxSumSubArrayKadanesAlgorithm =
				new MaxSumSubArrayKadanesAlgorithm();
		int[] max = new int[]{-2,-3,4,-1,-2,1,5,3,10};
		int maxSum = maxSumSubArrayKadanesAlgorithm.maxSum(max);
		System.out.println(" maxSum "+ maxSum);
		Queue<Integer> input = new LinkedList<>();
		input.add(1);
		input.add(2);
		input.add(3);
		input.add(4);
		input.add(5);
		System.out.println(" Before Reveersal "+ input);
		reverseQueue(input);
		System.out.println(" After Reveersal "+ input);

	}

}
