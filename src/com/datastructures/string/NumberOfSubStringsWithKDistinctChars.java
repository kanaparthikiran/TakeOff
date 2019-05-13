/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class NumberOfSubStringsWithKDistinctChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int response = numberOfSubStrings("aba",2);
		System.out.println(" Response is "+response);
		
	}

	private static int numberOfSubStrings(String input,int k) {
		int count = 0;
		if(input!=null && input.length()>0) {
			char contents[] = new char[26];
			for(int i=0;i<input.length();i++) {
				int distinctCount = 0;
				for(int j=0;j<input.length();j++) {
					if(contents[input.charAt(j)-'a']==0) {
						distinctCount++;
					}
					if(distinctCount==k) {
						count++;
					}
				}
			}
		}
		return count;
	}
}
