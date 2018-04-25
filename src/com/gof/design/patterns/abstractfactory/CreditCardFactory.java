/**
 * 
 */
package com.gof.design.patterns.abstractfactory;

/**
 * @author Kiran Kanaparthi
 *
 */
public class CreditCardFactory extends PaymentAbstractFactory {

	/**
	 * 
	 */
	public CreditCardFactory() {
	}

	@Override
	public CreditCard getCreditCard() {
		return new CreditCard("This is Credit card");
	}

	@Override
	public GiftCard getGiftCard() {
		return null;
	}

}
