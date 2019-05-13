/**
 * 
 */
package com.datastructures.string;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kkanaparthi
 *
 */
public class AddTwoBinaryStrings {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String result = addTwoBinary("101", "110");
		System.out.println(" Result of Adding two Binary strings is "+result);
		getAllPermutations("", "test", new ArrayList<String>()).stream().
			forEach(System.out::println);
	}

	
	private static List<String> getAllPermutations(String prefix,
			String suffix,List<String> allItems) {
		if(suffix==null || suffix.isEmpty()) {
			allItems.add(prefix+suffix);
			System.out.println("Adding string to list "+prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String print = suffix.substring(0, i)+suffix.substring(i+1);
				getAllPermutations(prefix+suffix.charAt(i), print, allItems);
			}
		}
		return allItems;
	}
	
	private List<String> printAllPerm(String prefix,String suffix,List<String> allItems) {
		if(suffix==null || suffix.length()==0) {
			allItems.add(prefix+suffix);
		} else {
			for(int i=0;i<suffix.length();i++) {
				String print = suffix.substring(0,i)+suffix.substring(i+1);
				printAllPerm(prefix+suffix.charAt(i), print, allItems);
			}
		}
		return allItems;
	}
	
	/**
	 * 
	 * @param s1
	 * @param s2
	 * @return
	 */
	private static String addTwoBinary(String s1,String s2) {
		String result = "";
		int digitSum = 0;
		
		return result;
	}
}
