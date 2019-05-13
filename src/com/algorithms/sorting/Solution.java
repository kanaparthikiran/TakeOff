package com.algorithms.sorting;

public class Solution {
	/**
	 * 
	 * @param argh
	 */
	public static void main(String []argh) {
		int[] data = new int[] {1,3,5,7,9,10};
		int elementIndex = findElement(data,0,data.length,9);
		System.out.println(" Found the element "
				+ " at the index "+elementIndex);
    }
	
	/**
	 * 
	 * @param data
	 * @return
	 */
	private static int findElement(int[] data, int start, int end, int search) {
		if(data!=null && data.length>0) {
			int middle = start + (end -start)/2;
			if(data[middle]==search) {
				return middle;
			}
			if(data[middle]<search) {
				findElement(data, middle+1, end, search);
			} else {
				findElement(data, start, middle-1, search);
			}
		}
		return -1;
	}
}
