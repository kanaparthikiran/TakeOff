/**
 * 
 */
package com.design.patterns.gof.structural.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Decaf implements Beverage {

	/**
	 * 
	 */
	public Decaf() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 2.00;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return "Decaf is For Health Conscious People";
	}

}
