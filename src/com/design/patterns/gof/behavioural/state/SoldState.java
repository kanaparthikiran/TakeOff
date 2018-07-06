/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class SoldState implements VendingMachineState {

	
	private VendingMachine vendingMachine;
	
	public SoldState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	@Override
	public void insertCoin() {
		vendingMachine.setState(vendingMachine.getCoinInsertedState());
	}

	@Override
	public void dispenseItem() {
		vendingMachine.dispenseItem();
	}

}
