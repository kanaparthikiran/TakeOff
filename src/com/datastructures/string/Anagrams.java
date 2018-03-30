/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 * 
 * This class is used to find if two
 * strings are anagrams of each other
 * 
 * It follows the approach of creating an array to 
 * store all the ASCII characters, and performs scan of
 * the elements in the given two strings one after the 
 * other, first by adding the characters and second pass 
 * by removing the characters, after both passes if any
 * character is remaining the strings are not anagrams.
 * 
 * The logic is based on the fact that characters and integers
 * are replaceable for each other in java
 *
 */
public class Anagrams {


	/**
	 * This method finds if the given two strings are 
	 * anagrams of each other
	 * 
	 * @return
	 */
	private boolean areAnagrams(String s1,String s2) {
		boolean areAnagrams = false;
		int[] asciiChars = new int[1<<8];//256
		
		if(s1!=null && s1.length()>0 && 
				s2!=null && s2.length()>0) {
			if(s1.length()==s2.length()) {
				for(char s1Elem : s1.toCharArray()) {
					asciiChars[s1Elem]++;
				}
				
				for(char s2Elem : s2.toCharArray()) {
					asciiChars[s2Elem]--;
				}
				
				for(int asciiCharsElem :  asciiChars) {
					if(asciiCharsElem!=0) {
						areAnagrams = false;
					} else {
						areAnagrams = true;
					}
				}
			}
		}
		return areAnagrams;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Anagrams anagrams = new Anagrams(); 
		String s1 = "12345";
		String s2 = "54312";
		boolean areAnagrams = anagrams.areAnagrams(s1, s2);
		System.out.println(" Are Anagrams Value is "+areAnagrams);
	}

}
