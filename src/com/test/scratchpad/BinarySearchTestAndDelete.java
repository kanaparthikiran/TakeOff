/**
 * 
 */
package com.test.scratchpad;

/**
 * @author Kiran Kanaparthi
 *
 */
public class BinarySearchTestAndDelete {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BinarySearchTestAndDelete binarySearchTestAndDelete  = 
				new BinarySearchTestAndDelete();
		int[] elements = {1,2,3,4,5,6,9,10,20,30};
		boolean elementFound = 
				binarySearchTestAndDelete.findElement(elements,30,0,elements.length);
		
		System.out.println(" Element Search for Element "+ elementFound);

	}
	
	
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private boolean findElement(int [] elements,int element, int start, int end) {
		int middle = (start+end)/2;
		while(start<end) {
			if(elements[middle]==element) {
				return true;
			} else if(elements[middle]>element) {
				return findElement(elements,element,start,middle-1);
			} else if(elements[middle]<element) {
				return findElement(elements,element,middle+1,end);
			} else {
				return false;
			}
		}
		return false;
	}

}
