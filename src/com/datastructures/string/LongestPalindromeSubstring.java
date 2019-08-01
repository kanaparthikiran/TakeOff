/**
 * 
 */
package com.datastructures.string;

import java.util.Arrays;
import java.util.BitSet;

/**
 * @author kkanaparthi
 *
 */
public class LongestPalindromeSubstring {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String input = "lclc";
		String response = 
				getLongestPalindromeSubstring(input);
		System.out.println(" Response is "+response);
		int firstUniqueChar = 
				firstUniqueChar("anorange");
		System.out.println(" First Unique Chars "+firstUniqueChar);
		int lpss = getLongestPalindromeSubSequence(input);
		System.out.println(" LPS length is "+lpss);		
	}

	
	private static int firstUniqueChar(String s) {
		int result = -1;
		int[] frequencyCount = new int[26];
		for(int i=0;i<s.length();i++) {
			frequencyCount[s.charAt(i)-'a']++;
		}
		System.out.println(Arrays.toString(frequencyCount));
		
		for(int i=0;i<s.length();i++) {
			if(frequencyCount[s.charAt(i)-'a']==1) {
				return i;
			}
		}
		return result;
	}
	/**
	 * 
	 * @param data
	 * @return
	 */
	private static String getLongestPalindromeSubstring(String data) {
		int length = data.length();
		if(data==null||length<2) {
			return data;
		}
		boolean[][] isPalindrome = new boolean[length][length];
		int left = 0;
		int right = 0;
		for(int j=1;j<length;j++) {
			for(int i=0;i<j;i++) {
				boolean isInnerPalindrome = isPalindrome[i+1][j-1] || j-i<=2;
				if(data.charAt(i) == data.charAt(j) && isInnerPalindrome) {
					isPalindrome[i][j] = true;
					if(j-i>right-left) {
						left = i;
						right = j;
					}
				}
			}
		}
		return data.substring(left,right+1);
	}
	
	
	/****
	 * 
	 * @param data
	 * @return
	 */
	private static int getLongestPalindromeSubSequence(String data) {
		if(data==null||data.length()<2) {
			return 0;
		}
		int n = data.length();
		int[][] palindrome = new int[n][n];
		//palindromes of size 1
		for(int i=0;i<n;i++) {
			palindrome[i][i] = 1;
		}
		
		for(int curr_len=2;curr_len<=n;curr_len++) {
			for(int i=0;i<n-curr_len+1;i++) {
				int j = i+curr_len-1;
				if(data.charAt(i)==data.charAt(j)) {
					palindrome[i][j] = palindrome[i+1][j-1]+2;
				} else {
					palindrome[i][j] = Math.max(palindrome[i+1][j], palindrome[i][j-1]);
				}
			}
		}
		return palindrome[0][n-1];
	}
	
	
}
