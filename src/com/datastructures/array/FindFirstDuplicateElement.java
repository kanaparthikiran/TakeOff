/**
 * 
 */
package com.datastructures.array;

/**
 * @author kirank1
 *
 */
public class FindFirstDuplicateElement {

	/**
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		FindFirstDuplicateElement findFirstDuplicateElement = new FindFirstDuplicateElement();
		int elements[] = new int[] {2, 1, 3, 5, 2, 3};
		int firstDuplicate = 
				findFirstDuplicateElement.findFirstDuplicateNumber(elements);
		System.out.println(" firstDuplicate  "+firstDuplicate);
	}
	
	
	/**
	 * 
	 * @param elements
	 * @return
	 */
	private int findFirstDuplicateNumber(int[] elements) {
		int firstDuplicate  = -1;
		if(elements!=null && elements.length>0) {
			for(int element : elements) {
				if(elements[Math.abs(element)-1]<0) {
					return Math.abs(element);
				} else {
					elements[Math.abs(element)-1] *= -1; 
				}
			}
		}
		return firstDuplicate;
	}
}
