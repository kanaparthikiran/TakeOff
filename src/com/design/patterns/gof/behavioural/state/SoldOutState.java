/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SoldOutState implements VendingMachineState {
	private VendingMachine vendingMachine;
	
	public SoldOutState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispenseItem() {
		// TODO Auto-generated method stub
		
	}

}
