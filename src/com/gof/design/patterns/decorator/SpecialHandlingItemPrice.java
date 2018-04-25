/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SpecialHandlingItemPrice extends PriceDecorator {

	protected ItemPrice price;
	
	/**
	 * 
	 */
	public SpecialHandlingItemPrice(ItemPrice price) {
		super(price);
	}

	@Override
	public String getPrice() {
		String price = super.getPrice()
				+" This is Special Handling Price ";
		return price;
	}
	
}
