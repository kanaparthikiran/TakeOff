/**
 * 
 */
package com.resto.comparator.objectpool;

import java.lang.reflect.Field;
import java.util.ArrayList;

/**
 * @author kkanaparthi
 *
 */
public class MultiThreadedClient {

	/**
	 * 
	 */
	public MultiThreadedClient() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("The Thead Client IS Started");

	    Field[] members = MultiThreadedClient.class.getClass().getFields(); //Some method like this

	    if(members!=null) {
	    	System.out.println(" members Size is "+members.length);

	    	for(Field elem: members) {
		    	System.out.println(" The Field Element is  "+ elem);

	    	}
	    }
	    
		for(int i=0;i<1;i++) {
			RHObectPool op = new RHObectPool(i);
			
			System.out.println("I is started "+i);

		}
		System.out.println("The Thead Client IS completed");
	}

}
