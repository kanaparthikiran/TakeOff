package com.gof.design.patterns.strategy;

public class HDLDeliveryDateRange extends AbstractDeliveryDateRange
			implements IDeliveryDateRange {

	public HDLDeliveryDateRange() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getDeliveryDateRange() {
		// TODO Auto-generated method stub
		return HDL_DELIVERY_DATE_RANGE;
	}

	@Override
	public String getDeliveryType() {
		// TODO Auto-generated method stub
		return HDL_DELIVERY_DATE_TYPE;
	}

}
