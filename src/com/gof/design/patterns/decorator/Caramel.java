/**
 * 
 */
package com.gof.design.patterns.decorator;

/**
 * @author kkanaparthi
 *
 */
public class Caramel extends BeverageDecorator {

	
	/**
	 * 
	 */
	public Caramel() {
	}
	
	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return getBeverage().getCost()+3.50;
	}

	/* (non-Javadoc)
	 * @see com.gof.design.patterns.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getBeverage().getDescription()+ " Akhil likes Caramel";
	}

}
