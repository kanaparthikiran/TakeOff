package com.datastructures.string;

public class FirstNonRepeatedCharacter {

	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] getArrayWithCounts(String input) {
		int [] charCountArray = new int[128];
		for(int i=0;i<input.length();i++) {
			charCountArray[input.charAt(i)]++;
		}
		return charCountArray;
	}
	/**
	 * 
	 * @param input
	 * @return
	 */
	private char firstNonRepeatedChar(String input) {
		char elem = ' ';
		if(input!=null && input.length()>0) {
		int [] arrayWithCharCounts = getArrayWithCounts(input);
		for(int i=0;i<input.length();i++)  {
			System.out.println("input.charAt(i) "+input.charAt(i)+
					" arrayWithCharCounts[input.charAt(i)] "+arrayWithCharCounts[input.charAt(i)]);
			if(arrayWithCharCounts[input.charAt(i)]==1) {
				return input.charAt(i);
			}
		}
		}
		return elem;
	}
	
	
	public static void main(String a[]) {
		FirstNonRepeatedCharacter firstNonRepeatedCharacter = new FirstNonRepeatedCharacter();
		char c = firstNonRepeatedCharacter.firstNonRepeatedChar("abb");
		System.out.println(" First Non Repeated Character "+ c);
	}
}