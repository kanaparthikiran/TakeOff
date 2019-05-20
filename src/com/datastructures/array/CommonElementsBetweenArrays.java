/**
 * 
 */
package com.datastructures.array;

/**
 * @author kkanaparthi
 *
 */
public class CommonElementsBetweenArrays {



	
	private void printCommonElements(int[] a,int[]b) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<b.length;j++) {
				if(a[i]==b[j]) {
					System.out.println("Element matched "+a[i]);
				} else {
			//		System.out.println(" The Element is Not matched ");
				}
			}
		}
	}
	
	
	private static int square(int num)
	{
		int result = 0;
		for(int i=0;i<num;i++) {
			result+=num;
		}
		return result;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CommonElementsBetweenArrays commonElementsBetweenArrays =
				new CommonElementsBetweenArrays();
		int []a = new int[]{1,2,3,4,10,6};
		int []b = new int[]{5,2,3,6};
		commonElementsBetweenArrays.printCommonElements(a, b);
		System.out.println(" Square of the number is "+ square(10));
	}

}
