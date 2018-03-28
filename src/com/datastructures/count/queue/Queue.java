/**
 * 
 */
package com.datastructures.count.queue;

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
	private Node firstNode;
	
	//lastNode denotes to the tailNode at the tail end of the queue
	//In case of additions this node is updated with the latest Node.
	private Node lastNode;
	
	
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
		
		System.out.println("\n Now the Elements are Removed from the Queue ");
		
		queueClient.printQueueElements();

	}
	
	
	/**
	 * This method adds the newNode to the Tail of the
	 * Queue
	 * @param newNode
	 */
	public void add(int data) {
		Node newNode = new Node(data);
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
		
		Node headPointer = firstNode;
		Node tailPointer = lastNode;
		
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
class Node {
	
	private int data;
	private Node nextNode;
	
	
	Node(int data) {
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
	public Node getNextNode() {
		return nextNode;
	}
	/**
	 * @param pNextNode the nextNode to set
	 */
	public void setNextNode(Node pNextNode) {
		nextNode = pNextNode;
	}
	
	
}