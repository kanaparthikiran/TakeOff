/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class Customer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		VendingMachine vendingMachine = new VendingMachine(5);
		vendingMachine.insertCoin();
		System.out.println(" Vending Machine State "+ vendingMachine.getState());

		vendingMachine.dispenseItem();
		System.out.println(" Vending Machine State "+ vendingMachine.getState());
		
	}

}
