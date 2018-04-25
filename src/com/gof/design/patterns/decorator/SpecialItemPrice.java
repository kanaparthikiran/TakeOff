/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SpecialItemPrice extends PriceDecorator {

	protected ItemPrice price;
	
	/**
	 * 
	 */
	public SpecialItemPrice(ItemPrice price) {
		super(price);
	}

	@Override
	public String getPrice() {
		String basePrice = super.getPrice();
		String price = basePrice+" Plus "+ " This is Special Item Price ";
		return price;
	}


}
