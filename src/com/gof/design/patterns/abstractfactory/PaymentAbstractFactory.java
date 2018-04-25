/**
 * 
 */
package com.gof.design.patterns.abstractfactory;

/**
 * @author Kiran Kanaparthi
 *
 */
public abstract class PaymentAbstractFactory {

	public abstract CreditCard getCreditCard();
	public abstract GiftCard getGiftCard();

}
