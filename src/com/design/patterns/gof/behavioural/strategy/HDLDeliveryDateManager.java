/**
 * 
 */
package com.design.patterns.gof.behavioural.strategy;

/**
 * @author kkanaparthi
 *
 */
public class HDLDeliveryDateManager  extends AbstractDeliveryDateManager
		implements IDeliveryDateManager {

	/**
	 * 
	 */
	public HDLDeliveryDateManager() {
		deliveryDateRange  = new HDLDeliveryDateRange();
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.behavioural.strategy.IDeliveryDateManager#getMiracleDate()
	 */
	@Override
	public String getMiracleDate() {
		return HDL_MIRACLE_DATE;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.behavioural.strategy.IDeliveryDateManager#getOffset()
	 */
	@Override
	public int getOffset() {
		return HDL_OFFSET;
	}

}
