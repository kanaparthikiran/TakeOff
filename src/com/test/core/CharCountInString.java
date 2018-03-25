/**
 * 
 */
package com.test.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kkanaparthi
 *
 */
public class CharCountInString {

	/**
	 * 
	 */
	public CharCountInString() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CharCountInString ccs  = new CharCountInString();
		ccs.countChars("HelloWelcome");
		
		int n  =345;
		System.out.println("n modulus is "+ n%10+" n division is  "+345/10);
		System.out.println("Sum of All Digits  "+  ccs.sumOfAllDigits(567));
	}
	
	private void mapElemsWithCount(Map<Character,Integer> mapCount)  {
		for(Character keyElem :  mapCount.keySet())  {
			System.out.println("The Element "+ keyElem+" And Count is "+mapCount.get(keyElem));
			if(mapCount.get(keyElem)>=2) {
				System.out.println("*******  Character Repeated Is  " +keyElem );
			}
		}
	}

	private void countChars(String inStr) {
		char[]  charArray  = inStr.toCharArray();
		Map<Character,Integer> mapForCount  = new ConcurrentHashMap<Character,Integer>();
		
		for(Character charElem  : charArray)  {
			if(mapForCount.containsKey(charElem))  {
				mapForCount.put(charElem, mapForCount.get(charElem)+1);
			} else {
				mapForCount.put(charElem, 1);
			}
		}
		mapElemsWithCount(mapForCount);
	}
	
	private int sumOfAllDigits(int num) {
		int sum =  0;
		while(num>0) {
			sum  = sum + num%10;
			num = num/10;
			System.out.println("num at each step   "+num);
		}
		return sum;
	}
}
