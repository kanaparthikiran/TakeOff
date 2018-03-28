/**
 * 
 */
package com.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Latte extends BeverageDecorator {

	/**
	 * 
	 */
	public Latte() {
		// TODO Auto-generated constructor stub
	}

	
	/* (non-Javadoc)
	 * @see com.design.patterns.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return getBeverage().getCost()+2.0;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getBeverage().getDescription() +" I Like Latte";
	}
	
	
}
