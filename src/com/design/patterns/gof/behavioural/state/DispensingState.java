/**
 * 
 */
package com.design.patterns.gof.behavioural.state;

/**
 * @author Kiran Kanaparthi
 *
 */
public class DispensingState implements VendingMachineState {

	
	private VendingMachine vendingMachine;
	
	public DispensingState(VendingMachine vendingMachine) {
		this.vendingMachine = vendingMachine;
	}
	
	/* (non-Javadoc)
	 * @see com.design.patterns.gof.behavioural.state.VendingMachineState#insertCoin()
	 */
	@Override
	public void insertCoin() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see com.design.patterns.gof.behavioural.state.VendingMachineState#dispenseItem()
	 */
	@Override
	public void dispenseItem() {
		// TODO Auto-generated method stub

	}

}
