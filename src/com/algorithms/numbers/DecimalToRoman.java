/**
 * 
 */
package com.algorithms.numbers;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * @author kkanaparthi
 *
 */
public class DecimalToRoman {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Get Roman Equivalent "+getRoman(12));
	}

	private static String getRoman(int number) {
		 Map<Integer, String> map = new LinkedHashMap<>();
		  map.put(100, "C");
		  map.put(90, "XC");
		  map.put(50, "L");
		  map.put(40, "XL");
		  map.put(10, "X");
		  map.put(9, "IX");
		  map.put(5, "V");
		  map.put(4, "IV");
		  map.put(1, "I");
		  if(number<=0){
			   return "not defined";
			  }
		  String romanEqui="";
		  for (Map.Entry<Integer, String> entry : map.entrySet()) {
			  int key = entry.getKey();
			  if(number/key!=0){
				  for (int i = 0; i < (number/key); i++) {
					     romanEqui +=  map.get(key);
				   }
				  number = number % key;
			  }
		  }
		  return romanEqui;
	}
}
