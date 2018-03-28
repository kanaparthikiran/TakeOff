/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public abstract class BeverageDecorator implements Beverage {

	protected Beverage beverage;
	
	/**
	 * 
	 */
	public BeverageDecorator() {
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return 0;
	}

	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return null;
	}

	/**
	 * @return the beverage
	 */
	public Beverage getBeverage() {
		return beverage;
	}

	/**
	 * @param pBeverage the beverage to set
	 */
	public void setBeverage(Beverage pBeverage) {
		beverage = pBeverage;
	}

}
