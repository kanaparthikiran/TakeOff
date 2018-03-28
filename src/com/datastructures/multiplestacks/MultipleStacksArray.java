/**
 * 
 */
package com.datastructures.multiplestacks;

/**
 * @author kkanaparthi
 *
 * This class operates on three Stacks such that
 * each of the Stack Operation will need to check for the Stack Value, and 
 * do the similar operation on that Stack.
 *
 * The Array is divided into 3 segments for the 3 stacks
 *
 */
public class MultipleStacksArray {


	private int numberOfStacks = 3;
	
	private int array[]  = new int[20];
	
	private int stackCapacity = 6;
	
	
	/**
	 * This method adds the given element on to the
	 * given Stack Number
	 * 
	 */
	public void addElement(int stackNumber,int element) {
//		if(getStackTopIndex(stackNumber)>) {
//			throw new RuntimeException(" The Stack is Full");	
//		}
		
	}
	
	
	/**
	 * This method prints all the elements of the Stack Number
	 * 
	 * @param stackNumber
	 */
	public void printElements(int stackNumber) {
		
	}
	
	/**
	 * This method finds the Top of the Stack Index 
	 * for the given Stack
	 * @return
	 */
	private int getStackTopIndex(int stackNumber) {
		int tosIndex = 0;
		if(array!=null) {
			 tosIndex = stackNumber * array.length;
		}
		return tosIndex;
	}
	
	/**
	 * This method finds if the given Stack Number is Full
	 * @param stackNumber
	 * @return
	 */
	public boolean isFull(int stackNumber) {
		if(getStackTopIndex(stackNumber)==stackNumber) {
			return true;
		}
		return false;
	}
	
//	/**
//	 * 
//	 * @return
//	 */
//	private int getStackCapacity(int stackNumber) {
//		
//	}
//	
//	
//	/**
//	 * This method finds if the given Stack Number is Empty or not
//	 * 
//	 * @return
//	 */
//	public boolean isEmpty(int stackNumber) {
//		
//	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {

	}

}
