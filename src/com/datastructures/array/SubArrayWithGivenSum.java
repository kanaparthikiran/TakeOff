/**
 * 
 */
package com.datastructures.array;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 *
 */
public class SubArrayWithGivenSum {

	/**
	 * This method finds the SubArray
	 * with the given sum
	 * 
	 * @param elements
	 * @param sum
	 * @return
	 */
	private int[] subArrayWithSum(int elements[],int sum) {
		int[] subArray = new int[]{};
		if(elements!=null && elements.length>0) {
			Set<Integer> valuesSum = new HashSet<>();
			int currentSum = 0;
			int index = 0;
			for(int element:elements) {
				currentSum += element;
				index++;
				if(currentSum==sum) {
					subArray = new int[index];
					System.arraycopy(elements, 0, subArray, 0, index);
					return subArray;
				}
				if(valuesSum.contains(currentSum-sum)) {
					System.out.println(" Sub Array Present with the given sum "+ sum+" currentSum-sum "
							+(currentSum-sum)+"  currentSum "+currentSum);
				}
				valuesSum.add(element);
			}
		}
		return subArray;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SubArrayWithGivenSum subArrayWithGivenSum =
				new SubArrayWithGivenSum();
		int[] elements = new int[]{1,3,4,5,5,6};
		int sum = 19;
		int[] subArrayWithSum =
				subArrayWithGivenSum.subArrayWithSum(elements, sum);
		System.out.println(" Sub Array with Sum exists  "+Arrays.toString(subArrayWithSum));
	}

}
