/**
 * 
 */
package com.test.patterns.visitor;

/**
 * @author kkanaparthi
 *
 */
public class UPSDeliveryDate implements IDeliveryDate {

	/**
	 * 
	 */
	public UPSDeliveryDate() {

	}

	
	@Override
	public String getDeliveryDate() {
		return "This is UPSDelivery Date";
	}

}
