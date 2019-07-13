/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Latte implements Beverage {
	private  Beverage beverage;

	public Latte(Beverage beverage) {
		this.beverage = beverage;
	}

	@Override
	public int price() {
		return beverage.price()+2;
	}

	@Override
	public String description() {
		return beverage.description()+" This is Latte ";
	}

}
