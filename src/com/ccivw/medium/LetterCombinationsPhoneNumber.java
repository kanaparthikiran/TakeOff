/**
 * 
 */
package com.ccivw.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author kkanaparthi
 *
 */
public class LetterCombinationsPhoneNumber {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		getAllCombinations("27753").stream().forEach
			(element->System.out.println(element));
		
	}
	
	private static List<String> wordList = Arrays.asList("development","apple");

	private static List<String> getAllCombinations(String digits) {
		List<String> results = new ArrayList<>();
		StringBuilder sb = new StringBuilder();
		Map<Character,char[]> phoneData = createPhoneData();
		getPhoneCombinationsHelper(digits,sb,phoneData,results);
		return results;
	}
	
	private static void getPhoneCombinationsHelper(String digits,StringBuilder sb,
			Map<Character,char[]> phoneData,List<String> results) {
		if(digits.length()==sb.length()) {
			if(wordList.contains(sb.toString())) {
				results.add(sb.toString());
			}
			return;
		}
		for(Character charElement : phoneData.get(digits.charAt(sb.length()))) {
			sb.append(charElement);
			getPhoneCombinationsHelper(digits, sb, phoneData, results);
			sb.deleteCharAt(sb.length()-1);
		}
	}
	
	private static Map<Character,char[]> createPhoneData() {
		Map<Character,char[]> charData = new HashMap<>();
		charData.put('0', new char[] {});
		charData.put('1', new char[] {});
		charData.put('2', new char[] {'a','b','c'});
		charData.put('3', new char[] {'d','e','f'});
		charData.put('4', new char[] {'g','h','i'});
		charData.put('5', new char[] {'j','k','l'});
		charData.put('6', new char[] {'m','n','o'});
		charData.put('7', new char[] {'p','q','r','s'});
		charData.put('8', new char[] {'t','u','v'});
		charData.put('9', new char[] {'w','x','y','z'});
		return charData;
	}
}
