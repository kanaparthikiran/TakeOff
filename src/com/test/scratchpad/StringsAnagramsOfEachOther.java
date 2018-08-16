/**
 * 
 */
package com.test.scratchpad;

import java.util.Arrays;

/**
 * @author Kiran Kanaparthi
 *
 */
public class StringsAnagramsOfEachOther {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1  = "apple";
		String s2  = "pplea";
		StringsAnagramsOfEachOther stringsAnagramsOfEachOther =  new 
				StringsAnagramsOfEachOther();
		boolean areAnagrams = stringsAnagramsOfEachOther.areAnagrams(s1, s2);
		System.out.println(" The Two Inputs are Anagrams of Each Other  "+ areAnagrams);
		
	}

	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private boolean areAnagrams(String s1,String s2) {
		boolean anagrams = true;
		if(s1!=null && s2!=null && s1.length()>0 && s2.length()>0) {
			if(s1.length()!=s2.length()) {
				return false;
			}
			int[] charElements = new int[128];
			for(char c: s1.toCharArray()) {
				charElements[c]++;
				System.out.println("First Loop  charElements[c]  "+ charElements[c]
						+"  character  "+c+"  int value " +(int)c);
			}
			
			System.out.println(" Char Elements "+ Arrays.toString(charElements));
			for(char c: s1.toCharArray()) {
				charElements[c]--;
				System.out.println(" Second Loop charElements[c]  "+ charElements[c]+" character  "+c);

				if(charElements[c]<0) {
					return false;
				}

			}
		}
		return anagrams;
	}
	
}
