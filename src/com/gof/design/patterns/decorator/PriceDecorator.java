/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author Kiran Kanaparthi
 *
 */
public class PriceDecorator implements ItemPrice {

	protected ItemPrice itemPrice;
	
	/**
	 * 
	 */
	public PriceDecorator(ItemPrice itemPrice) {
		this.itemPrice = itemPrice;
	}

	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.
	 * ItemPrice#getPrice()
	 */
	@Override
	public String getPrice() {
		String itemPriceValue = itemPrice.getPrice();
		return itemPriceValue;
	}

	/**
	 * @return the itemPrice
	 */
	public ItemPrice getItemPrice() {
		return itemPrice;
	}

	/**
	 * @param itemPrice the itemPrice to set
	 */
	public void setItemPrice(ItemPrice itemPrice) {
		this.itemPrice = itemPrice;
	}

}
