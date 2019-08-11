/**
 * 
 */
package com.alogorithms.dp;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author kkanaparthi
 *
 */
public class Test {

	/**
	 * @param args
	 * @throws ParseException 
	 */
	public static void main(String[] args) throws ParseException {
		Map<String,List<String>> map = new HashMap<>();	
		map.put("A", Arrays.asList("B,C"));
		map.put("B", Arrays.asList("D,E"));
		map.put("C", Arrays.asList("F,G"));
		map.put("H", Arrays.asList("I"));
		//printAllData(map, new ArrayList<>());
		
		Map<String,Object> mapa = new HashMap<>();	
		mapa.put("A", Arrays.asList("B,C"));
		mapa.put("B", Arrays.asList("D,E"));
		mapa.put("C", Arrays.asList("F,G"));
		mapa.put("H", Arrays.asList("I"));
		hashMapper(mapa);
	}
	
	
//	private static void printAllData(Map<String,List<String>> map,List<String> list) {
//		Queue<String> data = new LinkedList();
//		
//		for(String element : map.keySet()) {
//			if(map.containsKey(element)) {
//				printAllData(map, map.get(element));
//				System.out.println(map.get(element));
//				map.remove(element);
//			} else {
//				return;
//			}
//		}
//	}
	
	public static void hashMapper(Map<String, Object> lhm1) throws ParseException {
	    for (String s : lhm1.keySet()) {
//	        String key = entry.getKey();
//	        Object value = entry.getValue();
	        //if (value instanceof List) {
	       //      System.out.println(value);
	        //} else  {
	        	//if (value instanceof List) {
	         //   Map<String, Object> subMap = (List<String, Object>)value;
	           // hashMapper(subMap);
	        }
//	        else {
//	             throw new IllegalArgumentException(String.valueOf(value));
//	        }

	    }
	
}
