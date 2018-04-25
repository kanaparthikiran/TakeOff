/**
 * 
 */
package com.gof.design.patterns.abstractfactory;

/**
 * @author Kiran Kanaparthi
 *
 */
public class GiftCardFactory extends PaymentAbstractFactory {

	@Override
	public CreditCard getCreditCard() {
		return null;
	}

	@Override
	public GiftCard getGiftCard() {
		return new GiftCard("This is GiftCard Factory");
	}

}
