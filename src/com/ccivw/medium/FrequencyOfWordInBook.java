/**
 * 
 */
package com.ccivw.medium;

/**
 * @author kkanaparthi
 *
 */
public class FrequencyOfWordInBook {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String book[] = new String[] {"hello","hi","one","two","three","hi","hi"};
		String word = "hi";
		int frequency = getFrequency(book, word);
		System.out.println(" Frequency of the word in the book "+frequency);
	}

	
	private static int getFrequency(String[] book, String word) {
		int result = 0;
		String trimmedWord = word.trim();
		if(book!=null && book.length>0) {
			for(String wordInBook : book) {
				if(wordInBook.trim().equalsIgnoreCase(trimmedWord)) {
					result++;
				}
			}
		}
		return result;
	}
}
