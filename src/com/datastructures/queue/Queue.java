/**
 * 
 */
package com.datastructures.queue;

import java.util.NoSuchElementException;

/**
 * @author kkanaparthi
 * 
 * This class implements Queue, which supports the following operations
 * 
 * add - Adds the Specified element to the head of the Queue
 * remove - Removes the specified element from the Head Of the Queue
 * peek - This method checks the element at the Head of the Queue, without removing it
 * isEmpty - This method checks if the given Queue is empty.
 * 
 */
public class Queue {

	//firstNode denotes to the headNode at the front of the queue
	//In case of removal this firstNode is removed first.
	private StackNode firstNode;
	
	//lastNode denotes to the tailNode at the tail end of the queue
	//In case of additions this node is updated with the latest Node.
	private StackNode lastNode;
	
	
	/**
	 * This is the main method that calls the
	 * business methods for Queue operations.
	 * 
	 * @param a
	 */
	public static void main(String a[]) {
		Queue queueClient = new Queue();
		queueClient.add(1);
		queueClient.add(2);
		queueClient.add(3);
		queueClient.add(4);
		queueClient.add(5);

		queueClient.printQueueElements();
		
		queueClient.remove();
		queueClient.remove();
		
		System.out.println("\n Now the Elements are Removed from the Queue ");
		
		queueClient.printQueueElements();

	}
	
	
	/**
	 * This method adds the newNode to the Tail of the
	 * Queue
	 * @param newNode
	 */
	public void add(int data) {
		StackNode newNode = new StackNode(data);
		if(firstNode==null) {
			firstNode = newNode;
			return;
		}
		if(lastNode==null) {
			lastNode = newNode;
			firstNode.setNextNode(newNode);
		} else {
			lastNode.setNextNode(newNode);
			lastNode = newNode;

		}
	}
	
	
	
	/**
	 * This method prints the Queue Elements
	 * starting from the Head of the Queue to
	 * the Tail of the Queue.
	 * 
	 */
	public void printQueueElements() {
		
		StackNode headPointer = firstNode;
		StackNode tailPointer = lastNode;
		
		if(headPointer==null) {
			throw new NoSuchElementException();
		}
		if(tailPointer==null) {
			System.out.println(" =>"+ 
					headPointer.getData());
		} else {
			if(headPointer!=null) {
				System.out.println(" => "+ headPointer.getData());
			}
			while(headPointer.getNextNode()!=null) {
				headPointer = headPointer.getNextNode();
				int nodeData = headPointer.getData();
				System.out.println(" => "+ nodeData);
			}

		}
	}
	
	
	/**
	 * This method removes the element from the Head of the Queue
	 * 
	 */
	public void  remove() {
		if(firstNode==null) {
			throw new NoSuchElementException();
		}
		if(firstNode.getNextNode()==null) {
			firstNode = null;
			lastNode = null;
		} else {
			firstNode = firstNode.getNextNode();
		}
	}
}

/**
 * This class denotes the Queue Node or Element
 * 
 * @author kkanaparthi
 *
 */
class StackNode {
	
	private int data;
	private StackNode nextNode;
	
	
	StackNode(int data) {
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
	 * @return the nextNode
	 */
	public StackNode getNextNode() {
		return nextNode;
	}
	/**
	 * @param pNextNode the nextNode to set
	 */
	public void setNextNode(StackNode pNextNode) {
		nextNode = pNextNode;
	}
	
	
}