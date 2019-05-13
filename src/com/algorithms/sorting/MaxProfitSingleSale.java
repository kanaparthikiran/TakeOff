/**
 * 
 */
package com.algorithms.sorting;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


/**
 * @author kkanaparthi
 *
 */
public class MaxProfitSingleSale {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] prices = new int[] {30,20,10,25,24,29,28};
		int maxProfit = maxProfit(prices);
		//int maxProfitLatest  = calculateMaxProfit(prices);
		int[] one = new int[] {1, 2, 4, 5, 6};
		int[] two = new int[] {2, 3, 5, 7};
		int mergedLength = (one.length-two.length>0)?one.length:two.length;
		int[] merged = new int[mergedLength];
		System.out.println(" Max Profit "+maxProfit+" maxProfitLatest ");
		System.out.println(" The merged array is "+ Arrays.toString(mergeArrays(one, two)));
		
		String reverse = "abcde";
		System.out.println(" Reverse of the string is "+reverseString(reverse));
		
		int[] allNumbers = new int[] {1,2,3,4,6};
		System.out.println(" Missing number is "+findMissingNumber(allNumbers));
		
		int[] data = new int[] {1,3,5,7,9,10};
		String revStr = revStr("N");
		System.out.println(" revStr "+revStr);
		Queue<Integer> queue = new LinkedList<>();
		queue.add(1);
		queue.add(2);
		queue.add(3);
		queue.add(4);
		System.out.println(" Original Queue is "+queue);

		reverseQueue(queue);
		System.out.println(" Reversed Queue is "+queue);
		
		Stack<Integer> stack = new Stack<>();
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		System.out.println(" Original Stack is "+stack);

		reverseStack(stack);
		System.out.println(" Reversed Stack is "+stack);

	}
	
	
	private static void reverseQueue(Queue queue) {
		if(queue.isEmpty()) {
			return;
		}
		Integer element = (Integer) queue.poll();
		reverseQueue(queue);
		queue.add(element);
	}
	
	private static void reverseStack(Stack stack) {
		if(stack.isEmpty()) {
			return;
		}
		Integer element = (Integer) stack.pop();
		reverseStack(stack);
		insertAtBottom(stack,element);
	}
	
	private static void insertAtBottom(Stack stack,int element) {
		if(stack.isEmpty()) {
			stack.push(element);
		} else {
			int poppedElement = (int) stack.pop();
			insertAtBottom(stack, element);
			stack.push(poppedElement);			
		}
	}
	
	private static int findMissingNumber(int[] elements) {
		int missingNumber = 0;
		int allSum = 0;
		int actualSum = 0;
		if(elements!=null && elements.length>0) {
			//int startElement = elements[0];
			for(int i=0;i<elements.length;i++) {
				allSum ^=elements[i];
			}
			for(int i=1;i<=6;i++) {
				actualSum ^= i;
			}
			
		}
		
		System.out.println(" allSum is "+allSum+" actualSum "+actualSum);
		
		return allSum^actualSum;
	}
	
	
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	private static String revStr(String rev) {
		char[] elements = rev.toCharArray();
		int length = elements.length;
		for(int i=0;i<length/2;i++) {
			elements[i] ^= elements[length-i-1];
			elements[length-i-1] ^= elements[i];
			elements[i] ^= elements[length-i-1];
		}
		return new String(elements);
	}
	
	private static String reverseString(String input) {
		String reverse = null;
		StringBuffer sb = new StringBuffer();
		char[] elements = input.toCharArray();
//		if(input!=null && input.length()>0) {
//			for(int i=0;i<elements.length/2;i++) {
//				elements[i] ^= elements[elements.length-1-i];
//				elements[elements.length-1-i] ^= elements[i];
//				elements[i] ^= elements[elements.length-1-i];
//			}
//		}
		int start = 0;
		int end = input.length()-1;
		while(start<end) {
			elements[start] ^= elements[end];
			elements[end] ^= elements[start];
			elements[start] ^= elements[end];
			start++;
			end--;
		}
		return new String(elements);
		
	}

	/**
	 * 
	 * @param one
	 * @param two
	 * @return
	 */
	private static int[] mergeArrays(int[]one , int[] two) {
		int merged [] = null;
		if(one!=null && one.length>0 && two!=null && two.length>0) {
			int mergedLength = (one.length-two.length>0)?one.length:two.length;

			merged = new int[one.length+two.length+1];
			int i =0;
			int j = 0;
			int mergedIndex = 0;
			int oneLength = one.length;
			int twoLength = two.length;
			int maxSize = oneLength-twoLength>0?oneLength:twoLength;
			
			while(i<one.length && j<two.length && mergedIndex<mergedLength) {
				if(one[i]<two[j]) {
					merged[mergedIndex] = one[i];
					i++;
					mergedIndex++;
				} else  if(one[i]>two[j]){
					merged[mergedIndex] = two[j];
					j++;
					mergedIndex++;
				} else {
					merged[mergedIndex] = one[i];
					i++;
					j++;
					mergedIndex++;
				}
			}
			System.out.println(" after iteration i "+i+" j "+j+" mergedIndex "+mergedIndex);
			while(i<one.length) {
				for(int a=i;a<one.length;a++) {
					merged[mergedIndex] = one[a];	
					mergedIndex++;
					i++;
				}
			}
			while(j<two.length) {
				for(int b=j;b<two.length;b++) {
					merged[mergedIndex] = two[b];
					mergedIndex++;
					j++;
				}
			}
		}
		return merged;
	}
	
	private static int maxProfit(int[] prices) {
		int maxProfit = 0;
		int minValue = 0;
		if(prices!=null && prices.length>0) {
			if(prices.length==1) {
				return 0;
			}
			if(prices.length>=2) {
				maxProfit = (prices[1]-prices[0])>0?(prices[1]-prices[0]):0;
				minValue = prices[0]>0?prices[0]:0;
				for(int i=1;i<prices.length;i++) {
					if(prices[i]-minValue>maxProfit) {
						maxProfit = prices[i]-minValue;
					}
					if(prices[i]<minValue) {
						minValue = prices[i];
					}
				}
			}
		}
		return maxProfit;
	}
	
	
}
