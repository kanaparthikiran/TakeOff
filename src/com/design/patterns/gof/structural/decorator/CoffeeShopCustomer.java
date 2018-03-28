/**
 * 
 */
package com.design.patterns.gof.structural.decorator;

/**
 * @author kkanaparthi
 *
 */
public class CoffeeShopCustomer {

	/**
	 * 
	 */
	public CoffeeShopCustomer() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Latte beverage = new Latte();
		beverage.setBeverage(new Espresso());
		
		System.out.println(" The Cost of Latte With Espresso is "+ beverage.getCost()
		+"\n  "+beverage.getDescription());
		
	}

}
