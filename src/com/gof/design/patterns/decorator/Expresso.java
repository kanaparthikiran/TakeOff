/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Expresso implements Beverage {



	@Override
	public int price() {
		return 1;
	}

	@Override
	public String description() {
		return "Espresso";
	}

}
