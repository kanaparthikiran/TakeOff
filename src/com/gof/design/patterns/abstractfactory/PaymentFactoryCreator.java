/**
 * 
 */
package com.gof.design.patterns.abstractfactory;

import javax.swing.JFormattedTextField.AbstractFormatterFactory;

/**
 * @author Kiran Kanaparthi
 *
 */
public class PaymentFactoryCreator {

	/**
	 * 
	 */
	public PaymentFactoryCreator() {
	}
	
	public PaymentAbstractFactory getFactory(String factoryType) {
		if(factoryType=="giftCard") {
			return new GiftCardFactory();
		} else if(factoryType=="creditCard") {
			return new CreditCardFactory();
		} else {
			return new CreditCardFactory();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
