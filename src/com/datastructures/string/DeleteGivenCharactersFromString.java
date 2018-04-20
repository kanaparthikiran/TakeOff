/**
 * 
 */
package com.datastructures.string;

/**
 * @author Kiran Kanaparthi
 * 
 * This class deletes the given characters from a Given String
 * 
 * It follows the approach to create a boolean buffer to 
 * store the to be deleted characters.
 * 
 * Use the created buffer while iterating through the elements of 
 * the original input array, if the given character is not 
 * found, then only add that character to a newly created String
 * Otherwise(If the character is part of the deleted chars set) ignore.
 *
 */
public class DeleteGivenCharactersFromString {

	/**
	 * 
	 * @param charsToDelete
	 * @return
	 */
	private boolean[] createCharArrayToDelete(char[] charsToDelete) {
		boolean[] charOrrurances = new boolean[128];
		if(charsToDelete!=null && charsToDelete.length>0) {
			for(char c: charsToDelete) {
				charOrrurances[c]=true;
			}
		}
		return charOrrurances;
	}
	
	

	/**
	 * 
	 * @param input
	 * @param charsToDelete
	 * @return
	 */
	private String deleteChars(String input,char[] charsToDelete)  {
		StringBuilder modifiedString = new StringBuilder();
		if(input!=null && charsToDelete!=null &&
				charsToDelete.length>0) {
			boolean[] charArrayToDelete =
					createCharArrayToDelete(charsToDelete);
			for(int  i=0;i<input.length();i++) {
				if(!charArrayToDelete[input.charAt(i)]==true) {
					modifiedString.append(input.charAt(i));
				}
			}
		} else {
			return input;
		}
		
		return String.valueOf(modifiedString);
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		DeleteGivenCharactersFromString deleteCharsFromInput  =
				new DeleteGivenCharactersFromString();
		String input ="welcome";
		char[] charsToDelete = new char[] {'a','e','i','o','u'};
		String deletedString = 
				deleteCharsFromInput.deleteChars(input, charsToDelete);
		System.out.println(" The Modified Data is "+deletedString);
	}

}
