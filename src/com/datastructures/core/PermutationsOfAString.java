/**
 * 
 */
package com.datastructures.core;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 * 
 * This class prints all the permutations of a String
 * 
 * It chooses a character, and uses recursive approach to find the remaining 
 * elements
 * 
 */
public class PermutationsOfAString {
	

	/**
	 * This method gets all the permutations of a String
	 * 
	 * @param prefix
	 * @param suffix
	 * @return
	 */
	private List<String> getPermutationsOfString
			(String prefix,String suffix,List<String> allPermutations ) {
		 	if(suffix.length()==0) {
		    	allPermutations.add(prefix+suffix);
		    	//System.out.println(" Base Case "+ prefix+suffix);
		 	} else {
			 for(int i=0;i<suffix.length();i++) {
				 String s = suffix.substring(0, i)+suffix.substring(i+1,suffix.length());
				 getPermutationsOfString(prefix+suffix.charAt(i),
						 s,allPermutations);
			 }
		 	}
		 return allPermutations;
	} 
	
	
	private List<String> getPermutationsOfAString
				(String prefix,String suffix,List<String> allStrings) {
		if(suffix.length()==0) {
			allStrings.add(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String s = suffix.substring(0,i)+suffix.substring(i+1,suffix.length());
				getPermutationsOfAString(prefix+suffix.charAt(i),s,allStrings);
			}
		}
		return allStrings;
	}
	
	
	private static void genAll(List<String> allPermutations,String prefix,String suffix) {
		if(suffix.length()==0) {
			allPermutations.add(prefix+suffix);
		}
		for(int i=0;i<suffix.length();i++) {
			String element = suffix.substring(0,i)+suffix.substring(i+1);
			genAll(allPermutations, prefix+suffix.charAt(i), element);
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		PermutationsOfAString permutationsOfAString  = new PermutationsOfAString();
		String inputString = "abcd";
//		List<String> allPermutationsOfString = 
//				permutationsOfAString.getPermutationsOfString("", 
//						inputString,new ArrayList<String>());
		System.out.println("Printing all Permutations of the String ");
		List<String> results = new ArrayList<String>();
		genAll(results,"","abcd");
		results.forEach(element->System.out.println(element));
//		if(!allPermutationsOfString.isEmpty()) {
//			allPermutationsOfString.forEach(element->System.out.println( " " +element));
//			
//		}
//		
//		(permutationsOfAString).getPermutationsOfAString("","abcd",new ArrayList<String>());
		
		int [] array = new int[]{1,4,5,6,9,11,12};
		
		int maxElement =array[0];
		
		int secondMaxElement=array[1];
		
		for(int element : array) {
			if(element>maxElement) {
				secondMaxElement = maxElement;
				maxElement = element;
			} else if(element>secondMaxElement) {
				secondMaxElement = element;
			}
		}
		System.out.println("Max Element "+maxElement+" second Max Element "+secondMaxElement
				+" difference between them "+(maxElement-secondMaxElement));
		
	}

}
