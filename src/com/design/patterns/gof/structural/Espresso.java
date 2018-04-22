/**
 * 
 */
package com.design.patterns.gof.structural;

/**
 * @author kkanaparthi
 *
 */
public class Espresso implements Beverage {

	/**
	 * 
	 */
	public Espresso() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 1.0;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Espresso is for Everyone";
	}

}
