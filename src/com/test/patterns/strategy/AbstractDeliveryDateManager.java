/**
 * 
 */
package com.test.patterns.strategy;

/**
 * @author kkanaparthi
 *
 */
public class AbstractDeliveryDateManager implements IDeliveryDateManager {

	public String HDL_MIRACLE_DATE="HDL Miracle Date";
	public String UPS_MIRACLE_DATE="UPS Miracle Date";
	
	public int UPS_OFFSET=9;
	public int HDL_OFFSET=20;

	/**
	 * @return the deliveryDateRange
	 */
	public IDeliveryDateRange getDeliveryDateRange() {
		return deliveryDateRange;
	}

	/**
	 * @param deliveryDateRange the deliveryDateRange to set
	 */
	public void setDeliveryDateRange(IDeliveryDateRange deliveryDateRange) {
		this.deliveryDateRange = deliveryDateRange;
	}

	IDeliveryDateRange deliveryDateRange;
	
	/**
	 * 
	 */
	public AbstractDeliveryDateManager() {
	}

	/* (non-Javadoc)
	 * @see com.test.patterns.strategy.IDeliveryDateManager#getMiracleDate()
	 */
	@Override
	public String getMiracleDate() {
		
		return getDeliveryDateRange().getDeliveryDateRange();
	}

	/* (non-Javadoc)
	 * @see com.test.patterns.strategy.IDeliveryDateManager#getOffset()
	 */
	@Override
	public int getOffset() {
		return 0;
	}

}
