/**
 * 
 */
package com.design.patterns.strategy;

/**
 * @author kkanaparthi
 *
 */
public class UPSDeliveryDateManager extends AbstractDeliveryDateManager
			implements IDeliveryDateManager {

	private IDeliveryDateRange deliveryDateRange;
	
	/**
	 * 
	 */
	public UPSDeliveryDateManager() {
		deliveryDateRange  = new UPSDeliveryDateRange();

	}

	/* (non-Javadoc)
	 * @see com.design.patterns.strategy.IDeliveryDateManager#getMiracleDate()
	 */
	@Override
	public String getMiracleDate() {
		
		return UPS_MIRACLE_DATE;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.strategy.IDeliveryDateManager#getOffset()
	 */
	@Override
	public int getOffset() {
		return UPS_OFFSET;
	}

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

}
