/**
 * 
 */
package com.test.scratchpad;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Kiran Kanaparthi
 *
 */
public class PermutationsOfAString {
	
	
	
	private int gcd(int a, int b) {
		if(b==0) {
			return a;
		} else {
			return gcd(b,a%b);
		}
	}
	

	
	/**
	 * 
	 * @return
	 */
	private List<String> getAllPermutations(String input,
			String prefix,String suffix,
			List<String> allPermutations) {
		if(suffix!=null && suffix.length()==0) {
			allPermutations.add(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String element = suffix.substring(0, i)+
						suffix.substring(i+1,suffix.length());
				getAllPermutations(input,
						prefix+suffix.charAt(i),
						element, allPermutations);
			}
		}
	return allPermutations;	
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String getReverseOfAString(String input)  {
		String reversedString = null;
		if(input!=null) {
			if(input.length()==0) {
				return input;
			} else {
				reversedString =
						getReverseOfAString
						(input.substring(1))+input.charAt(0);
			}
		}
		return reversedString;
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String reverseArrayUsingCharArray(String input) {
		char[] arrayOfChars = null;
		if(input!=null && input.length()>0) {
			arrayOfChars = input.toCharArray();
			for(int i =0;i<arrayOfChars.length/2;i++) {
				char temp = arrayOfChars[i];
				arrayOfChars[i] = arrayOfChars[arrayOfChars.length-1-i];
				arrayOfChars[arrayOfChars.length-1-i] = temp;
			}
		}
		return String.valueOf(arrayOfChars);
	}
	
	/**
	 * 
	 * @param number
	 * @return
	 */
	private String convertDecimalToBinary(int number) {
		StringBuilder binaryNumber = new StringBuilder();
		while(number>0) {
			int binaryRemainder = number%2;
			binaryNumber.append(binaryRemainder);
			number = number/2;
		}
		return String.valueOf(binaryNumber.reverse());
	}
	
	/**
	 * 
	 * @param input
	 * @return
	 */
	private String compressString(String input)  {
		StringBuilder compressedString = new StringBuilder();
		if(input!=null && input.length()>0) {
			int count = 0;
			for(int i=0;i<input.length();i++) {
				count++;
				if(((i+1)>=input.length()) ||
						input.charAt(i)!=input.charAt(i+1)) {
					compressedString.append
					(input.charAt(i)).append(count);
					count = 0;
				}
			}
		}
		return String.valueOf(compressedString);
	}
	
	
	/**
	 * 
	 * @param input
	 */
	private void printRepeatingElements(int[] input) {
		if(input!=null && input.length>0) {
			for(int element : input) {
				if(input[Math.abs(element)-1]>0) {
					input[Math.abs(element-1)] *= -1;
				} else {
					System.out.print(Math.abs(element)+"  ");
				}
			}
		}
	}
	/**
	 * 
	 * 
	 * @param a
	 * 
	 */
	public static void main(String a[]) {
		PermutationsOfAString permutationsOfAString  =
				new PermutationsOfAString();
		String input  ="kanaparthi";
		
		int gcdOfNumbers =
				permutationsOfAString.gcd(10, 15);
		System.out.println(" gcd of numbers is "+gcdOfNumbers);
		
		List<String> allPermutations =
				permutationsOfAString.getAllPermutations(input, "", 
						input, new ArrayList<String>());
//		if(allPermutations!=null && allPermutations.size()>0) {
//			allPermutations.forEach(element->System.out.println(element+" "));
//		}
		
		String reverseString = permutationsOfAString.getReverseOfAString(input);
		System.out.println(" The Reverse of a String is "+ reverseString);
		
		String reverseUsingCharArray =
				permutationsOfAString.reverseArrayUsingCharArray(input);
		System.out.println(" The Reverse of the String using Char Array is "
				+ reverseUsingCharArray);
		
		String binaryNumber =
				permutationsOfAString.convertDecimalToBinary(15);
		System.out.println(" The Binary Represenation "
				+ "of the Decimal Number "+15 +" is "+binaryNumber);
		
		String compressedString  =
				permutationsOfAString.compressString("hello");
		System.out.println(" The compressed String  "+compressedString);
		
		int[] inputArray = new int[] {1,4,4,3,2};
		permutationsOfAString.printRepeatingElements(inputArray);
	}
	
}
