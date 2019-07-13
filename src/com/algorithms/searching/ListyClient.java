/**
 * 
 */
package com.algorithms.searching;
/**
 * @author kkanaparthi
 *
 */
class Listy {
	int capacity = 10;
	int[] data = null;
	
	public Listy(int[] data) {
		this.data = data;
	}
	
	public int getElementAt(int positon) {
		if(positon>=data.length-1){
			return -1;
		}
		return data[positon];
	}
}

public class ListyClient  {
	public static void main(String args[]) {
		Listy listy = new Listy(new int[] {1,3,5,8,9,6});
		int search = 1;
		int position = 1;
		while(listy.getElementAt(position)!=-1 
				&& listy.getElementAt(position)<search) {
			position = position * 2;
		}
		int result = binarySearch(listy, position/2,position,search);	
		System.out.println("The position of the element is "+result);
	}
	
	/**
	 * 
	 * @param listy
	 * @param start
	 * @param end
	 * @param element
	 * @return
	 */
	private static int binarySearch(Listy listy,int start,int end,int element) {
		if(start>end) {
			return -1;
		}
		int middle = start+(end-start)/2;
		if(listy.getElementAt(middle)>element) {
			return binarySearch(listy, start, middle-1, element);
		} else if(listy.getElementAt(middle)<element) {
			return binarySearch(listy, middle+1, end, element);	
		} else {
			return middle;
		}
	}
}
