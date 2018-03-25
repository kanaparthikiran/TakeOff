/**
 * 
 */
package com.test.count.stack;

import java.util.EmptyStackException;

/**
 * @author kkanaparthi
 *
 * This class Implements Stack Operations
 * 
 * Node defines the Node or Element for the Stack
 * Each node has a data value, and the next Pointer 
 * to the Next Element of the Stack
 * 
 * The Stack supports basic operations
 * Push -   to add Elements on Top of the Stack
 * Pop - to Remove the Element from the Top of the Stack
 * isEmpty - checks if the Stack is Empty
 * Peek - returns the top of the Stack element without removing
 * Print - This method prints the Elements of the Stack, starting from the TopOfStack
 * 
 */
class Stack {

	private Node topOfStack;
	
	
	/**
	 * This method peeks or gets the 
	 * TopOfTheStack Element Value, 
	 * without actually removing it
	 * 
	 * @return
	 */
	public Node peek() {
		if(topOfStack==null) {
			throw new EmptyStackException();
		} 
		return topOfStack;
		
	}
	
	
	/**
	 * This method finds if the Given Stack is Empty
	 * 
	 * @return
	 */
	public boolean isEmptyStack() {
		return (topOfStack==null);
	}

	
	
	/**
	 * This method pushes new Elements 
	 * to the Top Of the Stack 
	 */
	public void push(int data) {
		
		System.out.println("Started  push() ");

		Node newNode = new Node(data);
		
		if(topOfStack==null) {
			topOfStack = newNode;
		} else {
			newNode.next = topOfStack;
			topOfStack = newNode;
		}
		System.out.println(" Element with Value "+ data+"  is Pushed"
				+ "  on to the Stack ");
	}
	
	
	/**
	 * This method prints all the elements of the Stack 
	 * starting from the Top Of The Stack
	 */
	public void printAllElements() {
		if(topOfStack==null) {
			throw new EmptyStackException();
		} 
		Node printNode = topOfStack;
		System.out.println(" topOfStack initially "+topOfStack.getData());
		
		while(printNode.next!=null) {
			System.out.println("= "+ printNode.getData());
			printNode = printNode.next;
		}

		System.out.println("= "+ printNode.getData());

	}
	
	/**
	 * This method removes the TopOfTheStack Element
	 * from the Top Of the Stack, the Next Element
	 * if present will become the Top Of Stack.
	 */
	public Node pop() {
		if(topOfStack==null) {
			throw new EmptyStackException();
		}
		System.out.println(" topOfStack  "+topOfStack.getData());
		
		topOfStack = topOfStack.next;

		System.out.println(" Removed the Top Of the Stack"
	+ "  Element with Value "+topOfStack);
		return topOfStack;
	}
	
	/**
	 * This is the main method that calls the Business Methods.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
			Stack stackClient = new Stack();
			stackClient.push(1);
			stackClient.push(2);
			stackClient.push(3);
			stackClient.push(4);
			stackClient.push(5);
			stackClient.push(6);

			stackClient.printAllElements();
			
			stackClient.pop();
			
			System.out.println(" Printing the Stack Elements for the second time ");
			stackClient.printAllElements();

	}
	
	
}


/**
 * This class denotes the node or Element of the Stack
 * 
 * @author kkanaparthi
 *
 */
class Node {
	
	 int data;
	 Node next;
	
	public Node(int data) {
		this.data = data;
	}

	/**
	 * @return the data
	 */
	public int getData() {
		return data;
	}

	/**
	 * @param pData the data to set
	 */
	public void setData(int pData) {
		data = pData;
	}

	/**
	 * @return the next
	 */
	public Node getNext() {
		return next;
	}

	/**
	 * @param pNext the next to set
	 */
	public void setNext(Node pNext) {
		next = pNext;
	}
}