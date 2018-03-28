/**
 * 
 */
package com.design.patterns.gof.behavioural.strategy;

import java.util.Date;

/**
 * @author kkanaparthi
 *
 */
public class DeliveryDateContext {
	
	private DeliveryDateStrategy deliveryDateStrategy;

	/**
	 * 
	 */
	public DeliveryDateContext() {
	}


	/**
	 * @return the deliveryDateStrategy
	 */
	public DeliveryDateStrategy getDeliveryDateStrategy() {
		return deliveryDateStrategy;
	}


	/**
	 * @param pDeliveryDateStrategy the deliveryDateStrategy to set
	 */
	public void setDeliveryDateStrategy(DeliveryDateStrategy pDeliveryDateStrategy) {
		deliveryDateStrategy = pDeliveryDateStrategy;
	}
	
	
	public Date getDeliveryDate(DeliveryDateStrategy deliveryDateStrategy) {
	
		return null;
	}

}





