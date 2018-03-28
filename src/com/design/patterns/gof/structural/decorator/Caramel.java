/**
 * 
 */
package com.design.patterns.gof.structural.decorator;

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
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getCost()
	 */
	@Override
	public double getCost() {
		// TODO Auto-generated method stub
		return getBeverage().getCost()+3.50;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.structural.decorator.Beverage#getDescription()
	 */
	@Override
	public String getDescription() {
		// TODO Auto-generated method stub
		return getBeverage().getDescription()+ " Akhil likes Caramel";
	}

}
