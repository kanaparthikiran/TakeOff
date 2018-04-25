/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author Kiran Kanaparthi
 *
 */
public class ItemPriceClient {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		
		ItemPrice itemPrice = 
				new SpecialItemPrice(new StandardItemPrice());
		
		System.out.println("\n The itemPrice instance is "
				+ itemPrice.getClass().getName());
		
		String itemPriceValue = 
				itemPrice.getPrice();
		
		System.out.println(" The Item Price "
				+ " Value for the Given Item is "
				+ itemPriceValue);
	}

}
