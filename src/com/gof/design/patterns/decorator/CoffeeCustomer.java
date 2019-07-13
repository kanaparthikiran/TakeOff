/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class CoffeeCustomer {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Beverage beverage = new Expresso();
		Beverage mocha = new Mocha(beverage);
		Beverage finalDrink = new Mocha(mocha);
		System.out.println(" Beverage Description "+ finalDrink.description());
		System.out.println(" Beverage Price "+ finalDrink.price());
	}

}
