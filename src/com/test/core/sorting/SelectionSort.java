/**
 * 
 */
package com.test.core.sorting;

/**
 * This class does the selection Sort of elements of an Array
 * 
 * @author kkanaparthi
 *
 */
public class SelectionSort  {

	/**
	 * 
	 */
	public SelectionSort() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SelectionSort selectionSort = new SelectionSort();
		int[]inArray = new int[]{3,4,1,5,10,9,8};
		System.out.println("\n\n Before Sorting the Elements ");
		for(int inArrayElem : inArray) {
			System.out.print(inArrayElem+" ");
		}
		inArray = selectionSort.sortElements(inArray);

		System.out.println("\n\n After Sorting the Elements ");

		for(int inArrayElem : inArray) {
			System.out.print(inArrayElem+" ");
		}
	}

	
	
	
	private int[] sortElements(int input[]) {
		System.out.println("\n \n");

		for(int i=0;i<input.length;i++) {
			int minIndex = i; 
			//System.out.println("Minimum element in the Iteration "+" and i is "+i+ " "+input[i]);
			
			for(int j=i+1;j<input.length;j++) {
				if(input[j] <input[minIndex]) {
//					System.out.println(" Swapping needed in this Iteration i "
//							+ " "+i+ " "+input[i]+"  j "+j+ " "+input[j]+"  minElement "+minIndex);
					int temp = input[j];
					input[j] =input[minIndex];
					input[minIndex] = temp;
					
					minIndex = j;
					
					System.out.println(" min element decided is "+ input[minIndex]);
					
				} else {
					System.out.println("There is No Swapping needed in this Iteration"
							+" input[i]  "+input[i]+" input[j] "+input[j] );
				}
			}
			
			System.out.println("\n\n\n AFTER EACH ITERATION ELEMENTS ARE AS FOLLOWS\n\n\n");
			
			for(int inArrayElem : input) {
				System.out.print(inArrayElem+" ");
			}
			System.out.println("\n\n\n");
		}
		return input;
	}
	
	

}
