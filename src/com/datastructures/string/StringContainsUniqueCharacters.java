/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class StringContainsUniqueCharacters {

	/**
	 * 
	 * @return
	 */
	private boolean isUniqueCharString(String input) {
		boolean[] asciiCharArray = new boolean[128];
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				if(asciiCharArray[input.charAt(i)]) {
					return false;
				}
				asciiCharArray[input.charAt(i)] = true;
			}
		}
		return true;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		StringContainsUniqueCharacters stringContainsUniqueCharacters = new
				StringContainsUniqueCharacters();
		boolean isUniqueCharResponse =
				stringContainsUniqueCharacters.isUniqueCharString("abc");
		System.out.println(" isUniqueCharResponse is "+isUniqueCharResponse);
	}

}
