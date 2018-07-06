/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class CoinInsertedState implements VendingMachineState {

	private VendingMachine vendingMachine;
	
	public CoinInsertedState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	@Override
	public void insertCoin() {
		System.out.println(" Coin Inserted ");
	}

	@Override
	public void dispenseItem() {
		System.out.println(" Item Dispensed ");
	}

}
