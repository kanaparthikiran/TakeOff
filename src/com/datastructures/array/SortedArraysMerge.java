/**
 * 
 */
package com.datastructures.array;

/**
 * @author Kiran Kanaparthi
 * 
 * This class merges the elements the two sorted
 * Arrays of UnEqual Sizes.
 * 
 * The Smaller Array elements are merged in to the 
 * Bigger Array., the Bigger Array has space to accommodate the
 * Smaller Array Elements in the End.
 * 
 * Traverse both the Arrays from the End, and Compare the Elements
 * one by One, if the Element of Smaller Array is more than the
 * Bigger Array,Copy the Smaller Array Element in the Combined Array
 * and Move the Cursor to the next Element of Smaller Array.
 * If the Element of the Bigger Array is more than the Element at the
 * Smaller Array, Assign the element of the Big Array to the Combined
 * Array, and move the Cursor of the Big Array by one.
 * 
 *
 */
public class SortedArraysMerge {

	
	/**
	 * This method merges the elements of the Small Array
	 * and Big Array
	 * 
	 * @param elements
	 * @return
	 */
	private int[] mergeSortedArrays(int[] elementsBig,int[] elementsSmall,
			int smallElementLast,int bigElementLast) {
		
		if(elementsBig!=null && elementsBig.length>0 &&
				elementsSmall!=null && elementsSmall.length>0) {
			int elementSmallIndex = elementsSmall.length-1;
			int elementBigIndex = bigElementLast-1;
			int mergedArrayIndex = elementSmallIndex+elementBigIndex-1;
			
			System.out.println("  elementSmallIndex  "+elementSmallIndex
					+" elementBigIndex "+elementBigIndex
					+" mergedArrayIndex "+mergedArrayIndex);
			while(elementSmallIndex>=0) {
				if(elementBigIndex>=0 && 
						elementsBig[elementBigIndex]>elementsSmall[elementSmallIndex]) {
					System.out.println("111  mergedArrayIndex "+
						mergedArrayIndex
							+"  elementBigIndex "+elementBigIndex
							+" elementsBig[elementBigIndex] "+
							elementsBig[elementBigIndex]+" "
							+ " elementsSmall[elementSmallIndex]  "+
							elementsSmall[elementSmallIndex]);

					elementsBig[mergedArrayIndex] = elementsBig[elementBigIndex];
					elementBigIndex--;
				} else 
					if(elementSmallIndex>=0 && mergedArrayIndex>=0 &&
						elementsSmall[elementSmallIndex]>elementsBig[elementBigIndex])
				{
						System.out.println("2222  mergedArrayIndex "+mergedArrayIndex
								+"  elementBigIndex "+elementBigIndex
								+" elementsBig[elementBigIndex] "+
								elementsBig[elementBigIndex]+" "
								+ " elementsSmall[elementSmallIndex]  "+
								elementsSmall[elementSmallIndex]);

					elementsBig[mergedArrayIndex] = elementsSmall[elementSmallIndex];
					elementSmallIndex--;
				}
				
				mergedArrayIndex--;
			}
		}
		return elementsBig;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SortedArraysMerge sortedArraysMerge =
				new SortedArraysMerge();
		int[] elementsBig = new int[] {3,4,5,8,9,0,0,0};
		int [] elementsSmall = new int[] {1,7,6};
		int bigArrayIndex = 5;
		int smallArrayIndex = 3;
		int[] mergedArray = 
				sortedArraysMerge.mergeSortedArrays(elementsBig, elementsSmall,bigArrayIndex,smallArrayIndex);
		
		if(mergedArray!=null && mergedArray.length>0) {
			for(int element : mergedArray) {
				System.out.print(element+" ");
			}
		}
	}

}
