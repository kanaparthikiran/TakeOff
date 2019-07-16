/**
 * 
 */
package com.datastructures.queue;

import java.util.EmptyStackException;

/**
 * @author kkanaparthi
 *
 */
public class QueueUsingTwoStacks {

	private Stack stackNewest;
	private Stack stackOldest;
	
	/**
	 * Constructor for Initializing the two Stacks for
	 * MyQueue Internal implementation
	 * 
	 * @param stackNewest
	 * @param stackOldest
	 */
	private QueueUsingTwoStacks(Stack stackNewest,Stack stackOldest) {
		this.stackNewest = stackNewest;
		this.stackOldest = stackOldest;
	}

	/**
	 * This method adds the Queue Elements using the two stacks
	 * 
	 * @param data
	 */
	public void add(int data) {
		if(stackNewest!=null) {
			stackNewest.push(data);
		}
	}
	
	/**
	 * This method removes the element from the Queue head
	 * using the two internal Stacks
	 * 
	 */
	public void remove() {
		if(stackOldest!=null && stackNewest!=null) {
			while(!stackNewest.isEmptyStack()) {
				stackOldest.push(stackOldest.pop().getData());
			}
			StackNode nodeToRemove = stackNewest.pop();
			System.out.println(" The Node to remove is "+ 
					nodeToRemove.getData());
		}
	}
	
	/**
	 * This method gets the Head Of the Queue Element
	 * without actually removing it from the Queue
	 */
	public StackNode peek() {
		if(stackOldest!=null && stackNewest!=null &&
				stackOldest.isEmptyStack()) {
			while(stackNewest.isEmptyStack()) {
				stackOldest.push(stackOldest.pop().getData());
			}
		}
		return  stackOldest.peek();
	}

	
	/**
	 * This method prints all the Queue elements
	 * using the two internal stacks
	 */
	public void printAllQueueElements() {
		if(stackNewest!=null) {
			stackNewest.printAllElements();
		}
//		if(stackOldest!=null) {
//			stackOldest.printAllElements();
//		}
	}
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Stack oldestStack = new Stack();
		Stack newestStack = new Stack();
		QueueUsingTwoStacks queueUsingTwoStacks = 
				new QueueUsingTwoStacks(oldestStack,newestStack);
		queueUsingTwoStacks.add(3);
		queueUsingTwoStacks.add(4);
		queueUsingTwoStacks.add(5);
		queueUsingTwoStacks.add(6);
		queueUsingTwoStacks.add(16);
		queueUsingTwoStacks.add(36);
		queueUsingTwoStacks.add(26);
		queueUsingTwoStacks.printAllQueueElements();

	}

}


class Stack {

	private StackNode topOfStack;
	
	
	/**
	 * This method peeks or gets the 
	 * TopOfTheStack Element Value, 
	 * without actually removing it
	 * 
	 * @return
	 */
	public StackNode peek() {
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

		StackNode newNode = new StackNode(data);
		
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
		StackNode printNode = topOfStack;
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
	public StackNode pop() {
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
class StackNode {
	
	 int data;
	 StackNode next;
	
	public StackNode(int data) {
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
	public StackNode getNext() {
		return next;
	}

	/**
	 * @param pNext the next to set
	 */
	public void setNext(StackNode pNext) {
		next = pNext;
	}
}
