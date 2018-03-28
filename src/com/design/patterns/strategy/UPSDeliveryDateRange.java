/**
 * 
 */
package com.design.patterns.strategy;

/**
 * @author kkanaparthi
 *
 */
public class UPSDeliveryDateRange extends AbstractDeliveryDateRange 
			implements IDeliveryDateRange {

	
	/**
	 * 
	 */
	public UPSDeliveryDateRange() {
		
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.strategy.IDeliveryDateRange#getDeliveryDateRange()
	 */
	@Override
	public String getDeliveryDateRange() {
		return UPS_DELIVERY_DATE_RANGE;
	}

	/* (non-Javadoc)
	 * @see com.design.patterns.strategy.IDeliveryDateRange#getDeliveryType()
	 */
	@Override
	public String getDeliveryType() {
		return UPS_DELIVERY_DATE_TYPE;
	}

}
