/**
 * 
 */
package com.design.patterns.gof.behavioural.strategy;

/**
 * @author kkanaparthi
 *
 */
public class StrategyClient {

	/**
	 * 
	 */
	public StrategyClient() {
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		IDeliveryDateManager deliveryDateManager1 = new HDLDeliveryDateManager();
		
		IDeliveryDateManager deliveryDateManager2 = new UPSDeliveryDateManager();

		System.out.println(" Miracle Date is  "+  deliveryDateManager1.getMiracleDate());
		
		System.out.println(" Miracle Date is  "+  deliveryDateManager2.getMiracleDate());

		
//		IDeliveryDateRange deliveryDateRange = new HDLDeliveryDateRange();
//		
//		String deliveryDateRangeMessage  = deliveryDateRange.getDeliveryDateRange();
//		
//		System.out.println("The Delivery Date Range Is  "+ deliveryDateRangeMessage);
//		
//		deliveryDateRange = new UPSDeliveryDateRange();
//		
//		System.out.println("222 The Delivery Date Range Is  "+ deliveryDateRange.getDeliveryDateRange());

		
	}

}
