/**
 * 
 */
package com.gof.design.patterns.visitor;

/**
 * @author Kiran Kanaparthi
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
