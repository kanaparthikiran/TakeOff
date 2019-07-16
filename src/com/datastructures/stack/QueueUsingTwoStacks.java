/**
 * 
 */
package com.datastructures.stack;


/**
 * @author kkanaparthi
 *
 */
public class QueueUsingTwoStacks {

	private Stack stackNewest;
	private Stack stackOldest;
	java.util.Stack a;
	
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
				stackOldest.push(stackNewest.pop().getData());
			}
			Node nodeToRemove = stackNewest.pop();
			System.out.println(" The Node to remove is "+ nodeToRemove.getData());
		}
	}
	
	/**
	 * This method gets the Head Of the Queue Element
	 * without actually removing it from the Queue
	 */
	public Node peek() {
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
