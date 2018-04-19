/**
 * 
 */
package com.datastructures.string;

/**
 * @author kkanaparthi
 *
 */
public class ReverseWordsOfAString {
	

	/**
	 * This method reverses the words of a Given 
	 * Sentence
	 * @return
	 */
	private String reverseWordsOfString(String sentence) {
		String reverse = null;
		StringBuffer sb = new StringBuffer();
		if(sentence!=null && sentence.length()>0) {
			String[] currentList = sentence.split("\\s");
				if(currentList!=null && currentList.length>0) {
					for(int i=currentList.length-1;i>=0;i--) {
						//String reversedElement = reverseString(currentList[i]);
						sb.append(currentList[i]+" ");
					}
				}
			}
		if(sb!=null) {
			reverse = sb.toString();
		}
		return reverse;
	}
	
	
	/**
	 * This method reverses the given String
	 */
	private String reverseString(String input) {
		if(input==null || input.length()==0) {
			return input;
		} else {
			return reverseString(input.substring(1))+input.charAt(0);
		}
	}
	
	private String reverseAString(String input) {
		if(input==null || input.length()==0) {
			return input;
		}
			return reverseAString(input.substring(1))+input.charAt(0);
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ReverseWordsOfAString reverseWordsOfAString = 
				new ReverseWordsOfAString();
		String inputSentence = "Do or do not, there is no try.";
		String response = 
				reverseWordsOfAString.reverseWordsOfString(inputSentence);
		System.out.println(" The response is "+ response);
	}

}
