/**
 * 
 */
package com.datastructures.string;

import java.util.HashSet;
import java.util.Set;

/**
 * @author kkanaparthi
 *
 */
public class LongestSubstringWithoutRepeatingChars {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int response = 
				longestSubWithoutRepeat("abacad");
		System.out.println(" Response is "+response);
	}
	
	private static int longestSubstringwithoutRepeatingChars(String input) {
		int maxLength = 0;
		int  i = 0;
		int j = 0;
		Set<Character> data = new HashSet<>();
		while(j<input.length()) {
			if(!data.contains(input.charAt(j))) {
				data.add(input.charAt(j));
				j++;
				maxLength = Math.max(maxLength, j-i);
			} else {
				data.remove(input.charAt(i));
				i++;			
			}
		}
		return maxLength;
	}

	
	private static int longestSubWithoutRepeat(String input) {
		int i = 0;
		int j = 0;
		int maxLength = 0;
		Set<Character> data = new HashSet<>();
		while(j<input.length()) {
				if(!data.contains(input.charAt(j))) {
					data.add(input.charAt(j));
					j++;
					maxLength = Math.max(maxLength,j-i);
				} else {
					data.remove(input.charAt(i));
					i++;
				}
		}
		
		return maxLength;
	}
}
