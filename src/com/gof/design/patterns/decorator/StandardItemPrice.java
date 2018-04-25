/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author Kiran Kanaparthi
 *
 */
public class StandardItemPrice implements ItemPrice {

	
	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.
	 * ItemPrice#getPrice()
	 */
	@Override
	public String getPrice() {
		String price = " This is the Item's Standard Price ";
		return price;
	}

}
