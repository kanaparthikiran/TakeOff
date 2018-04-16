/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class PalindromePermutationStrings {

	
	
	/**
	 * This method builds the Character Frequency
	 * 
	 * @param input
	 * @return
	 */
	private int[] getCharFrequency(String input) {
		int[] charFrquency = new int[128];
		for(int i=0;i<input.length();i++) {
			charFrquency[input.charAt(i)]++;
		}
		return charFrquency;
	}
	
	/**
	 * This method checks if the given two Strings are 
	 * Palindrome Permutations
	 * 
	 * @return
	 */
	private boolean arePalindromePermutations(String input) {
		boolean palindromePermutations = true;
		int oddCharCount = 0;
		if(input!=null) {
			int[] charFrquencyInput = getCharFrequency(input);
			for(int i=0;i<input.length();i++) {
				if(charFrquencyInput[input.charAt(i)]%2==1) {
					oddCharCount++;
				}
			}
		} else {
			return false;
		}
		System.out.println("  oddCharCount "+oddCharCount);
		if(oddCharCount==1) {
			palindromePermutations = true;
		} else {
			palindromePermutations = false;
		}
		return palindromePermutations;
	}
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PalindromePermutationStrings palindromePermutationStrings = new
				PalindromePermutationStrings();
		String input ="bab";
		boolean isPalindromePermutation =
				palindromePermutationStrings.arePalindromePermutations(input);
		System.out.println(" The Given Two Strings are"
				+ " Palindrome Permutations "+ isPalindromePermutation);
	}

}
