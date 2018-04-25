/**
 * 
 */
package com.gof.design.patterns.abstractfactory;

/**
 * @author Kiran Kanaparthi
 *
 */
public class GiftCard extends GiftCardFactory {
	
	private String cardType;
	
	/**
	 * 
	 */
	public GiftCard(String cardType) {
		this.cardType = cardType;
	}



}
