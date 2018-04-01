/**
 * 
 */
package com.core.comparator;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author kkanaparthi
 *
 */
public class One {

	public static void main(String a[]) {
		
		System.out.println("STARTED TO PRINT THE VALUES");
		
//		try(Scanner scanner = new   Scanner(System.in)) {
//			
//			int n  = scanner.nextInt();
//			System.out.println("User Entered "+n);
//			int fact = 1;
//			for(int i=2;i<=n;i++)  {
//				fact = fact*(i);
//				//System.out.println("i now is "+i+" fact "+fact);
//			}
//		}
		
		double power1 = java.lang.Math.pow(10,100);
		System.out.println("power1 Value is  "+power1 );
		
		long startTimeHashtable = System.currentTimeMillis();
				
		Hashtable<String, String> ht = new Hashtable<>();
		for(int i=0;i<Integer.MAX_VALUE;i++) {
			ht.put(String.valueOf(i),String.valueOf(i));
		}
		
		for(String key : ht.keySet()) {
			System.out.print(ht.get(key));
		}
		
		long endTimeHashtable = System.currentTimeMillis();

		System.out.println(" Total time for the Map set and get "
		+ (endTimeHashtable-startTimeHashtable)+" "+" Milli Seconds ");
		
		long startTimeMap= System.currentTimeMillis();

		ConcurrentHashMap<String, String> map = new ConcurrentHashMap<>();
		for(int i=0;i<100000000;i++) {
			map.put(String.valueOf(i),String.valueOf(i));
		}
		
		for(String key : map.keySet()) {
			System.out.print(ht.get(key));
		}
		
		long endTimeMap = System.currentTimeMillis();
		System.out.println(" Total time for the Map set and get "
		+ (endTimeMap-startTimeMap)+" "+" Milli Seconds ");
	}
	
	/**
	 * 
	 */
	public One() {
	}

}
