/**
 * 
 */
package com.datastructures.stack;

import java.util.Arrays;
import java.util.List;

/**
 * This method adds a new method to stack called min() 
 * with O(1) time complexity
 * 
 * @author kkanaparthi
 *
 */
public class StackWithMiniumOperation {

	private Node topOfStackNode;
	private Node minOfStackNode = new Node(Integer.MAX_VALUE);
    private static   List<Character> charArray = Arrays.asList('(','{','[');

	/**
	 * This method adds the element to the Top Of the Stack
	 * 
	 */
	public void push(int data) {
		Node newNode = new Node(data);
		if(topOfStackNode==null) {
			topOfStackNode = newNode;
			updateMinNodeOfStack(newNode);
		} else {
			updateMinNodeOfStack(newNode);
			newNode.setNext(topOfStackNode);
			topOfStackNode = newNode;

		}
	}

	/**
	 * @param newNode
	 */
	private void updateMinNodeOfStack(Node newNode) {
		int min = minOfElements(minOfStackNode, newNode);
		System.out.println(" min returned is "+min+ " on topOfStackNode "
				+minOfStackNode.getData()+" "+newNode.getData());
		minOfStackNode.setData(min);
	}

	/**
	 * This method prints all the Stack Elements 
	 * 
	 */
	public void printStackElements() {
		
		Node pointerNode = topOfStackNode;
		
		if(pointerNode==null) {
			System.out.println(" The Stack is Null/Empty ");
		} else {
			System.out.println(" = "+pointerNode.getData());
			
			while(pointerNode.getNext()!=null) {
				pointerNode = pointerNode.getNext();
				System.out.println(" = "+ pointerNode.getData());

			}
		}
	}
	/**
	 * This method finds the Minimum of all the Nodes in the Stack
	 * 
	 * @return
	 */
	public Node minOfStack() {
		System.out.println(" The minimum of the Stack"
				+ "  Elements is "+ minOfStackNode.getData());
		return minOfStackNode;
	}
	
	
	/**
	 * 
	 * @return
	 */
	private int minOfElements(Node minNode,Node newNode) {
		if(minNode!=null && newNode!=null) {
			return Math.min(minNode.getData(), newNode.getData());
		}
		return Integer.MAX_VALUE;
	}

	/**
	 * This is the main method that calls the other Business methods.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		StackWithMiniumOperation stackWithMin = new StackWithMiniumOperation();
		stackWithMin.push(2);
		stackWithMin.push(4);
		stackWithMin.push(5);
		stackWithMin.push(9);
		stackWithMin.push(6);
		stackWithMin.push(16);
		stackWithMin.push(26);
		stackWithMin.push(36);
		stackWithMin.push(8);

		stackWithMin.printStackElements();
		
		System.out.println(" The Minimum of the Stack is "+ 
				stackWithMin.minOfStack().getData());
		
	}

}


