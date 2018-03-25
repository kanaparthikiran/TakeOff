/**
 * 
 */
package com.test.patterns.decorator;

import java.util.Scanner;

/**
 * @author kkanaparthi
 *
 */
public class GumBallMachine {

	private static final String STATE_NO_COIN = "noCoin";
	private static final String STATE_COIN = "coinPresent";
	private static final String STATE_PROCESSING = "processing";
	private static final String STATE_INITIALIZED = "initialized";
	private static final String STATE_GUMS_DISPENSED = "dispensed";

	private String currentState = null;
	private int totalInventory =10;
	private int totalMoneyAvailable = 20;
	
	/**
	 * 
	 */
	public void printMachineLifeCycle(String currentState) {
		this.currentState = currentState;
		if(STATE_INITIALIZED.equalsIgnoreCase(currentState)) {
			System.out.println("Machine is Initialized");
			currentState = STATE_NO_COIN;
		} 
		
		if(STATE_NO_COIN.equalsIgnoreCase(currentState)) {
			System.out.println("Please Insert a Coin");
			System.out.println("Total Money Available BEFORE this Purchase  is  "+totalMoneyAvailable);
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			if(acceptMoneyInserted()>0 && totalMoneyAvailable>0) {
		//		System.out.println("Money is Accepted Successfully, will change the Machine's State");
				currentState = STATE_COIN;
				totalMoneyAvailable--;
				System.out.println("Total Money Available After this Purchase  is  "+totalMoneyAvailable);
			}  else {
				System.out.println("After all the Money is Spent, Stay at this State ");
				currentState = STATE_NO_COIN;
			}
		} 
	
		if(STATE_COIN.equalsIgnoreCase(currentState)) {
			System.out.println("Coin is Inserted, Now Will "
					+ " Dispense the Gums");
			currentState = STATE_PROCESSING;
		} 
		
		if(STATE_PROCESSING.equalsIgnoreCase(currentState)) {
			System.out.println("Dispensing the Gums");
			currentState = STATE_GUMS_DISPENSED;
		} 


		
		if(STATE_GUMS_DISPENSED.equalsIgnoreCase(currentState)) {
			System.out.println("Gums are Dispensing "+" O O O O "
					+" so Do NOT try to insert another coin\n\n\n");
			currentState = STATE_INITIALIZED;

		} 
		
		
	}
	
	
	/**
	 * 
	 */
	public GumBallMachine() {
	}

	private int acceptMoneyInserted() {
		int userInsertedMoney = 1;

//		try(Scanner scanner = new Scanner(System.in)) {
//			while(scanner.hasNext()) {
//				if(scanner.hasNextInt()) {
//					System.out.println("Now Enter the Money To Begin Purchase Process, Waiting for Money ");
//
//					userInsertedMoney = scanner.nextInt();
//					System.out.println("User Entered the Money "+userInsertedMoney);
//					break;
//				} else {
//					System.out.println("Waiting for Money");
//				}
//			}
////			scanner.close();
//		//	Thread.sleep(5000);
////		} catch (InterruptedException e) {
////			e.printStackTrace();
//		}

		return userInsertedMoney;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		GumBallMachine gbm = new GumBallMachine();
		while(true) {
			gbm.printMachineLifeCycle(STATE_INITIALIZED);
		}
		
	}

}
