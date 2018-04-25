/**
 * 
 */
package com.datastructures.string;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/**
 * @author Kiran Kanaparthi
 *
 */
public class PhoneNumbersKeyPadCombinations {

	
	/**
	 * 
	 * @param number
	 * @param wordList
	 * @return
	 */
	private ArrayList<String> getValidT9Words(String number, 
			HashSet<String> wordList) {
		ArrayList<String> results = new ArrayList<String>();
		getValidWords(number,0,"",wordList,results);
		return results;
	}


	/**
	 * 
	 * @param digit
	 * @return
	 */
	private char[] getT9Chars(char digit) {
		
		char[][] t9Letters = {null,null,{'a','b','c'},
				{'d','e','f'},{'g','h','i'},
				{'j','k','l'},{'m','n','o'},{'p','q','r','s'},
				{'t','u','v'},{'w','x','y','z'}};
		
		if(!Character.isDigit(digit)) {
			return null;
		} else {
			int dig = Character.getNumericValue(digit)-
					Character.getNumericValue('0');
			return t9Letters[dig];
		}
	}
	
	/**
	 * 
	 * @param number
	 * @param index
	 * @param prefix
	 * @param wordset
	 * @param results
	 */
	private void getValidWords(String number,int index,String prefix,
			HashSet<String> wordset,ArrayList<String> results) {
		//If it is a complete word, print it
		if(index==number.length() && wordset.contains(prefix)) {
			results.add(prefix);
			return;
		}
		
		//Get Characters that match the digit
		char digit = number.charAt(index);
		char[] letters = getT9Chars(digit);
		
		//Go through All the remaining options
		if(letters!=null) {
			for(char letter : letters) {
				getValidWords(number, index+1, 
						prefix+letter, wordset, results);
			}
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PhoneNumbersKeyPadCombinations phoneNumbersKeyPadCombinations =
				new PhoneNumbersKeyPadCombinations();
		List<String> allValidWords =
				phoneNumbersKeyPadCombinations.
				getValidT9Words("8733",new HashSet<String>());
		allValidWords.forEach(element->System.out.println(element+"  "));
		
	}

}
