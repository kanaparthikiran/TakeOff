package com.datastructures.string;

/**
 * 
 * @author kkanaparthi
 * 
 * This class finds the First Non Repeated
 * Character.
 * Initially a new Array is built to calculate
 * all the character counts.
 *
 */
public class FirstNonRepeatedCharacter {

	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private int[] getArrayWithCounts(String input) {
		int [] charCountArray = new int[26];
		for(int i=0;i<input.length();i++) {
			charCountArray[input.charAt(i)-'a']++;
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
					" arrayWithCharCounts[input.charAt(i)] "+
					arrayWithCharCounts[input.charAt(i)-'a']);
			if(arrayWithCharCounts[input.charAt(i)-'a']==1) {
				return input.charAt(i);
			}
		}
		}
		return elem;
	}
	
	
	
	public static void main(String a[]) {
		FirstNonRepeatedCharacter firstNonRepeatedCharacter = 
				new FirstNonRepeatedCharacter();
		char c = firstNonRepeatedCharacter.firstNonRepeatedChar("abb");
		System.out.println(" First Non Repeated Character "+ c);
		
		char nonRepPractice = firstNotRepeatingCharacter("abacc");
		
		System.out.println(" nonRepPractice "+ nonRepPractice);

	}

	
    private static char firstNotRepeatingCharacter(String s) {
        char[] validationArray = new char[128];
        char returnValue  = ' ';
        if(!s.isEmpty()) {
            for(int i=0;i<s.length();i++) {
                validationArray[s.charAt(i)]++;
            }
        }
        
            for(int i=0;i<s.length();i++) {
                if(validationArray[s.charAt(i)]==1) {
                    return s.charAt(i);
                }
            }
           return returnValue;   
    } 
    
    
	private int[] getCharCountArrayA(String input) {
		int [] resultArray = new int[128];
		if(input!=null && input.length()>0) {
			for(int i=0;i<input.length();i++) {
				resultArray[input.charAt(i)]++;
			}
		}
		return resultArray;
	}
	
	
}


