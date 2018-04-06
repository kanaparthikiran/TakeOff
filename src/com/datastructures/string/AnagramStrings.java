/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class AnagramStrings {


	/**
	 * This method checks if the given Strings are 
	 * Palindrome Permutations
	 * @return
	 */
	private boolean checkPalindromePermutations(String input1,String input2) {
		boolean permutations = true;
		if(input1!=null && input2.length()>0) {
			if(input1.length()!=input2.length()) {
				return false;
			} else {
				int [] letters = new int[128];
				
				for(int i=0;i<input1.length();i++) {
					letters[input1.charAt(i)]++;
				}
				
				for(int i=0;i<input2.length();i++) {
					letters[input1.charAt(i)]--;
					if(letters[input1.charAt(i)]<0) {
						return false;
					}
				}
			}
		}
		return permutations;
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

		AnagramStrings palindromePermutationStrings = new
				AnagramStrings();
		boolean palindromePermutations =
				palindromePermutationStrings.checkPalindromePermutations("hello","aelloh");
		System.out.println(" The Given Two Strings are Palindrome Permutations "
				+palindromePermutations);
	}

}
