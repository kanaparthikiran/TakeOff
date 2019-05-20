/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class StringIsRotationOfAnotherString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(" Is Rotation  "+ 
				isRotation("waterbottle", "erbottlewat"));
		printSubsequences(new int[] {1,2,3}, 0, "");
	}

	
	   static void printSubsequences(int arr[], int index, String str) {
	        if (index >= arr.length) {
	            System.out.println("[" + str + "]");
	            return;
	        }
	        printSubsequences(arr, index + 1, str + arr[index]);
	        printSubsequences(arr, index + 1, str);
	    }
	   
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static boolean isRotation(String s1, String s2) {
		if(s1==null||s2==null) {
			return false;
		}
		String merged = new StringBuffer().append(s1).append(s1).toString();
		if(merged.contains(s2)) {
			return true;
		}
		return false;
	}
}
