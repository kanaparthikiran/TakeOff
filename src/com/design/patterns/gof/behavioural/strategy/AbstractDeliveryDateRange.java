package com.design.patterns.gof.behavioural.strategy;

public class AbstractDeliveryDateRange implements IDeliveryDateRange {
	
	public static final String HDL_DELIVERY_DATE_RANGE="This is HDL Delivery Date Range Message";
	public static final String UPS_DELIVERY_DATE_RANGE="This is UPS Delivery Date Range Message";

	public static final String HDL_DELIVERY_DATE_TYPE="This is HDL Delivery Date Type";
	public static final String UPS_DELIVERY_DATE_TYPE="This is UPS Delivery Date Type";


	public AbstractDeliveryDateRange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDeliveryDateRange() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getDeliveryType() {
		// TODO Auto-generated method stub
		return null;
	}

}
