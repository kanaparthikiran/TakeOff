/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class VendingMachine {
	
	public String getState() {
		return state.getClass().getName();
	}

	public void setSoldOutState(VendingMachineState soldOutState) {
		this.soldOutState = soldOutState;
	}

	public void setSoldState(VendingMachineState soldState) {
		this.soldState = soldState;
	}

	public void setDispenseState(VendingMachineState dispenseState) {
		this.dispenseState = dispenseState;
	}

	public void setCoinInsertedState(VendingMachineState coinInsertedState) {
		this.coinInsertedState = coinInsertedState;
	}

	public VendingMachineState getSoldOutState() {
		return soldOutState;
	}

	public VendingMachineState getSoldState() {
		return soldState;
	}

	public VendingMachineState getDispenseState() {
		return dispenseState;
	}

	public VendingMachineState getCoinInsertedState() {
		return coinInsertedState;
	}

	private VendingMachineState soldOutState;
	private VendingMachineState soldState;
	private VendingMachineState dispenseState;
	private VendingMachineState coinInsertedState;

	public void setState(VendingMachineState state) {
		this.state = state;
	}

	private VendingMachineState state;
	
	public VendingMachine(int itemCount) {
		soldOutState = new SoldOutState(this);
		soldState = new SoldState(this);
		dispenseState = new DispensingState(this);
		coinInsertedState = new CoinInsertedState(this);
		if(itemCount>0) {
			state = new SoldState(this);
		}
	}
	
	/**
	 * 
	 */
	public void insertCoin() {
		state.insertCoin();
	}
	

	
	public void dispenseItem() {
		System.out.println(" Dispensing Item ");
	}
	
	
	public void ejectCoin() {
		System.out.println(" Ejecting Coin ");
	}
	

}
