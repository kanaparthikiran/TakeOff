/**
 * 
 */
package com.test.patterns.visitor;

/**
 * @author kkanaparthi
 *
 */
public class HDLDeliveryDate implements IDeliveryDate {

	/**
	 * 
	 */
	public HDLDeliveryDate() {
	}

	@Override
	public String getDeliveryDate() {
		return "This is HDL Delivery Date";
	}

	
	public static void main(String a[]) {
		Integer inA = new Integer(5);
		
		System.out.println(" The Integer Value is  for Object "+ (inA.getClass().getName().equalsIgnoreCase("Object")));
		
		System.out.println(" The Integer Value is "+ (inA instanceof Integer));

	}
}
