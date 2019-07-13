/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Mocha implements Beverage {

	private  Beverage beverage;

	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
	@Override
	public int price() {
		return beverage.price()+3;
	}

	@Override
	public String description() {
		return beverage.description()+ " This is Mocha" ;
	}

}
